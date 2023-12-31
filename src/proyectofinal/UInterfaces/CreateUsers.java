/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinal.UInterfaces;

import java.awt.Color;
import java.awt.Frame;
import java.util.List;  
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import proyectofinal.ConexionABase;
import proyectofinal.Usuario;


/**
 *
 * @author daasa
 */
public class CreateUsers extends javax.swing.JFrame {
    private Theme darkTheme = new Theme(new Color(0, 0, 51), new Color(255, 255, 255), new Color(100, 100, 100));
    private Theme lightTheme = new Theme(new Color(255, 255, 255), new Color(0, 0, 0), new Color(200, 200, 200));
    private ImageIcon sunIcon = new ImageIcon(getClass().getResource("/proyectofinal/UInterfaces/resources/sun.png"));
    private ImageIcon moonIcon = new ImageIcon(getClass().getResource("/proyectofinal/UInterfaces/resources/moon.png"));
    private boolean isDarkMode = false;  // Variable para rastrear el tema actual
    
    static int userIDF;



    int xMouse, yMouse;

    /**
     * Creates new form Inicio
     * @param userID
     */
    public CreateUsers(int userID) {
        userIDF=userID;
        initComponents();
        applyTheme(lightTheme);
        jLabel6.setIcon(moonIcon);  // Establece el ícono inicial del sol

        updateUsuarioList();  // Actualiza la lista de usuarios cuando se inicializa el JFrame
    }
    private void applyTheme(Theme theme) {
        jPanel1.setBackground(theme.backgroundColor);
        jLabel5.setForeground(theme.textColor);
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
        backButton4 = new Clases.PanelRound();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanelAgregar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jTextNombre = new javax.swing.JTextField();
        jTextUsuario = new javax.swing.JTextField();
        jTextTipo = new javax.swing.JTextField();

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

        backButton4.setBackground(java.awt.Color.green);
        backButton4.setPreferredSize(new java.awt.Dimension(25, 25));
        backButton4.setRoundBottomLeft(100);
        backButton4.setRoundBottomRight(100);
        backButton4.setRoundTopLeft(100);
        backButton4.setRoundTopRight(100);
        backButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButton4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backButton4MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backButton4MouseEntered(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/UInterfaces/resources/back.png"))); // NOI18N

        javax.swing.GroupLayout backButton4Layout = new javax.swing.GroupLayout(backButton4);
        backButton4.setLayout(backButton4Layout);
        backButton4Layout.setHorizontalGroup(
            backButton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backButton4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13))
        );
        backButton4Layout.setVerticalGroup(
            backButton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backButton4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(backButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1205, Short.MAX_VALUE)
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
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(changeMode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minimizeWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 40));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel2.setText("Da click en el boton agregar para crear el usuario en el sistema");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/UInterfaces/resources/deleteAreaImage.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 340, 770));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        jLabel5.setText("Agregar usuarios");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        jList1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 22)); // NOI18N
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 810, 310));

        jPanelAgregar.setBackground(java.awt.Color.green);
        jPanelAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelAgregarMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Agregar Usuario");

        javax.swing.GroupLayout jPanelAgregarLayout = new javax.swing.GroupLayout(jPanelAgregar);
        jPanelAgregar.setLayout(jPanelAgregarLayout);
        jPanelAgregarLayout.setHorizontalGroup(
            jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAgregarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelAgregarLayout.setVerticalGroup(
            jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAgregarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 650, -1, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel7.setText("Tipo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 510, -1, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel8.setText("Nombre");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, -1, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel9.setText("Usuario");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 610, 100, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, 350, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 610, 330, 30));

        jTextNombre.setBorder(null);
        jPanel1.add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, 350, 40));

        jTextUsuario.setBorder(null);
        jPanel1.add(jTextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 570, 330, 40));

        jTextTipo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextTipo.setBorder(null);
        jPanel1.add(jTextTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 569, 100, 40));

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

    private void jPanelAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAgregarMouseClicked
        // Validar que los campos de texto no estén vacíos y que jTextTipo contenga un número entero
        if (validateTextFields()) {
            // Obtener valores de los campos de texto
            String nombre = jTextNombre.getText();
            String usuario = jTextUsuario.getText();
            String tipoStr = jTextTipo.getText();

            // Validar que 'nombre' contenga solo letras y espacios
            if (!nombre.matches("^[\\p{L} .'-]+$")) {
                JOptionPane.showMessageDialog(this, "El nombre solo debe contener letras.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Verificar que 'usuario' contenga al menos una letra
            if (!usuario.matches(".*[a-zA-Z].*")) {
                JOptionPane.showMessageDialog(this, "El nombre de usuario debe contener al menos una letra.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validar que 'tipo' sea un número entero y sea 1 o 2
            int tipo;
            try {
                tipo = Integer.parseInt(tipoStr);
                if (tipo != 1 && tipo != 2) {
                    throw new NumberFormatException(); // Lanzar esta excepción para manejar ambos casos en el mismo bloque catch.
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Tipo debe ser un número (1 o 2).", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Si las validaciones son exitosas, proceder con la creación del usuario.

            // Utilizar la función registrarUsuario para crear un nuevo usuario en la base de datos
            Usuario nuevoUsuario = new Usuario();
            int usuarioID = nuevoUsuario.registrarUsuario1(nombre, usuario, tipo);

            if (usuarioID != 0) {  // Verificar si el usuario fue creado exitosamente
                JOptionPane.showMessageDialog(this, "Usuario creado exitosamente con ID: " + usuarioID);
                clearTextFields();  // Limpiar campos de texto
                updateUsuarioList(); // Actualizar la lista de usuarios
            } else {
                JOptionPane.showMessageDialog(this, "El usuario no pudo ser creado, puede que el nombre de usuario ya exista.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, rellene todos los campos correctamente.");
        }

    }//GEN-LAST:event_jPanelAgregarMouseClicked

    private void backButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButton4MouseClicked
        MenuAdministrador menuAdministrador = new MenuAdministrador(userIDF);
        menuAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButton4MouseClicked

    private void backButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButton4MouseExited
        backButton4.setBackground(Color.GREEN);
    }//GEN-LAST:event_backButton4MouseExited

    private void backButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButton4MouseEntered
        backButton4.setBackground(new Color(0, 178, 0));
    }//GEN-LAST:event_backButton4MouseEntered
    private List<Usuario> getUsuariosFromDB() {
    List<Usuario> usuarios = new ArrayList<>();

    try {
        Connection con = ConexionABase.inicializaBaseDeDatos(); 
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT usuario_id, nombre, nombre_de_usuario, userTipe FROM usuarios");

        while (rs.next()) {
            usuarios.add(new Usuario(rs.getInt("usuario_id"), rs.getString("nombre"), rs.getString("nombre_de_usuario"), rs.getInt("userTipe")));
        }

        rs.close();
        stmt.close();
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return usuarios;
}

    private void updateUsuarioList() {
        DefaultListModel<Usuario> model = new DefaultListModel<>();
        for (Usuario usuario : getUsuariosFromDB()) {
            model.addElement(usuario);
        }
        jList1.setModel(model);
    }
    private boolean validateTextFields() {
    // Validaciones básicas de los campos de texto (mejora según tus necesidades)
    return !jTextNombre.getText().trim().isEmpty() &&
           !jTextUsuario.getText().trim().isEmpty() &&
           !jTextTipo.getText().trim().isEmpty() && 
           jTextTipo.getText().trim().matches("\\d+");
    }
    private void clearTextFields() {
        jTextNombre.setText("");
        jTextUsuario.setText("");
        jTextTipo.setText("");
    }
    private void updateUsuarioInDB(int id, String nombre, String usuario, int tipo) {
    // Método para actualizar usuario en la base de datos usando los parámetros proporcionados.
    try {
        Connection con = ConexionABase.inicializaBaseDeDatos(); 
        String sql = "UPDATE usuarios SET nombre = ?, nombre_de_usuario = ?, userTipe = ? WHERE usuario_id = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, usuario);
            pstmt.setInt(3, tipo);
            pstmt.setInt(4, id);
            pstmt.executeUpdate();
        }
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
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
            java.util.logging.Logger.getLogger(CreateUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CreateUsers(userIDF).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Clases.PanelRound backButton;
    private Clases.PanelRound backButton1;
    private Clases.PanelRound backButton2;
    private Clases.PanelRound backButton4;
    private Clases.PanelRound changeMode;
    private Clases.PanelRound exitButton;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<Usuario> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAgregar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextTipo;
    private javax.swing.JTextField jTextUsuario;
    private Clases.PanelRound minimizeWindow;
    // End of variables declaration//GEN-END:variables
}
