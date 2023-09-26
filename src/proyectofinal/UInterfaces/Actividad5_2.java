/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinal.UInterfaces;

import java.awt.Color;
import java.awt.Frame;
import javax.swing.ImageIcon;


/**
 *
 * @author daasa
 */
public class Actividad5_2 extends javax.swing.JFrame {
    private Theme darkTheme = new Theme(new Color(0, 0, 51), new Color(255, 255, 255), new Color(100, 100, 100));
    private Theme lightTheme = new Theme(new Color(255, 255, 255), new Color(0, 0, 0), new Color(200, 200, 200));
    private ImageIcon sunIcon = new ImageIcon(getClass().getResource("/proyectofinal/UInterfaces/sun.png"));
    private ImageIcon moonIcon = new ImageIcon(getClass().getResource("/proyectofinal/UInterfaces/moon.png"));
    private boolean isDarkMode = false;  // Variable para rastrear el tema actual




    int xMouse, yMouse;

    /**
     * Creates new form Inicio
     */
    public Actividad5_2() {
        initComponents();
        applyTheme(lightTheme);
        jLabel6.setIcon(moonIcon);  // Establece el ícono inicial del sol
        
    }
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
        jLabel1 = new javax.swing.JLabel();

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

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/UInterfaces/moon.png"))); // NOI18N

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

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        jLabel2.setText("Bienvenido a EducaPoli");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/UInterfaces/child estudying.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 340, 770));

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
            java.util.logging.Logger.getLogger(Actividad5_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actividad5_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actividad5_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actividad5_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actividad5_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Clases.PanelRound changeMode;
    private Clases.PanelRound exitButton;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private Clases.PanelRound minimizeWindow;
    // End of variables declaration//GEN-END:variables
}
