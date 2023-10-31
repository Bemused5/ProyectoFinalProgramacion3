/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.UInterfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.Normalizer;
import java.util.Arrays;

/**
 *
 * @author Damian Carmona
 */
public class Nivel1 extends JFrame implements ActionListener{
    private String[] palabras = {"adn", "celula", "Bacteria", "ecosistema", "clorofila", "organo"};
    private String[] significados = {
            "Sigla de ácido desoxirribonucleico, proteína compleja que se encuentra en el núcleo de las células",
            "Unidad estructural y funcional de los seres vivos",
            "Organismo microscópico unicelular, carente de núcleo, que se multiplica por división celular sencilla o por esporas.",
            "Conjunto de especies de un área determinada que interactúan entre ellas y con su ambiente abiótico",
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

    public Nivel1 () {

        setLayout(new BorderLayout()); // Important for organizing the components
        JPanel panelSopa = new JPanel(new GridLayout(10, 10));
        botones = new JButton[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
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
            String significado = significados[index];
            JOptionPane.showMessageDialog(this, "¡Encontraste la palabra!\nSignificado: " + significado);
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
