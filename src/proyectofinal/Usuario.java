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
    Scanner entrada = new Scanner(System.in);

    public int registrarUsuario() {
        System.out.println("Dame tu nombre");
        nombre = entrada.nextLine();

        System.out.println("Dame tu nombre de usuario");
        usuario = entrada.nextLine();

        // Inicia el bloque try-catch para manejar las excepciones SQL
        try {
            Connection con = ConexionABase.inicializaBaseDeDatos(); // Asume que tienes una clase ConexionABase que hace esto
            // Verifica si el usuario ya existe
            PreparedStatement checkStmt = con.prepareStatement("SELECT usuario_id FROM usuarios WHERE nombre_de_usuario = ?");
            checkStmt.setString(1, usuario);
            ResultSet rs = checkStmt.executeQuery();

            if (!rs.next()) {
                // Inserta el nuevo usuario
                PreparedStatement insertStmt = con.prepareStatement("INSERT INTO usuarios(nombre, nombre_de_usuario) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);
                insertStmt.setString(1, nombre);
                insertStmt.setString(2, usuario);
                insertStmt.executeUpdate();

                // Obtener el ID generado
                ResultSet generatedKeys = insertStmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    usuarioID = generatedKeys.getInt(1);
                }
            } else {
                usuarioID = rs.getInt("usuario_id");
            }

            // Cerrar las conexiones y resultados
            rs.close();
            checkStmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuarioID;
    }

    public int hacerLogin() {
        System.out.println("Introduce tu nombre de usuario:");
        usuario = entrada.nextLine();

        int idRetornado = 0; // Valor predeterminado en caso de fallo

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
}
