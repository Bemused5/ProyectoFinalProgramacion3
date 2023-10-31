/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.UInterfaces.Judith;

/**
 *
 * @author Damian Carmona
 */
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
public class Nivel2 extends JFrame implements ActionListener{
    private int puntuacion =0;
    private static int userIDF;
    private static int idJuegoF;
    private String[] palabras = {"ORBITA", "NUCLEO", "CELULA", "ECOSISTEMA", "HORMONA", "ATMOSFERA","GENETICA", "EVOLUCION", "OSMOSIS"};
    private String[] significados = {
            "Trayectoria curva que describe un cuerpo alrededor de otro debido a la acción de una fuerza gravitacional entre ellos.",
            "Es la parte central de un átomo, compuesta por protones y neutrones, alrededor de la cual orbitan los electrones.",
            "Unidad básica estructural y funcional de todos los seres vivos.",
            "Conjunto interdependiente de organismos y su entorno físico, interactuando como una unidad funcional.",
            "Sustancia química producida en pequeñas cantidades por ciertas células y liberada al torrente sanguíneo para ser transportada a otras partes del organismo, donde regula o modifica la función de otros órganos o tejidos.",
            "Envoltura gaseosa que rodea la Tierra u otro cuerpo celeste.",
            "Ciencia que estudia la herencia biológica y la variación de las características heredadas en los seres vivos a través de las generaciones. ",
            "Cambio en las características hereditarias de las poblaciones biológicas a lo largo de las generaciones. ",
            "Proceso físico en el cual un solvente se mueve desde una región de menor concentración de soluto a una de mayor concentración a través de una membrana semipermeable, hasta que se alcance el equilibrio.",
           
    };
    private char[][] sopaLetras = {
            {'E', 'C', 'O', 'S', 'I', 'S', 'T', 'E', 'M', 'A', 'L', 'A', 'R', 'O', 'S'},     
            {'A', 'T', 'M', 'O', 'S', 'F', 'E', 'R', 'A', 'S', 'K', 'A', 'A', 'A', 'T'},
            {'O', 'P', 'T', 'G', 'S', 'A', 'D', 'F', 'H', 'G', 'A', 'K', 'A', 'A', 'P'},
            {'R', 'T', 'O', 'Z', 'O', 'R', 'B', 'I', 'T', 'A', 'S', 'A', 'X', 'G', 'R'},
            {'O', 'A', 'N', 'G', 'E', 'N', 'E', 'T', 'I', 'C', 'A', 'A', 'A', 'S', 'O'},
            {'Q', 'W', 'O', 'R', 'G', 'A', 'N', 'O', 'O', 'P', 'A', 'A', 'S', 'K', 'K'},
            {'F', 'G', 'H', 'J', 'K', 'L', 'Ñ', 'M', 'N', 'B', 'A', 'A', 'A', 'A', 'P'},
            {'C', 'E', 'L', 'U', 'L', 'H', 'O', 'R', 'M', 'O', 'N', 'A', 'O', 'G', 'R'},
            {'S', 'D', 'F', 'G', 'H', 'J', 'Q', 'W', 'E', 'R','A', 'L', 'B', 'A', 'A'},
            {'Z', 'X', 'B', 'A', 'O', 'S', 'M', 'O', 'S', 'I', 'S', 'A', 'S', 'A', 'T'},
            {'Q', 'W', 'O', 'R', 'G', 'A', 'N', 'O', 'O', 'P','A', 'A', 'K', 'B', 'B'},
            {'F', 'G', 'H', 'J', 'K', 'L', 'Ñ', 'M', 'N', 'B', 'A', 'B', 'G', 'A', 'X'},
            {'C', 'E', 'L', 'U', 'L', 'A', 'Q', 'W', 'E', 'R', 'A', 'L', 'A', 'A', 'L'},
            {'N', 'U', 'C', 'L', 'E', 'O', 'Q', 'W', 'E', 'R', 'A', 'A', 'A', 'A', 'M'},
            {'Z', 'X', 'B', 'A', 'C', 'T', 'E', 'V', 'O', 'L','U', 'C', 'I', 'O', 'N'}
    };
    private JButton[][] botones;
    private JTextField textField;

    public Nivel2 (int userID,int idJuego) {
        userIDF=userID;
        idJuegoF=idJuego;
        setTitle("Juego de Sopa de Letras");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelSopa = new JPanel(new GridLayout(15, 15));
        botones = new JButton[15][15];

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                botones[i][j] = new JButton(String.valueOf(sopaLetras[i][j]));
                botones[i][j].setFont(new Font("SansSerif", Font.PLAIN, 12)); 
                botones[i][j].setForeground(Color.BLUE);
                panelSopa.add(botones[i][j]);
                botones[i][j].setEnabled(false);
            }
        }

        JPanel panelInferior = new JPanel();
        JLabel label = new JLabel("Encuentra la palabra:");
        textField = new JTextField(10);
        JButton botonComprobar = new JButton("Comprobar");
        botonComprobar.addActionListener(this);

        panelInferior.add(label);
        panelInferior.add(textField);
        panelInferior.add(botonComprobar);

        add(panelSopa, BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);

        setVisible(true);
    }


@Override
    public void actionPerformed(ActionEvent e) {
        String palabraBuscada = textField.getText().toUpperCase();
        boolean encontrada = false;

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
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
                if (puntuacion == 90) {
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
            if (rd >= 0 && rd < 15 && cd >= 0 && cd < 15 && palabra.charAt(k) == sopaLetras[rd][cd]) {
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
