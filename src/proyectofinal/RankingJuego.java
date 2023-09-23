/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class RankingJuego extends Usuario {

    public ArrayList<String> obtenerRanking(int juegoID) {
        ArrayList<String> ranking = new ArrayList<>();
        try {
            Connection con = ConexionABase.inicializaBaseDeDatos();
            Statement oracion = con.createStatement();
            ResultSet rs = oracion.executeQuery("SELECT * FROM puntuaciones WHERE juego_id=" + juegoID + " ORDER BY puntuacion DESC");

            while (rs.next()) {
                String usuario = rs.getString("usuario_id");
                int puntuacion = rs.getInt("puntuacion");
                ranking.add("Usuario: " + usuario + " Puntuación: " + puntuacion);
            }

            oracion.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ranking;
    }
}