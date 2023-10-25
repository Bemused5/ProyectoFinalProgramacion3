/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinal.UInterfaces;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import proyectofinal.Puntuacion;
import java.util.ArrayList;
import java.util.Random;
import static proyectofinal.UInterfaces.PuntuacionRonda.idJuegoF;
import static proyectofinal.UInterfaces.PuntuacionRonda.puntuacionF;
import static proyectofinal.UInterfaces.PuntuacionRonda.userIDF;
/**
 *
 * @author daasa
 */
public class MundoLiterario extends javax.swing.JFrame {
    private Theme darkTheme = new Theme(new Color(0, 0, 51), new Color(255, 255, 255), new Color(100, 100, 100));
    private Theme lightTheme = new Theme(new Color(255, 255, 255), new Color(0, 0, 0), new Color(200, 200, 200));
    private ImageIcon sunIcon = new ImageIcon(getClass().getResource("/proyectofinal/UInterfaces/resources/sun.png"));
    private ImageIcon moonIcon = new ImageIcon(getClass().getResource("/proyectofinal/UInterfaces/resources/moon.png"));
    private boolean isDarkMode = false;  // Variable para rastrear el tema actual
    
    private int playerX = 50; // posición inicial X del jugador
    private int playerY = 50; // posición inicial Y del jugador
    private JLabel playerDot; // representa el jugador en el mapa
    Timer tempo;
    int vidas = 3; // suponiendo que empiezas con 3 vidas
    private String respuestaCorrecta; // Almacena la respuesta correcta del nivel actual
    int puntos=0;
    int intentosNivel1=0;
    int intentosNivel2=0;
    int intentosNivel3=0;
    int intentosNivel4=0;
    int intentosNivel5=0;
    int intentosNivel6=0;
    int intentosNivel7=0;
    int intentosNivel8=0;
    int intentosNivel9=0;
    int intentosNivel10=0;
    int nivelSeleccionado=0;
    
    static int userIDF;
    static int idJuegoF;
    
    // Lista para mantener un registro de los números que ya han aparecido.
    private ArrayList<Integer> numerosGenerados;
    private Random random;


    int xMouse, yMouse;

