/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.UInterfaces.Judith;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.Normalizer;
import java.util.Arrays;
import proyectofinal.Puntuacion;
import proyectofinal.UInterfaces.Ranking;

/**
 *
 * @author Damian Carmona
 */

// Clase para el primer nivel del juego
public class Nivel1 extends JFrame implements ActionListener{
    private static int userIDF;
    private static int idJuegoF;
    // Arreglos de palabras y sus significados
    private String[] palabras = {"ADN", "CELULA", "BACTERIA", "CLOROFILA", "ORGANO"};
    private int puntuacion = 0; // Añadimos la variable puntuacion
    private String[] significados = {
            "Sigla de ácido desoxirribonucleico, proteína compleja que se encuentra en el núcleo de las células",
            "Unidad estructural y funcional de los seres vivos",
            "Organismo microscópico unicelular, carente de núcleo, que se multiplica por división celular sencilla o por esporas.",
            "Pigmento verde en las plantas",
            "Unidad funcional de un organismo multicelular que constituye una unidad estructural y realiza una función determinada."
    };
    private char[][] sopaLetras = {
            {'A', 'D', 'N', 'P', 'A', 'J', 'Z', 'B', 'Y', 'A'},     
            {'C', 'L', 'O', 'R', 'O', 'F', 'I', 'L', 'A', 'S'},
            {'O', 'P', 'T', 'G', 'S', 'A', 'D', 'F', 'H', 'G'},
            {'R', 'T', 'O', 'Z', 'M', 'N', 'T', 'R', 'E', 'U'},
            {'O', 'A', 'N', 'L', 'D', 'R', 'K', 'O', 'I', 'M'},
            {'Q', 'W', 'O', 'R', 'G', 'A', 'N', 'O', 'O', 'P'},
            {'F', 'G', 'H', 'J', 'K', 'L', 'Ñ', 'M', 'N', 'B'},
            {'C', 'E', 'L', 'U', 'L', 'A', 'Q', 'W', 'E', 'R'},
            {'S', 'D', 'F', 'G', 'H', 'J', 'Q', 'W', 'E', 'R'},
            {'Z', 'X', 'B', 'A', 'C', 'T', 'E', 'R', 'I', 'A'}
    };
    private JButton[][] botones;
    private JTextField textField;

    // Constructor de la clase
    public Nivel1 (int userID,int idJuego) {
        userIDF=userID;
        idJuegoF=idJuego;
        setTitle("Juego de Sopa de Letras");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel para la sopa de letras
        JPanel panelSopa = new JPanel(new GridLayout(10, 10));
        botones = new JButton[10][10];

        // Configurar botones de la sopa de letras
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                botones[i][j] = new JButton(String.valueOf(sopaLetras[i][j]));
                botones[i][j].setFont(new Font("SansSerif", Font.PLAIN, 12)); 
                botones[i][j].setForeground(Color.BLUE);
                panelSopa.add(botones[i][j]);
                botones[i][j].setEnabled(false);
            }
        }

        // Crear un panel inferior con etiqueta, campo de texto y botón de comprobación
        JPanel panelInferior = new JPanel();
        JLabel label = new JLabel("Encuentra la palabra:");
        textField = new JTextField(10);
        JButton botonComprobar = new JButton("Comprobar");
        botonComprobar.addActionListener(this);

        panelInferior.add(label);
        panelInferior.add(textField);
        panelInferior.add(botonComprobar);

        // Agregar los paneles a la ventana
        add(panelSopa, BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);

        // Hacer la ventana visible
        setVisible(true);
    }

// Método para manejar la acción del botón de comprobación
@Override
public void actionPerformed(ActionEvent e) {
    String palabraBuscada = textField.getText().toUpperCase();
    boolean encontrada = false;
    String significadoEncontrado = null; // Variable para almacenar el significado

    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            if (botones[i][j].getText().equals(palabraBuscada.substring(0, 1))) {
                if (buscarPalabra(i, j, palabraBuscada)) {
                    encontrada = true;
                    break;
                }
            }
        }
        if (encontrada) {
            break;
        }
    }

    if (encontrada) {
            int index = Arrays.asList(palabras).indexOf(palabraBuscada);
            if (index >= 0) {
                puntuacion += 10; // Incrementamos la puntuación
                String significado = significados[index];
                JOptionPane.showMessageDialog(this, "¡Encontraste la palabra!\nSignificado: " + significado);
                
                // Comprobamos si ha alcanzado los 50 puntos
                if (puntuacion == 50) {
                    Puntuacion puntuacionObj = new Puntuacion();
                    puntuacionObj.almacenarPuntuacion(idJuegoF, puntuacion, userIDF);
                    System.out.println("fin del juego");
                    Ranking ranking = new Ranking(userIDF,idJuegoF);
                    ranking.setVisible(true);
                    this.dispose();
                }
            }
    } else {
        JOptionPane.showMessageDialog(this, "Palabra no encontrada. Inténtalo de nuevo.");
    }
}


    private boolean buscarPalabra(int fila, int columna, String palabra) {
    int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    for (int dir = 0; dir < 8; dir++) {
        int k, rd = fila + dx[dir], cd = columna + dy[dir];
        for (k = 1; k < palabra.length(); k++) {
            if (rd >= 0 && rd < 10 && cd >= 0 && cd < 10 && palabra.charAt(k) == sopaLetras[rd][cd]) {
                rd += dx[dir];
                cd += dy[dir];
            } else {
                break;
            }
        }
        if (k == palabra.length()) {
            rd = fila;
            cd = columna;
            for (k = 0; k < palabra.length(); k++) {
                botones[rd][cd].setBackground(Color.GREEN);
                rd += dx[dir];
                cd += dy[dir];
            }
            return true;
        }
    }
    return false;
}

}
