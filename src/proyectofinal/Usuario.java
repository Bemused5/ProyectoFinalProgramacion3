/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;  // Importa Statement para usar Statement.RETURN_GENERATED_KEYS
import java.util.Scanner;

public class Usuario {
    String nombre;
    String usuario;
    int usuarioID;
    int userTipe = 2;  // Valor por defecto
    Scanner entrada = new Scanner(System.in);

    public int registrarUsuario(String nombre, String usuario) {
        usuarioID = 0;

        try {
            Connection con = ConexionABase.inicializaBaseDeDatos();

            // Verifica si el usuario ya existe
            PreparedStatement checkStmt = con.prepareStatement("SELECT usuario_id FROM usuarios WHERE nombre_de_usuario = ?");
            checkStmt.setString(1, usuario);
            ResultSet rs = checkStmt.executeQuery();

            if (!rs.next()) {
                // Inserta el nuevo usuario
                PreparedStatement insertStmt = con.prepareStatement("INSERT INTO usuarios(nombre, nombre_de_usuario, userTipe) VALUES (?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
                insertStmt.setString(1, nombre);
                insertStmt.setString(2, usuario);
                insertStmt.setInt(3, userTipe);  // Insertar el valor por defecto de userTipe
                insertStmt.executeUpdate();

                // Obtener el ID generado
                ResultSet generatedKeys = insertStmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    usuarioID = generatedKeys.getInt(1);
                    System.out.println(usuarioID+"primerCheck");
                }
            }
            System.out.println(usuarioID);

            // Cerrar las conexiones y resultados
            rs.close();
            checkStmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuarioID;
    }

    public int hacerLogin(char[] contrasena) {
        usuario = new String(contrasena);

        int idRetornado = 0; // Valor predeterminado en caso de fallo
        userTipe=0;

        try {
            Connection con = ConexionABase.inicializaBaseDeDatos();  // Asume que tienes una clase ConexionABase que hace esto
            PreparedStatement checkStmt = con.prepareStatement("SELECT usuario_id FROM usuarios WHERE nombre_de_usuario = ?");
            checkStmt.setString(1, usuario);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                idRetornado = rs.getInt("usuario_id");
            } else {
                System.out.println("Usuario no encontrado.");
            }

            // Cerrar las conexiones y resultados
            rs.close();
            checkStmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return idRetornado;
    }
    public int hacerLogin2(char[] contrasena) {
        usuario = new String(contrasena);

        int idRetornado = 0; // Valor predeterminado en caso de fallo
        userTipe = 0; // Reiniciar a un valor por defecto

        try {
            Connection con = ConexionABase.inicializaBaseDeDatos();

            // Ajuste en la consulta SQL para seleccionar también userTipe
            PreparedStatement checkStmt = con.prepareStatement("SELECT usuario_id, userTipe FROM usuarios WHERE nombre_de_usuario = ?");
            checkStmt.setString(1, usuario);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                idRetornado = rs.getInt("usuario_id");
                userTipe = rs.getInt("userTipe");  // Recuperar el valor de userTipe de la base de datos
            } else {
                System.out.println("Usuario no encontrado.");
            }

            // Cerrar las conexiones y resultados
            rs.close();
            checkStmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return userTipe;
    }

}