    /**
     * Creates new form Inicio
     */
    public MundoLiterario(int idJuego,int userID) {
        initComponents();
        numerosGenerados = new ArrayList<>();
        random = new Random();
        userIDF=userID;
        idJuegoF= idJuego;
        applyTheme(lightTheme);
        jLabel6.setIcon(moonIcon);  // Establece el ícono inicial del sol
        jLabel15.setText(String.valueOf(puntos));
        jLabelPregunta.setVisible(false);
        jScrollPane1.setVisible(false); // Asumiendo que este es el contenedor de jLabelPregunta
        // Ocultar paneles de opciones
        jPanelOpcion1.setVisible(false);
        jPanelOpcion2.setVisible(false);
        jPanelOpcion3.setVisible(false);
        jPanelOpcion4.setVisible(false);
        
        // Agrega ActionListeners a los JTextFields
        ActionListener actionListener = (ActionEvent e) -> {
            try {
                verificarRespuesta(((JTextField) e.getSource()).getText());
            } catch (InterruptedException ex) {
                Logger.getLogger(MundoLiterario.class.getName()).log(Level.SEVERE, null, ex);
            }
        };

        jTextFieldOpcion1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
                ActionListener actionListener1 = actionListener;
            try {
                verificarRespuesta(((JTextField) e.getSource()).getText());
            } catch (InterruptedException ex) {
                Logger.getLogger(MundoLiterario.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        });
        jTextFieldOpcion2.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
                ActionListener actionListener1 = actionListener;
            try {
                verificarRespuesta(((JTextField) e.getSource()).getText());
            } catch (InterruptedException ex) {
                Logger.getLogger(MundoLiterario.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        });
        jTextFieldOpcion3.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
                ActionListener actionListener1 = actionListener;
            try {
                verificarRespuesta(((JTextField) e.getSource()).getText());
            } catch (InterruptedException ex) {
                Logger.getLogger(MundoLiterario.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        });
        jTextFieldOpcion4.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
                ActionListener actionListener1 = actionListener;
            try {
                verificarRespuesta(((JTextField) e.getSource()).getText());
            } catch (InterruptedException ex) {
                Logger.getLogger(MundoLiterario.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        });
        
        
    }
    public MundoLiterario() {}
    private void applyTheme(Theme theme) {
        jPanel1.setBackground(theme.backgroundColor);
        jLabel2.setForeground(theme.textColor);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        exitButton = new Clases.PanelRound();
        changeMode = new Clases.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        minimizeWindow = new Clases.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        panelNivel5 = new Clases.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        panelNivel2 = new Clases.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        panelNivel3 = new Clases.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        panelNivel4 = new Clases.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        panelNivel1 = new Clases.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        panelNivel10 = new Clases.PanelRound();
        jLabel13 = new javax.swing.JLabel();
        panelNivel7 = new Clases.PanelRound();
        jLabel10 = new javax.swing.JLabel();
        panelNivel8 = new Clases.PanelRound();
        jLabel11 = new javax.swing.JLabel();
        panelNivel6 = new Clases.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        panelNivel9 = new Clases.PanelRound();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabelPregunta = new javax.swing.JLabel();
        jLabelCorazon = new javax.swing.JLabel();
        jLabelVida = new javax.swing.JLabel();
        jPanelOpcion1 = new javax.swing.JPanel();
        jTextFieldOpcion1 = new javax.swing.JTextField();
        jPanelOpcion2 = new javax.swing.JPanel();
        jTextFieldOpcion2 = new javax.swing.JTextField();
        jPanelOpcion3 = new javax.swing.JPanel();
        jTextFieldOpcion3 = new javax.swing.JTextField();
        jPanelOpcion4 = new javax.swing.JPanel();
        jTextFieldOpcion4 = new javax.swing.JTextField();
        jLabelResultado = new javax.swing.JLabel();
        Temporizador = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(255, 51, 51));
        exitButton.setPreferredSize(new java.awt.Dimension(25, 25));
        exitButton.setRoundBottomLeft(100);
        exitButton.setRoundBottomRight(100);
        exitButton.setRoundTopLeft(100);
        exitButton.setRoundTopRight(100);
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButtonMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout exitButtonLayout = new javax.swing.GroupLayout(exitButton);
        exitButton.setLayout(exitButtonLayout);
        exitButtonLayout.setHorizontalGroup(
            exitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        exitButtonLayout.setVerticalGroup(
            exitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        changeMode.setBackground(new java.awt.Color(102, 0, 153));
        changeMode.setPreferredSize(new java.awt.Dimension(25, 25));
        changeMode.setRoundBottomLeft(100);
        changeMode.setRoundBottomRight(100);
        changeMode.setRoundTopLeft(100);
        changeMode.setRoundTopRight(100);
        changeMode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeModeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                changeModeMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changeModeMouseEntered(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/UInterfaces/resources/moon.png"))); // NOI18N

        javax.swing.GroupLayout changeModeLayout = new javax.swing.GroupLayout(changeMode);
        changeMode.setLayout(changeModeLayout);
        changeModeLayout.setHorizontalGroup(
            changeModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changeModeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );
        changeModeLayout.setVerticalGroup(
            changeModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changeModeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        minimizeWindow.setBackground(java.awt.Color.gray);
        minimizeWindow.setPreferredSize(new java.awt.Dimension(25, 25));
        minimizeWindow.setRoundBottomLeft(100);
        minimizeWindow.setRoundBottomRight(100);
        minimizeWindow.setRoundTopLeft(100);
        minimizeWindow.setRoundTopRight(100);
        minimizeWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeWindowMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeWindowMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeWindowMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout minimizeWindowLayout = new javax.swing.GroupLayout(minimizeWindow);
        minimizeWindow.setLayout(minimizeWindowLayout);
        minimizeWindowLayout.setHorizontalGroup(
            minimizeWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        minimizeWindowLayout.setVerticalGroup(
            minimizeWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(1247, Short.MAX_VALUE)
                .addComponent(minimizeWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(changeMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(changeMode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(minimizeWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 40));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel2.setText("y pon a prueba tus conocimientos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        panelNivel5.setBackground(new java.awt.Color(255, 51, 153));
        panelNivel5.setRoundBottomLeft(100);
        panelNivel5.setRoundBottomRight(100);
        panelNivel5.setRoundTopLeft(100);
        panelNivel5.setRoundTopRight(100);
        panelNivel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelNivel5MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("5");

        javax.swing.GroupLayout panelNivel5Layout = new javax.swing.GroupLayout(panelNivel5);
        panelNivel5.setLayout(panelNivel5Layout);
        panelNivel5Layout.setHorizontalGroup(
            panelNivel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNivel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelNivel5Layout.setVerticalGroup(
            panelNivel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNivel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        jPanel1.add(panelNivel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 470, 40, 40));

        panelNivel2.setBackground(new java.awt.Color(255, 51, 153));
        panelNivel2.setRoundBottomLeft(100);
        panelNivel2.setRoundBottomRight(100);
        panelNivel2.setRoundTopLeft(100);
        panelNivel2.setRoundTopRight(100);
        panelNivel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelNivel2MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("2");

        javax.swing.GroupLayout panelNivel2Layout = new javax.swing.GroupLayout(panelNivel2);
        panelNivel2.setLayout(panelNivel2Layout);
        panelNivel2Layout.setHorizontalGroup(
            panelNivel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNivel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        panelNivel2Layout.setVerticalGroup(
            panelNivel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNivel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        jPanel1.add(panelNivel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 610, 40, 40));

        panelNivel3.setBackground(new java.awt.Color(255, 51, 153));
        panelNivel3.setRoundBottomLeft(100);
        panelNivel3.setRoundBottomRight(100);
        panelNivel3.setRoundTopLeft(100);
        panelNivel3.setRoundTopRight(100);
        panelNivel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelNivel3MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("3");

        javax.swing.GroupLayout panelNivel3Layout = new javax.swing.GroupLayout(panelNivel3);
        panelNivel3.setLayout(panelNivel3Layout);
        panelNivel3Layout.setHorizontalGroup(
            panelNivel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNivel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelNivel3Layout.setVerticalGroup(
            panelNivel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNivel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        jPanel1.add(panelNivel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 610, -1, 40));

        panelNivel4.setBackground(new java.awt.Color(255, 51, 153));
        panelNivel4.setRoundBottomLeft(100);
        panelNivel4.setRoundBottomRight(100);
        panelNivel4.setRoundTopLeft(100);
        panelNivel4.setRoundTopRight(100);
        panelNivel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelNivel4MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("4");

        javax.swing.GroupLayout panelNivel4Layout = new javax.swing.GroupLayout(panelNivel4);
        panelNivel4.setLayout(panelNivel4Layout);
        panelNivel4Layout.setHorizontalGroup(
            panelNivel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNivel4Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        panelNivel4Layout.setVerticalGroup(
            panelNivel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNivel4Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(panelNivel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 520, -1, 40));

        panelNivel1.setBackground(new java.awt.Color(255, 51, 153));
        panelNivel1.setRoundBottomLeft(100);
        panelNivel1.setRoundBottomRight(100);
        panelNivel1.setRoundTopLeft(100);
        panelNivel1.setRoundTopRight(100);
        panelNivel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelNivel1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("1");

        javax.swing.GroupLayout panelNivel1Layout = new javax.swing.GroupLayout(panelNivel1);
        panelNivel1.setLayout(panelNivel1Layout);
        panelNivel1Layout.setHorizontalGroup(
            panelNivel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNivel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelNivel1Layout.setVerticalGroup(
            panelNivel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNivel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(panelNivel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 610, 40, 40));

        panelNivel10.setBackground(new java.awt.Color(255, 51, 153));
        panelNivel10.setRoundBottomLeft(100);
        panelNivel10.setRoundBottomRight(100);
        panelNivel10.setRoundTopLeft(100);
        panelNivel10.setRoundTopRight(100);
        panelNivel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelNivel10MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("10");

        javax.swing.GroupLayout panelNivel10Layout = new javax.swing.GroupLayout(panelNivel10);
        panelNivel10.setLayout(panelNivel10Layout);
        panelNivel10Layout.setHorizontalGroup(
            panelNivel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNivel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelNivel10Layout.setVerticalGroup(
            panelNivel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNivel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13))
        );

        jPanel1.add(panelNivel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 210, -1, 40));

        panelNivel7.setBackground(new java.awt.Color(255, 51, 153));
        panelNivel7.setRoundBottomLeft(100);
        panelNivel7.setRoundBottomRight(100);
        panelNivel7.setRoundTopLeft(100);
        panelNivel7.setRoundTopRight(100);
        panelNivel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelNivel7MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("7");

        javax.swing.GroupLayout panelNivel7Layout = new javax.swing.GroupLayout(panelNivel7);
        panelNivel7.setLayout(panelNivel7Layout);
        panelNivel7Layout.setHorizontalGroup(
            panelNivel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNivel7Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );
        panelNivel7Layout.setVerticalGroup(
            panelNivel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNivel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );

        jPanel1.add(panelNivel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 280, -1, 40));

        panelNivel8.setBackground(new java.awt.Color(255, 51, 153));
        panelNivel8.setRoundBottomLeft(100);
        panelNivel8.setRoundBottomRight(100);
        panelNivel8.setRoundTopLeft(100);
        panelNivel8.setRoundTopRight(100);
        panelNivel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelNivel8MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("8");

        javax.swing.GroupLayout panelNivel8Layout = new javax.swing.GroupLayout(panelNivel8);
        panelNivel8.setLayout(panelNivel8Layout);
        panelNivel8Layout.setHorizontalGroup(
            panelNivel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNivel8Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );
        panelNivel8Layout.setVerticalGroup(
            panelNivel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNivel8Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(panelNivel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 60, -1, 40));

        panelNivel6.setBackground(new java.awt.Color(255, 51, 153));
        panelNivel6.setRoundBottomLeft(100);
        panelNivel6.setRoundBottomRight(100);
        panelNivel6.setRoundTopLeft(100);
        panelNivel6.setRoundTopRight(100);
        panelNivel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelNivel6MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("6");

        javax.swing.GroupLayout panelNivel6Layout = new javax.swing.GroupLayout(panelNivel6);
        panelNivel6.setLayout(panelNivel6Layout);
        panelNivel6Layout.setHorizontalGroup(
            panelNivel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNivel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelNivel6Layout.setVerticalGroup(
            panelNivel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNivel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );

        jPanel1.add(panelNivel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 420, -1, 40));

        panelNivel9.setBackground(new java.awt.Color(255, 51, 153));
        panelNivel9.setRoundBottomLeft(100);
        panelNivel9.setRoundBottomRight(100);
        panelNivel9.setRoundTopLeft(100);
        panelNivel9.setRoundTopRight(100);
        panelNivel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelNivel9MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("9");

        javax.swing.GroupLayout panelNivel9Layout = new javax.swing.GroupLayout(panelNivel9);
        panelNivel9.setLayout(panelNivel9Layout);
        panelNivel9Layout.setHorizontalGroup(
            panelNivel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNivel9Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );
        panelNivel9Layout.setVerticalGroup(
            panelNivel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNivel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12))
        );

        jPanel1.add(panelNivel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 130, -1, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/UInterfaces/resources/mapaWorld 1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 40, 400, 730));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel14.setText("Selecciona los niveles de menor a mayor ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jLabelPregunta.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabelPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPregunta.setText("jLabel15");
        jLabelPregunta.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jScrollPane1.setViewportView(jLabelPregunta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 870, 180));

        jLabelCorazon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/UInterfaces/resources/vida.png"))); // NOI18N
        jLabelCorazon.setText("jLabel16");
        jPanel1.add(jLabelCorazon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 60, 60));

        jLabelVida.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabelVida.setText("3");
        jPanel1.add(jLabelVida, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jPanelOpcion1.setBackground(new java.awt.Color(51, 255, 51));
        jPanelOpcion1.setForeground(new java.awt.Color(51, 255, 51));

        jTextFieldOpcion1.setEditable(false);
        jTextFieldOpcion1.setBackground(new java.awt.Color(51, 255, 51));
        jTextFieldOpcion1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jTextFieldOpcion1.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldOpcion1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldOpcion1.setText("jTextField1");
        jTextFieldOpcion1.setBorder(null);
        jTextFieldOpcion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldOpcion1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelOpcion1Layout = new javax.swing.GroupLayout(jPanelOpcion1);
        jPanelOpcion1.setLayout(jPanelOpcion1Layout);
        jPanelOpcion1Layout.setHorizontalGroup(
            jPanelOpcion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldOpcion1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );
        jPanelOpcion1Layout.setVerticalGroup(
            jPanelOpcion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldOpcion1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelOpcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 420, 100));

        jPanelOpcion2.setBackground(new java.awt.Color(0, 255, 0));

        jTextFieldOpcion2.setEditable(false);
        jTextFieldOpcion2.setBackground(new java.awt.Color(51, 255, 51));
        jTextFieldOpcion2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jTextFieldOpcion2.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldOpcion2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldOpcion2.setText("jTextField1");
        jTextFieldOpcion2.setBorder(null);
        jTextFieldOpcion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldOpcion2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelOpcion2Layout = new javax.swing.GroupLayout(jPanelOpcion2);
        jPanelOpcion2.setLayout(jPanelOpcion2Layout);
        jPanelOpcion2Layout.setHorizontalGroup(
            jPanelOpcion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldOpcion2, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );
        jPanelOpcion2Layout.setVerticalGroup(
            jPanelOpcion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldOpcion2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelOpcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, -1, -1));

        jPanelOpcion3.setBackground(new java.awt.Color(0, 255, 0));

        jTextFieldOpcion3.setEditable(false);
        jTextFieldOpcion3.setBackground(new java.awt.Color(51, 255, 51));
        jTextFieldOpcion3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jTextFieldOpcion3.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldOpcion3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldOpcion3.setText("jTextField1");
        jTextFieldOpcion3.setBorder(null);
        jTextFieldOpcion3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldOpcion3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelOpcion3Layout = new javax.swing.GroupLayout(jPanelOpcion3);
        jPanelOpcion3.setLayout(jPanelOpcion3Layout);
        jPanelOpcion3Layout.setHorizontalGroup(
            jPanelOpcion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldOpcion3, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );
        jPanelOpcion3Layout.setVerticalGroup(
            jPanelOpcion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldOpcion3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelOpcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, -1, -1));

        jPanelOpcion4.setBackground(new java.awt.Color(51, 255, 51));

        jTextFieldOpcion4.setEditable(false);
        jTextFieldOpcion4.setBackground(new java.awt.Color(51, 255, 51));
        jTextFieldOpcion4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jTextFieldOpcion4.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldOpcion4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldOpcion4.setText("jTextField1");
        jTextFieldOpcion4.setBorder(null);
        jTextFieldOpcion4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldOpcion4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelOpcion4Layout = new javax.swing.GroupLayout(jPanelOpcion4);
        jPanelOpcion4.setLayout(jPanelOpcion4Layout);
        jPanelOpcion4Layout.setHorizontalGroup(
            jPanelOpcion4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcion4Layout.createSequentialGroup()
                .addComponent(jTextFieldOpcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelOpcion4Layout.setVerticalGroup(
            jPanelOpcion4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldOpcion4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelOpcion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 590, -1, -1));

        jLabelResultado.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabelResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 700, 720, 50));

        Temporizador.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jPanel1.add(Temporizador, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("0");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, 80, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/UInterfaces/resources/estrellaPuntuacion-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, 110, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldOpcion4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldOpcion4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOpcion4MouseClicked

    private void jTextFieldOpcion3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldOpcion3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOpcion3MouseClicked

    private void jTextFieldOpcion2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldOpcion2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOpcion2MouseClicked

    private void jTextFieldOpcion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldOpcion1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOpcion1MouseClicked

    private void panelNivel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNivel9MouseClicked

        if(puntos==80){
            nivelSeleccionado=9;
            panelNivelMouseClicked(generarNumeroAleatorio()); // para el nivel 1
            iniciarTemporizador();
        } else{
            jLabelResultado.setVisible(true);
            jLabelResultado.setText("Todavia no puedes acceder a este nivel");
            javax.swing.Timer timer = new javax.swing.Timer(3000, new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    jLabelResultado.setVisible(false);
                }
            });
            timer.setRepeats(false); // Esto es importante para que el Timer solo se ejecute una vez
            timer.start();
        }
    }//GEN-LAST:event_panelNivel9MouseClicked

    private void panelNivel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNivel6MouseClicked
        if(puntos==50){
            nivelSeleccionado=6;
            panelNivelMouseClicked(generarNumeroAleatorio()); // para el nivel 1
            iniciarTemporizador();
        } else{
            jLabelResultado.setVisible(true);
            jLabelResultado.setText("Todavia no puedes acceder a este nivel");
            javax.swing.Timer timer = new javax.swing.Timer(3000, new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    jLabelResultado.setVisible(false);
                }
            });
            timer.setRepeats(false); // Esto es importante para que el Timer solo se ejecute una vez
            timer.start();
        }

    }//GEN-LAST:event_panelNivel6MouseClicked

    private void panelNivel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNivel8MouseClicked

        if(puntos==70){
            nivelSeleccionado=8;
            panelNivelMouseClicked(generarNumeroAleatorio()); // para el nivel 1
            iniciarTemporizador();
        } else{
            jLabelResultado.setVisible(true);
            jLabelResultado.setText("Todavia no puedes acceder a este nivel");
            javax.swing.Timer timer = new javax.swing.Timer(3000, new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    jLabelResultado.setVisible(false);
                }
            });
            timer.setRepeats(false); // Esto es importante para que el Timer solo se ejecute una vez
            timer.start();
        }
    }//GEN-LAST:event_panelNivel8MouseClicked

    private void panelNivel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNivel7MouseClicked

        if(puntos==60){
            nivelSeleccionado=7;
            panelNivelMouseClicked(generarNumeroAleatorio()); // para el nivel 1
            iniciarTemporizador();
        } else{
            jLabelResultado.setVisible(true);
            jLabelResultado.setText("Todavia no puedes acceder a este nivel");
            javax.swing.Timer timer = new javax.swing.Timer(3000, new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    jLabelResultado.setVisible(false);
                }
            });
            timer.setRepeats(false); // Esto es importante para que el Timer solo se ejecute una vez
            timer.start();
        }
    }//GEN-LAST:event_panelNivel7MouseClicked

    private void panelNivel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNivel10MouseClicked

        if(puntos==90){
            nivelSeleccionado=10;
            panelNivelMouseClicked(generarNumeroAleatorio()); // para el nivel 1
            iniciarTemporizador();
        } else{
            jLabelResultado.setVisible(true);
            jLabelResultado.setText("Todavia no puedes acceder a este nivel");
            javax.swing.Timer timer = new javax.swing.Timer(3000, new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    jLabelResultado.setVisible(false);
                }
            });
            timer.setRepeats(false); // Esto es importante para que el Timer solo se ejecute una vez
            timer.start();
        }
    }//GEN-LAST:event_panelNivel10MouseClicked

    private void panelNivel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNivel1MouseClicked
        panelNivelMouseClicked(generarNumeroAleatorio()); // para el nivel 1
        iniciarTemporizador();
        nivelSeleccionado=1;
    }//GEN-LAST:event_panelNivel1MouseClicked

    private void panelNivel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNivel4MouseClicked
        if(puntos==30){
            nivelSeleccionado=4;
            panelNivelMouseClicked(generarNumeroAleatorio()); // para el nivel 1
            iniciarTemporizador();
        } else{
            jLabelResultado.setVisible(true);
            jLabelResultado.setText("Todavia no puedes acceder a este nivel");
            javax.swing.Timer timer = new javax.swing.Timer(3000, new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    jLabelResultado.setVisible(false);
                }
            });
            timer.setRepeats(false); // Esto es importante para que el Timer solo se ejecute una vez
            timer.start();
        }
    }//GEN-LAST:event_panelNivel4MouseClicked

    private void panelNivel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNivel3MouseClicked

        if(puntos==20){
            nivelSeleccionado=3;
            panelNivelMouseClicked(generarNumeroAleatorio()); // para el nivel 1
            iniciarTemporizador();
        } else{
            jLabelResultado.setVisible(true);
            jLabelResultado.setText("Todavia no puedes acceder a este nivel");
            javax.swing.Timer timer = new javax.swing.Timer(3000, new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    jLabelResultado.setVisible(false);
                }
            });
            timer.setRepeats(false); // Esto es importante para que el Timer solo se ejecute una vez
            timer.start();
        }
    }//GEN-LAST:event_panelNivel3MouseClicked

    private void panelNivel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNivel2MouseClicked

        if(puntos==10){
            nivelSeleccionado=2;

            panelNivelMouseClicked(generarNumeroAleatorio());
            iniciarTemporizador();
        } else{
            jLabelResultado.setVisible(true);
            jLabelResultado.setText("Todavia no puedes acceder a este nivel");
            javax.swing.Timer timer = new javax.swing.Timer(3000, new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    jLabelResultado.setVisible(false);
                }
            });
            timer.setRepeats(false); // Esto es importante para que el Timer solo se ejecute una vez
            timer.start();
        }

    }//GEN-LAST:event_panelNivel2MouseClicked

    private void panelNivel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelNivel5MouseClicked

        if(puntos==40){
            nivelSeleccionado=5;
            panelNivelMouseClicked(generarNumeroAleatorio()); // para el nivel 1
            iniciarTemporizador();
        } else{
            jLabelResultado.setVisible(true);
            jLabelResultado.setText("Todavia no puedes acceder a este nivel");
            javax.swing.Timer timer = new javax.swing.Timer(3000, new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    jLabelResultado.setVisible(false);
                }
            });
            timer.setRepeats(false); // Esto es importante para que el Timer solo se ejecute una vez
            timer.start();
        }
    }//GEN-LAST:event_panelNivel5MouseClicked

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void minimizeWindowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeWindowMouseEntered
        minimizeWindow.setBackground(new Color(64, 64, 64));
    }//GEN-LAST:event_minimizeWindowMouseEntered

    private void minimizeWindowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeWindowMouseExited
        minimizeWindow.setBackground(Color.gray);
    }//GEN-LAST:event_minimizeWindowMouseExited

    private void minimizeWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeWindowMouseClicked
        this.setState(Frame.ICONIFIED);  // Minimiza la ventana
    }//GEN-LAST:event_minimizeWindowMouseClicked

    private void changeModeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeModeMouseEntered
        changeMode.setBackground(new Color(90, 0, 138));
    }//GEN-LAST:event_changeModeMouseEntered

    private void changeModeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeModeMouseExited
        changeMode.setBackground(new Color(102, 0, 153));
    }//GEN-LAST:event_changeModeMouseExited

    private void changeModeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeModeMouseClicked
        if (isDarkMode) {
            applyTheme(lightTheme);  // Cambiar al tema claro
            jLabel6.setIcon(moonIcon);  // Mostrar la luna
        } else {
            applyTheme(darkTheme);   // Cambiar al tema oscuro
            jLabel6.setIcon(sunIcon);  // Mostrar el sol
        }
        isDarkMode = !isDarkMode;  // Invertir el estado del tema
    }//GEN-LAST:event_changeModeMouseClicked

    private void exitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseEntered
        exitButton.setBackground(new Color(128, 0, 0));
    }//GEN-LAST:event_exitButtonMouseEntered

    private void exitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseExited
        exitButton.setBackground(Color.red);
    }//GEN-LAST:event_exitButtonMouseExited

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitButtonMouseClicked
             

    private String[] cargarPreguntaDesdeArchivo(int nivel) {
    // El nivel corresponde al número del panelNivel clickeado
        String[] datos = null;
        try (InputStream inputStream = getClass().getResourceAsStream("/proyectofinal/UInterfaces/resources/dataMundoLiterario1.txt");
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.ISO_8859_1))) {
            
            String linea;
            int contadorLinea = 0;
            while ((linea = reader.readLine()) != null) {
                contadorLinea++;
                if (contadorLinea == nivel) {
                    datos = linea.split("\t");
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Manejo de error adecuado según tu proyecto
        }
        return datos; // Retorna la línea relevante dividida en un array
    }

    private void panelNivelMouseClicked(int nivel) { // 'nivel' es el número del nivel clickeado
    // Cargar datos desde el archivo
        
         
        String[] preguntaYRespuestas = cargarPreguntaDesdeArchivo(nivel);

        if (preguntaYRespuestas != null && preguntaYRespuestas.length == 6) {
            // Mostrar los componentes ocultos
            Temporizador.setVisible(true);
            jLabelPregunta.setText(preguntaYRespuestas[0]);
            jLabelPregunta.setVisible(true);
            jScrollPane1.setVisible(true);
            jPanelOpcion1.setVisible(true);
            jPanelOpcion2.setVisible(true);
            jPanelOpcion3.setVisible(true);
            jPanelOpcion4.setVisible(true);

            // Rellenar los campos de texto con las opciones
            jTextFieldOpcion1.setText(preguntaYRespuestas[1]);
            jTextFieldOpcion2.setText(preguntaYRespuestas[2]);
            jTextFieldOpcion3.setText(preguntaYRespuestas[3]);
            jTextFieldOpcion4.setText(preguntaYRespuestas[4]);
            respuestaCorrecta = preguntaYRespuestas[5];
            System.out.println(respuestaCorrecta);

            // Aquí deberías guardar también la respuesta correcta desde preguntaYRespuestas[5] 
            // para usarla cuando el usuario elija una respuesta.
        } else {
            // Manejar error
            JOptionPane.showMessageDialog(this, "Error al cargar la pregunta y las opciones.");
        }
    }




    private void iniciarTemporizador() {
    if (tempo != null) {
        tempo.cancel();  // Asegura que cualquier temporizador previo esté cancelado
    }

    tempo = new Timer();
    tempo.scheduleAtFixedRate(new TimerTask() {
        int tiempoRestante = 47;

        @Override
        public void run() {
            Temporizador.setText("Tiempo: " + (tiempoRestante-7) + " segundos");
            tiempoRestante--;

            if (tiempoRestante == 5) {
                jLabelResultado.setText("NO PUDISTE RESPONDER A TIEMPO VUELVE A INTENTARLO");
                Temporizador.setVisible(false);
            }

            if (tiempoRestante == 0) {
                // Aquí desapareces los elementos que mencionaste
               
                jPanelOpcion1.setVisible(false);
                jPanelOpcion2.setVisible(false);
                jPanelOpcion3.setVisible(false);
                jPanelOpcion4.setVisible(false);
                jLabelPregunta.setVisible(false);
                jScrollPane1.setVisible(false);
                jLabelResultado.setVisible(false);

                // Decrementas la vida
                vidas--;
                jLabelVida.setText(String.valueOf(vidas));

                // Si las vidas llegan a 0, muestras el mensaje
                if (vidas == 0) {
                    //JOptionPane.showMessageDialog(null, "Has perdido.");
                    this.cancel();  // Detiene el temporizador
                }
            }

            if (tiempoRestante < 0) {
                // Si las vidas llegan a 0, muestras el mensaje
                if (vidas == 0) {
                    
                    Puntuacion puntuacion = new Puntuacion();
                    System.out.println(idJuegoF);
                    System.out.println(puntos);
                    System.out.println(userIDF);
                    puntuacion.almacenarPuntuacion(idJuegoF, puntos, userIDF);
                    Ranking ranking = new Ranking(userIDF,idJuegoF);
                    ranking.setVisible(true);
                    MundoLiterario mundoLiterario = new MundoLiterario();
                    mundoLiterario.dispose();
                }
                this.cancel();  // Detiene el temporizador
                
            }
        }
    }, 0, 1000);  // Se ejecuta cada segundo
    
}

    private void verificarRespuesta(String respuestaSeleccionada) throws InterruptedException {
        jLabelResultado.setVisible(true);
        if (respuestaSeleccionada.equalsIgnoreCase(respuestaCorrecta)) {
            
            if(nivelSeleccionado==1){
                jPanelOpcion1.setVisible(false);
                jPanelOpcion2.setVisible(false);
                jPanelOpcion3.setVisible(false);
                jPanelOpcion4.setVisible(false);
                jLabelPregunta.setVisible(false);
                jScrollPane1.setVisible(false);
                Temporizador.setVisible(false);
                jLabelResultado.setText("¡Felicidades! Pasaste el nivel.");
                if(intentosNivel1==0){
                    puntos+=10;
                    jLabel15.setText(String.valueOf(puntos));
                    intentosNivel1++;
                }else{
                    jLabelResultado.setText("Ya pasaste este nivel no puedes ganar mas puntuación");
                    repaint();
                }
            }
            
            if(nivelSeleccionado==2){
                jPanelOpcion1.setVisible(false);
                jPanelOpcion2.setVisible(false);
                jPanelOpcion3.setVisible(false);
                jPanelOpcion4.setVisible(false);
                jLabelPregunta.setVisible(false);
                jScrollPane1.setVisible(false);
                Temporizador.setVisible(false);
                jLabelResultado.setText("¡Felicidades! Pasaste el nivel.");
                if(intentosNivel2==0){
                    puntos+=10;
                    jLabel15.setText(String.valueOf(puntos));
                    intentosNivel2++;
                }else{
                    jLabelResultado.setText("Ya pasaste este nivel no puedes ganar mas puntuación");
                    repaint();
                }
            }
            
            
            
            if(nivelSeleccionado==3){
                jPanelOpcion1.setVisible(false);
                jPanelOpcion2.setVisible(false);
                jPanelOpcion3.setVisible(false);
                jPanelOpcion4.setVisible(false);
                jLabelPregunta.setVisible(false);
                jScrollPane1.setVisible(false);
                Temporizador.setVisible(false);
                jLabelResultado.setText("¡Felicidades! Pasaste el nivel.");
                if(intentosNivel3==0){
                    puntos+=10;
                    jLabel15.setText(String.valueOf(puntos));
                    intentosNivel3++;
                }else{
                    jLabelResultado.setText("Ya pasaste este nivel no puedes ganar mas puntuación");
                    repaint();
                }
            }
            
            
            if(nivelSeleccionado==4){
                jPanelOpcion1.setVisible(false);
                jPanelOpcion2.setVisible(false);
                jPanelOpcion3.setVisible(false);
                jPanelOpcion4.setVisible(false);
                jLabelPregunta.setVisible(false);
                jScrollPane1.setVisible(false);
                Temporizador.setVisible(false);
                jLabelResultado.setText("¡Felicidades! Pasaste el nivel.");
                if(intentosNivel4==0){
                    puntos+=10;
                    jLabel15.setText(String.valueOf(puntos));
                    intentosNivel4++;
                }else{
                    jLabelResultado.setText("Ya pasaste este nivel no puedes ganar mas puntuación");
                    repaint();
                }
            }
            
            if(nivelSeleccionado==5){
                jPanelOpcion1.setVisible(false);
                jPanelOpcion2.setVisible(false);
                jPanelOpcion3.setVisible(false);
                jPanelOpcion4.setVisible(false);
                jLabelPregunta.setVisible(false);
                jScrollPane1.setVisible(false);
                Temporizador.setVisible(false);
                jLabelResultado.setText("¡Felicidades! Pasaste el nivel.");
                if(intentosNivel5==0){
                    puntos+=10;
                    jLabel15.setText(String.valueOf(puntos));
                    intentosNivel5++;
                }else{
                    jLabelResultado.setText("Ya pasaste este nivel no puedes ganar mas puntuación");
                    repaint();
                }
            }
            
            
            if(nivelSeleccionado==6){
                jPanelOpcion1.setVisible(false);
                jPanelOpcion2.setVisible(false);
                jPanelOpcion3.setVisible(false);
                jPanelOpcion4.setVisible(false);
                jLabelPregunta.setVisible(false);
                jScrollPane1.setVisible(false);
                Temporizador.setVisible(false);
                jLabelResultado.setText("¡Felicidades! Pasaste el nivel.");
                if(intentosNivel6==0){
                    puntos+=10;
                    jLabel15.setText(String.valueOf(puntos));
                    intentosNivel6++;
                }else{
                    jLabelResultado.setText("Ya pasaste este nivel no puedes ganar mas puntuación");
                    repaint();
                }
            }
            
            
            if(nivelSeleccionado==7){
                jPanelOpcion1.setVisible(false);
                jPanelOpcion2.setVisible(false);
                jPanelOpcion3.setVisible(false);
                jPanelOpcion4.setVisible(false);
                jLabelPregunta.setVisible(false);
                jScrollPane1.setVisible(false);
                Temporizador.setVisible(false);
                jLabelResultado.setText("¡Felicidades! Pasaste el nivel.");
                if(intentosNivel7==0){
                    puntos+=10;
                    jLabel15.setText(String.valueOf(puntos));
                    intentosNivel7++;
                }else{
                    jLabelResultado.setText("Ya pasaste este nivel no puedes ganar mas puntuación");
                    repaint();
                }
            }
            
            if(nivelSeleccionado==8){
                jPanelOpcion1.setVisible(false);
                jPanelOpcion2.setVisible(false);
                jPanelOpcion3.setVisible(false);
                jPanelOpcion4.setVisible(false);
                jLabelPregunta.setVisible(false);
                jScrollPane1.setVisible(false);
                Temporizador.setVisible(false);
                jLabelResultado.setText("¡Felicidades! Pasaste el nivel.");
                if(intentosNivel8==0){
                    puntos+=10;
                    jLabel15.setText(String.valueOf(puntos));
                    intentosNivel8++;
                }else{
                    jLabelResultado.setText("Ya pasaste este nivel no puedes ganar mas puntuación");
                    repaint();
                }
            }
            
            if(nivelSeleccionado==9){
                jPanelOpcion1.setVisible(false);
                jPanelOpcion2.setVisible(false);
                jPanelOpcion3.setVisible(false);
                jPanelOpcion4.setVisible(false);
                jLabelPregunta.setVisible(false);
                jScrollPane1.setVisible(false);
                Temporizador.setVisible(false);
                jLabelResultado.setText("¡Felicidades! Pasaste el nivel.");
                if(intentosNivel9==0){
                    puntos+=10;
                    jLabel15.setText(String.valueOf(puntos));
                    intentosNivel9++;
                }else{
                    jLabelResultado.setText("Ya pasaste este nivel no puedes ganar mas puntuación");
                    repaint();
                }
            }
            
            
            if(nivelSeleccionado==10){
                jPanelOpcion1.setVisible(false);
                jPanelOpcion2.setVisible(false);
                jPanelOpcion3.setVisible(false);
                jPanelOpcion4.setVisible(false);
                jLabelPregunta.setVisible(false);
                jScrollPane1.setVisible(false);
                Temporizador.setVisible(false);
                jLabelResultado.setText("¡Felicidades! Pasaste el nivel. Completaste el Juego exitosamente");
                if(intentosNivel10==0){
                    puntos+=10;
                    jLabel15.setText(String.valueOf(puntos));
                    intentosNivel10++;
                    verificarAcabado();
                }else{
                    jLabelResultado.setText("Ya pasaste este nivel no puedes ganar mas puntuación");
                    repaint();
                }
            }

            
        } else {
            
            jLabelResultado.setText("Respuesta incorrecta. ¡Inténtalo de nuevo!");
                jPanelOpcion1.setVisible(false);
                jPanelOpcion2.setVisible(false);
                jPanelOpcion3.setVisible(false);
                jPanelOpcion4.setVisible(false);
                jLabelPregunta.setVisible(false);
                jScrollPane1.setVisible(false);
                Temporizador.setVisible(false);
            
                // Decrementas la vida
                vidas--;
                jLabelVida.setText(String.valueOf(vidas));
                if (vidas == 0) {
                    
                    Puntuacion puntuacion = new Puntuacion();
                    puntuacion.almacenarPuntuacion(idJuegoF, puntos, userIDF);
                    Ranking ranking = new Ranking(userIDF,idJuegoF);
                    ranking.setVisible(true);
                    this.dispose();
                }
                
            // Aquí puedes manejar intentos fallidos, como reducir el número de vidas o similar.
        }
        // Se crea un Timer que se ejecutará después de 5 segundos (5000 milisegundos)
        javax.swing.Timer timer = new javax.swing.Timer(5000, new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                jLabelResultado.setVisible(false);
            }
        });
        timer.setRepeats(false); // Esto es importante para que el Timer solo se ejecute una vez
        timer.start();
    }
    
    private void verificarAcabado(){
        
            Puntuacion puntuacion = new Puntuacion();
            System.out.println(idJuegoF);
            System.out.println(puntos);
            System.out.println(userIDF);
            MundoLiterario mundoLiterario = new MundoLiterario();
            
        if(intentosNivel10==1){
             
            puntuacion.almacenarPuntuacion(idJuegoF, puntos, userIDF);
            
        }
        javax.swing.Timer timer = new javax.swing.Timer(5000, new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                Ranking ranking = new Ranking(userIDF,idJuegoF);
                ranking.setVisible(true);
                mundoLiterario.dispose();
            }
        });
        timer.setRepeats(false); // Esto es importante para que el Timer solo se ejecute una vez
        timer.start();
    }
    
    public int generarNumeroAleatorio() {
        // Si todos los números posibles ya han aparecido, limpia la lista.
        if (numerosGenerados.size() == 40) {
            numerosGenerados.clear();
        }

        int numeroAleatorio;
        do {
            // Generar un número aleatorio entre 1 y 40.
            numeroAleatorio = 1 + random.nextInt(40);
        } while (numerosGenerados.contains(numeroAleatorio)); // Si el número ya está en la lista, genera otro.

        // Si el número es único (no está en la lista), añádelo a la lista.
        numerosGenerados.add(numeroAleatorio);

        return numeroAleatorio;
    }
    


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* ... Código existente ... */
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            MundoLiterario ml = new MundoLiterario(idJuegoF,userIDF);
            ml.setVisible(true);

        }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Temporizador;
    private Clases.PanelRound changeMode;
    private Clases.PanelRound exitButton;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCorazon;
    private javax.swing.JLabel jLabelPregunta;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelVida;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelOpcion1;
    private javax.swing.JPanel jPanelOpcion2;
    private javax.swing.JPanel jPanelOpcion3;
    private javax.swing.JPanel jPanelOpcion4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldOpcion1;
    private javax.swing.JTextField jTextFieldOpcion2;
    private javax.swing.JTextField jTextFieldOpcion3;
    private javax.swing.JTextField jTextFieldOpcion4;
    private Clases.PanelRound minimizeWindow;
    private Clases.PanelRound panelNivel1;
    private Clases.PanelRound panelNivel10;
    private Clases.PanelRound panelNivel2;
    private Clases.PanelRound panelNivel3;
    private Clases.PanelRound panelNivel4;
    private Clases.PanelRound panelNivel5;
    private Clases.PanelRound panelNivel6;
    private Clases.PanelRound panelNivel7;
    private Clases.PanelRound panelNivel8;
    private Clases.PanelRound panelNivel9;
    // End of variables declaration//GEN-END:variables

  


   
}
