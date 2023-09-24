/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;

import java.util.Scanner;
import proyectofinal.UInterfaces.Inicio;
import proyectofinal.UInterfaces.Registro;

/**
 *
 * @author daasa
 */
public class ProyectoFinal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Usuario usuario = new Usuario();
        Puntuacion puntuacion = new Puntuacion();

        int id = 0; // Inicializar a un valor no válido
        
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        




        while (true) {
            System.out.println("Selecciona un juego (1 al 6) o escribe 'salir' para terminar:");
            String opcion = entrada.nextLine();

            if ("salir".equalsIgnoreCase(opcion)) {
                break;
            }


            int juegoID;
            try {
                juegoID = Integer.parseInt(opcion);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Intente de nuevo.");
                continue;
            }

            if (juegoID < 1 || juegoID > 6) {
                System.out.println("Número de juego no válido. Intente de nuevo.");
                continue;
            }

            // Aquí podrías añadir el código real del juego y obtener la puntuación real.
            // Por ahora, simplemente generamos una puntuación aleatoria para el ejemplo.
            int puntosObtenidos = (int) (Math.random() * 100);

            System.out.println("Has obtenido " + puntosObtenidos + " puntos en el juego " + juegoID);

            puntuacion.almacenarPuntuacion(juegoID, puntosObtenidos,id);
            RankingJuego ranking = new RankingJuego();
            ranking.obtenerRanking(juegoID);
        }

        entrada.close();
    }
}
