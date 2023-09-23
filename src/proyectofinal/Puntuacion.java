/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
}

