/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinal.UInterfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Frame;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import proyectofinal.RankingJuego;


/**
 *
 * @author daasa
 */
public class RankingGrafico extends javax.swing.JFrame {
    private Theme darkTheme = new Theme(new Color(0, 0, 51), new Color(255, 255, 255), new Color(100, 100, 100));
    private Theme lightTheme = new Theme(new Color(255, 255, 255), new Color(0, 0, 0), new Color(200, 200, 200));
    private ImageIcon sunIcon = new ImageIcon(getClass().getResource("/proyectofinal/UInterfaces/resources/sun.png"));
    private ImageIcon moonIcon = new ImageIcon(getClass().getResource("/proyectofinal/UInterfaces/resources/moon.png"));
    private boolean isDarkMode = false;  // Variable para rastrear el tema actual
    
    static int gameIDF;
    static int userIDF;
    int xMouse, yMouse;
    JFreeChart barChart;

    /**
     * Creates new form Inicio
     */
    public RankingGrafico(int userID,int gameID) {
        gameIDF = gameID;
        userIDF =userID;
        
        initComponents();
        applyTheme(lightTheme);
        jLabel6.setIcon(moonIcon);  // Establece el ícono inicial del sol
            

        generateBarChart();

    }
    private void applyTheme(Theme theme) {
        jPanel1.setBackground(theme.backgroundColor);
        jLabel2.setForeground(theme.textColor);
        jLabel5.setForeground(theme.textColor); 

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
        backButton = new Clases.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanelGrafico = new javax.swing.JPanel();
        jLabelResultado = new javax.swing.JLabel();

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

        backButton.setBackground(java.awt.Color.green);
        backButton.setPreferredSize(new java.awt.Dimension(25, 25));
        backButton.setRoundBottomLeft(100);
        backButton.setRoundBottomRight(100);
        backButton.setRoundTopLeft(100);
        backButton.setRoundTopRight(100);
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backButtonMouseEntered(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/UInterfaces/resources/back.png"))); // NOI18N

        javax.swing.GroupLayout backButtonLayout = new javax.swing.GroupLayout(backButton);
        backButton.setLayout(backButtonLayout);
        backButtonLayout.setHorizontalGroup(
            backButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backButtonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );
        backButtonLayout.setVerticalGroup(
            backButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backButtonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1204, Short.MAX_VALUE)
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
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(changeMode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minimizeWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 40));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        jLabel2.setText("Top mejores jugadores");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinal/UInterfaces/resources/podium.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 340, 770));

        jPanel4.setBackground(new java.awt.Color(255, 153, 51));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Generar Reporte PDF");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 700, 310, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("¿Estas entre los mejores?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        javax.swing.GroupLayout jPanelGraficoLayout = new javax.swing.GroupLayout(jPanelGrafico);
        jPanelGrafico.setLayout(jPanelGraficoLayout);
        jPanelGraficoLayout.setHorizontalGroup(
            jPanelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        jPanelGraficoLayout.setVerticalGroup(
            jPanelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelGrafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 890, 410));

        jLabelResultado.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jPanel1.add(jLabelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 690, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        String dest = "Reporte Mayores Puntajes del Juego"+gameIDF+".pdf";
       jLabelResultado.setText("Generando PDF...");
        try (PDDocument document = new PDDocument()) {
            // Tamaño Carta
            PDPage page = new PDPage(new PDRectangle(612, 792)); // 8.5" x 11" en puntos
            document.addPage(page);

            PDPageContentStream contentStream = new PDPageContentStream(document, page);

            // EducaPoli: centrado, negritas y tamaño 16
            contentStream.setFont(PDType1Font.HELVETICA_BOLD, 16);
            String text1 = "EducaPoli";
            float text1Width = PDType1Font.HELVETICA_BOLD.getStringWidth(text1) / 1000 * 16;
            float xPosition1 = (page.getMediaBox().getWidth() - text1Width) / 2;
            contentStream.beginText();
            contentStream.newLineAtOffset(xPosition1, page.getMediaBox().getHeight() - 100);
            contentStream.showText(text1);
            contentStream.endText();

            // Texto personalizado centrado y tamaño 12
            contentStream.setFont(PDType1Font.HELVETICA, 12);
            String text2 = "Aquí te presentamos un reporte de los mayores puntajes del juego 1 a la fecha";
            float text2Width = PDType1Font.HELVETICA.getStringWidth(text2) / 1000 * 12;
            float xPosition2 = (page.getMediaBox().getWidth() - text2Width) / 2;
            contentStream.beginText();
            contentStream.newLineAtOffset(xPosition2, page.getMediaBox().getHeight() - 120);
            contentStream.showText(text2);
            contentStream.endText();

            // Fecha alineada a la derecha
            String fecha = "Reporte al: " + new SimpleDateFormat("dd-MM-yyyy").format(new Date());
            float text3Width = PDType1Font.HELVETICA.getStringWidth(fecha) / 1000 * 12;
            float xPosition3 = page.getMediaBox().getWidth() - text3Width - 100;
            contentStream.beginText();
            contentStream.newLineAtOffset(xPosition3, page.getMediaBox().getHeight() - 140);
            contentStream.showText(fecha);
            contentStream.endText();

            // Agregar la gráfica
            File chartFile = new File("chart.png");
            ChartUtils.saveChartAsPNG(chartFile, barChart, 500, 400);
            PDImageXObject pdImage = PDImageXObject.createFromFile(chartFile.getAbsolutePath(), document);

            // Calcular posición x para centrar la imagen
            float widthOfImage = 500; // Ancho de la imagen en puntos
            float xPositionImage = (page.getMediaBox().getWidth() - widthOfImage) / 2;

            // Insertar imagen
            contentStream.drawImage(pdImage, xPositionImage, page.getMediaBox().getHeight() - 600, widthOfImage, 400); // Ajusta las coordenadas y tamaño según sea necesario

            Files.delete(chartFile.toPath());  // Limpieza del archivo temporal


            contentStream.close();
            document.save(dest);
            
            // Actualizar JLabel
            jLabelResultado.setText("Abriendo el PDF");
        
            // Intentar abrir el PDF
            if (Desktop.isDesktopSupported()) {
                try {
                    File myFile = new File(dest);
                    Desktop.getDesktop().open(myFile);
                } catch (IOException ex) {
                    // Manejar el caso en que el archivo no se pueda abrir
                    jLabelResultado.setText("No se puede abrir, búscalo en los archivos.");
                    ex.printStackTrace();
                }
            } else {
                // Manejar el caso en que Desktop no está disponible
                jLabelResultado.setText("No se puede abrir, búscalo en los archivos.");
                System.out.println("No se puede abrir el archivo, Desktop no es compatible");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jPanel4MouseClicked

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

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        MenuActividadesAdmin menuActividadesAdmin = new MenuActividadesAdmin(userIDF);
        menuActividadesAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonMouseClicked

    private void backButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseExited
        backButton.setBackground(Color.GREEN);
    }//GEN-LAST:event_backButtonMouseExited

    private void backButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseEntered
        backButton.setBackground(new Color(0, 178, 0));
    }//GEN-LAST:event_backButtonMouseEntered
                                  

    private void generateBarChart() {
    // Crear un dataset para almacenar la información de las barras
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Obtener la información de ranking
        RankingJuego rankingJuego = new RankingJuego();
        Map<String, ArrayList<String>> rankingMap = rankingJuego.obtenerRanking(gameIDF);

        ArrayList<String> nombres = rankingMap.get("nombres");
        ArrayList<String> puntuaciones = rankingMap.get("puntuaciones");
        for (int i = 0; i < nombres.size() && i < 10; i++) { // Suponiendo que quieres un top 10
            String jugador = nombres.get(i);
            String puntuacion = puntuaciones.get(i); 
            dataset.addValue(Integer.valueOf(puntuacion), "Puntuaciones", jugador); // Añade la puntuación, la categoría, y el nombre del jugador
        }

        // Crear el gráfico de barras
        barChart = ChartFactory.createBarChart(
            "Top 10 Ranking", // título del gráfico
            "Jugador",        // etiqueta del eje de dominio
            "Puntuación",     // etiqueta del eje de rango
            dataset,          // datos
            PlotOrientation.VERTICAL,
            true,             // incluir leyendas
            true,             // tooltips
            false             // URLs
        );

        // Crear un panel para mostrar el gráfico
        ChartPanel chartPanel = new ChartPanel(barChart);

    // Asegúrate de que tu jPanelGrafico está usando un LayoutManager adecuado o ningún LayoutManager.
    jPanelGrafico.setLayout(new java.awt.BorderLayout());
    // Añadir el ChartPanel a tu jPanelGrafico.
    jPanelGrafico.add(chartPanel, BorderLayout.CENTER);
    System.out.println("repaint graphic");
    // Refresca el jPanel si es necesario
    jPanelGrafico.revalidate();
    jPanelGrafico.repaint();
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
            java.util.logging.Logger.getLogger(RankingGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RankingGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RankingGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RankingGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new RankingGrafico(userIDF,gameIDF).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Clases.PanelRound backButton;
    private Clases.PanelRound changeMode;
    private Clases.PanelRound exitButton;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelGrafico;
    private Clases.PanelRound minimizeWindow;
    // End of variables declaration//GEN-END:variables
}
