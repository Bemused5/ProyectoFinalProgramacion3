/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.UInterfaces.Judith;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Juego2 {
    
    private static JFrame frame;
    private static int userIDF;
    private static int idJuegoF;
    public Juego2(int userID,int idJuego) {
        userIDF=userID;
        idJuegoF=idJuego;
        frame = new JFrame("Juego de Sopa de Letras");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(new GridLayout(4, 1));
        frame.add(panel);

        JLabel titleLabel = new JLabel("SOPA DE LETRAS");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(titleLabel);

        mostrarTexto(panel);
        lugarBotones(panel,frame);

        frame.setVisible(true);
        
    }
    public static void main(String[] args) {
        new Juego2(userIDF,idJuegoF);
    }

    private static void mostrarTexto(JPanel panel) {
        String texto = "Bienvenido a este juego, donde aprenderás conceptos variados de manera divertida " +
                "buscándolas en una sopa de letras, elige el nivel que deseas jugar, tienes 3 vidas " +
                "para poder completar cada juego, suerte!";
        JTextArea textArea = new JTextArea(texto);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));

        panel.add(textArea);
    }

    private static void lugarBotones(JPanel panel, JFrame frame) {
        JButton nivel1Button = new JButton("Nivel 1");
        JButton nivel2Button = new JButton("Nivel 2");

        nivel1Button.setBackground(new Color(128, 0, 128)); // Morado
        nivel2Button.setBackground(new Color(128, 0, 128)); // Morado

        nivel1Button.setForeground(Color.WHITE);
        nivel2Button.setForeground(Color.WHITE);

        nivel1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Nivel1 nivel1 = new Nivel1(userIDF,idJuegoF);
                nivel1.setVisible(true);
                frame.dispose();
            }
        });

        nivel2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Nivel2 nivel2 = new Nivel2(userIDF,idJuegoF);
                nivel2.setVisible(true);
                frame.dispose();
            }
        });

        panel.add(nivel1Button);
        panel.add(nivel2Button);
    }
    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }
}
