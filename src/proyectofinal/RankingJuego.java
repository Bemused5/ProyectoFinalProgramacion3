/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.HashMap;


public class RankingJuego extends Usuario {
    public Map<String, ArrayList<String>> obtenerRanking(int juegoID){
    ArrayList<String> rankingNombres = new ArrayList<>();
    ArrayList<String> rankingPuntuaciones = new ArrayList<>();
    TreeMap<Integer, String> sortedRanking = new TreeMap<>(Comparator.reverseOrder());

    try {
        Connection con = ConexionABase.inicializaBaseDeDatos();
        Statement oracion1 = con.createStatement();
        Statement oracion2 = con.createStatement();  // Segunda oracion

        ResultSet rs = oracion1.executeQuery(
            "SELECT usuario_id, MAX(puntuacion) AS max_puntuacion " +
            "FROM puntuaciones WHERE juego_id=" + juegoID + " " +
            "GROUP BY usuario_id "
        );

        while (rs.next()) {
            String usuarioId = rs.getString("usuario_id");
            int maxPuntuacion = rs.getInt("max_puntuacion");

            ResultSet rsNombre = oracion2.executeQuery("SELECT nombre FROM usuarios WHERE usuario_id=" + usuarioId);  // Usar la segunda oracion
            if (rsNombre.next()) {
                String nombre = rsNombre.getString("nombre");
                sortedRanking.put(maxPuntuacion, nombre);
            }
            rsNombre.close();  // Cerrar el ResultSet secundario antes de la siguiente iteración
        }

        rs.close();          // Cerrar los ResultSets
        oracion1.close();    // Cerrar los Statements
        oracion2.close();
        con.close();         // Cerrar la conexión

        for (Map.Entry<Integer, String> entry : sortedRanking.entrySet()) {
            int puntuacion = entry.getKey();
            String nombre = entry.getValue();
            rankingNombres.add(nombre);
            rankingPuntuaciones.add(String.valueOf(puntuacion));
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

     // Aquí creamos un mapa para devolver ambos ArrayLists
    Map<String, ArrayList<String>> rankingMap = new HashMap<>();
    rankingMap.put("nombres", rankingNombres);
    rankingMap.put("puntuaciones", rankingPuntuaciones);
        
    return rankingMap;
    }
}
