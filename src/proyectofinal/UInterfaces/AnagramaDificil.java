/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinal.UInterfaces;

import java.awt.Color;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.ImageIcon;
import proyectofinal.AnagramManager;
import proyectofinal.ApiIntegration;


/**
 *
 * @author daasa
 */
public class AnagramaDificil extends javax.swing.JFrame {
    private Theme darkTheme = new Theme(new Color(0, 0, 51), new Color(255, 255, 255), new Color(100, 100, 100));
    private Theme lightTheme = new Theme(new Color(255, 255, 255), new Color(0, 0, 0), new Color(200, 200, 200));
    private ImageIcon sunIcon = new ImageIcon(getClass().getResource("/proyectofinal/UInterfaces/resources/sun.png"));
    private ImageIcon moonIcon = new ImageIcon(getClass().getResource("/proyectofinal/UInterfaces/resources/moon.png"));
    private boolean isDarkMode = false;  // Variable para rastrear el tema actual
    private AnagramManager anagramManager;

    static int userIDF;
    static int puntuacionF;
    static int idJuegoF;
    static int rondaF;
    String palabra;
    static String palabraRevuelta;
    int xMouse, yMouse;
   

    /**
     * Creates new form Inicio
     */
    public AnagramaDificil(int puntuacion,int idJuego,int userID,int ronda) {
        initComponents();
        puntuacionF = puntuacion;
        rondaF += ronda;
        userIDF=userID;
        idJuegoF= idJuego;
        applyTheme(lightTheme);
        jLabel6.setIcon(moonIcon);  // Establece el ícono inicial del sol
        
        inicializarAnagramManager();
        System.out.println(palabra);
    }
    private void applyTheme(Theme theme) {
        jPanel1.setBackground(theme.backgroundColor);
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
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

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

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/UInterfaces/resources/codigo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 340, 770));

        jTextField1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 660, 60));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 660, 40));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Bienvenido a EducaPoli");
        jScrollPane1.setViewportView(jLabel3);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 840, 130));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel4.setText("según corresponda");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel5.setText("Con el apoyo de la descripción proporcionada y con la palabra revuelta, escribe en el");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel7.setText("espacio de texto, el concepto, descripcion, componente o area de la tecnología ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 153, 51));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Verificar");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 660, 270, 80));

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

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitButtonMouseClicked

    private void exitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseEntered
        exitButton.setBackground(new Color(128, 0, 0));
    }//GEN-LAST:event_exitButtonMouseEntered

    private void exitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseExited
        exitButton.setBackground(Color.red);
    }//GEN-LAST:event_exitButtonMouseExited

    private void changeModeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeModeMouseEntered
        changeMode.setBackground(new Color(90, 0, 138));
    }//GEN-LAST:event_changeModeMouseEntered

    private void changeModeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeModeMouseExited
        changeMode.setBackground(new Color(102, 0, 153));
    }//GEN-LAST:event_changeModeMouseExited

    private void minimizeWindowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeWindowMouseEntered
        minimizeWindow.setBackground(new Color(64, 64, 64));
    }//GEN-LAST:event_minimizeWindowMouseEntered

    private void minimizeWindowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeWindowMouseExited
        minimizeWindow.setBackground(Color.gray);
    }//GEN-LAST:event_minimizeWindowMouseExited

    private void minimizeWindowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeWindowMouseClicked
        this.setState(Frame.ICONIFIED);  // Minimiza la ventana
    }//GEN-LAST:event_minimizeWindowMouseClicked

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

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        
        String textoIngresado = jTextField1.getText();;
        System.out.println(textoIngresado);
        if (textoIngresado.equalsIgnoreCase(palabra)) {
            puntuacionF += 20;
        }
        PuntuacionRonda puntuacionRonda = new PuntuacionRonda(userIDF,puntuacionF,idJuegoF,1);
        puntuacionRonda.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked
       
    public void inicializarAnagramManager() {
    // Utiliza un InputStream para cargar el archivo como un recurso, necesario especialmente dentro de un archivo JAR.
    InputStream inputStream = getClass().getResourceAsStream("/proyectofinal/UInterfaces/resources/anagramasData.txt");
    
    if (inputStream != null) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) { // Asegúrate de manejar la codificación correcta
            this.anagramManager = new AnagramManager(reader);
            
            // Obtener un nuevo anagrama y actualizar la interfaz de usuario.
            String[] nuevoAnagrama = this.anagramManager.obtenerNuevoAnagrama();
            if (nuevoAnagrama != null && nuevoAnagrama.length == 2) {
                palabra = nuevoAnagrama[0];
                String descripcion = nuevoAnagrama[1];
                
                // Suponiendo que jLabel2 y jLabel3 son los componentes de tu interfaz de usuario para mostrar la información.
                
                jLabel3.setText(descripcion);
            } else {
                // Manejar la situación de error, por ejemplo, no hay más anagramas o no se pudo leer.
                jLabel3.setText("No se pudo obtener un nuevo anagrama.");
            }
            
        } catch (IOException e) {
            // Maneja la excepción aquí (mostrar un mensaje, etc.)
            e.printStackTrace();
            jLabel3.setText("Error al leer los datos de anagramas.");
        }
    } else {
        // No se pudo encontrar el archivo. Maneja este caso como prefieras.
        System.err.println("No se pudo encontrar el archivo 'anagramasData.txt'.");

        jLabel3.setText("No se pudo encontrar el recurso de datos.");
    }
}
    
    private String mezclarCaracteres(String texto) {
        List<Character> caracteres = new ArrayList<Character>();
        for(char c : texto.toCharArray()) {
            caracteres.add(c);
        }
        Collections.shuffle(caracteres);
        StringBuilder textoMezclado = new StringBuilder();
        for(char c : caracteres) {
            textoMezclado.append(c);
        }
        return textoMezclado.toString();
    }
    
    private void inicializarPalabraRevuelta() {
        palabraRevuelta = mezclarCaracteres(palabra);
    }



    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnagramaDificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnagramaDificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnagramaDificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnagramaDificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnagramaDificil(puntuacionF,idJuegoF,userIDF,rondaF).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Clases.PanelRound changeMode;
    private Clases.PanelRound exitButton;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private Clases.PanelRound minimizeWindow;
    // End of variables declaration//GEN-END:variables
}