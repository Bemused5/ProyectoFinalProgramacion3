/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Puntuacion {
    int userID;
    int juegoID;
    int puntuacion;

    public void almacenarPuntuacion(int juegoID, int puntuacion, int id) {
        userID=id;
        try {
            Connection con = ConexionABase.inicializaBaseDeDatos();
            PreparedStatement stmnt = con.prepareStatement("INSERT INTO puntuaciones(usuario_id, juego_id, puntuacion) VALUES (?, ?, ?)");
            stmnt.setInt(1,userID);
            stmnt.setInt(2, juegoID);
            stmnt.setInt(3, puntuacion);
            stmnt.executeUpdate();
            stmnt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Map<String, ArrayList> obtenerPuntuacionesPorUsuarioYJuego(int usuarioID, int juegoID){
        ArrayList<Integer> puntuaciones = new ArrayList<>();
        ArrayList<Timestamp> fechas = new ArrayList<>();
        try {
            
            Connection con = ConexionABase.inicializaBaseDeDatos();
            PreparedStatement stmnt = con.prepareStatement(
                    "SELECT puntuacion, fecha FROM puntuaciones WHERE usuario_id = ? AND juego_id = ? ORDER BY fecha DESC");
            stmnt.setInt(1, usuarioID);
            stmnt.setInt(2, juegoID);
            ResultSet rs = stmnt.executeQuery();

            
            while (rs.next()) {
                puntuaciones.add(rs.getInt("puntuacion"));
                fechas.add(rs.getTimestamp("fecha"));
            }


            rs.close();
            stmnt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        Map<String, ArrayList> map = new HashMap<>();
        map.put("puntuaciones", puntuaciones);
        map.put("fechas", fechas);

        return map;
    }
}

