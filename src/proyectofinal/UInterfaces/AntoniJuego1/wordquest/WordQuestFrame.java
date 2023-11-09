/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinal.UInterfaces.AntoniJuego1.wordquest;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author jacr3
 */


public class WordQuestFrame extends javax.swing.JFrame {
    private float puntaje = 0; // Variable para llevar un registro del puntaje.
    private int nivel = 1; // Nivel actual del jugador
    private float puntajeNecesarioParaSiguienteNivel = 10; // Puntaje requerido para avanzar al siguiente nivel

    private char[][] tablero; // Estructura de datos para almacenar las letras del tablero
    private int filas = 5;
    private int columnas = 5;
    private StringBuilder letrasGeneradas = new StringBuilder(); // Almacenará las letras generadas.
    private List<DataWordQuest> lista = new ArrayList<>();
    private List<Integer> indicesUtilizados = new ArrayList<>(); // Para almacenar los índices ya utilizados
    private String palabra1, palabra2, palabra3, palabra4;
    public int tiempoRestante2=60;
    private boolean tiempoAñadido = false;
    JPanel tableroPanel = new JPanel(new GridLayout(5, 5)); // Suponiendo una cuadrícula de 5x5

    /**
     * Creates new form WordQuestFrame
     */
    public WordQuestFrame() {
        initComponents();
        
        // Contenidos anteriores
        //Contenido de niveles
        lista.add(new DataWordQuest("hello", "world", "java", "programming"));
        lista.add(new DataWordQuest("sky", "sun", "moon", "stars"));
        lista.add(new DataWordQuest("water", "wint", "earth", "fire"));
        lista.add(new DataWordQuest("fruit", "apple", "peach", "watermelon"));
        lista.add(new DataWordQuest("vehicle", "car", "MotorBike", "bike"));
        
        
        
        // Configura el evento de clic para el botón "Enviar"
        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String palabraIngresada = txtPalabra.getText();

                float puntajeRonda = verificarPalabra(palabraIngresada); // Verifica la palabra ingresada
                actualizarPuntaje(puntajeRonda); // Actualiza el puntaje total del jugador

                verificarNivel(); // Verifica si el jugador ha avanzado de nivel
                txtPalabra.setText(""); // Limpia el campo de texto para la siguiente palabra
            }
        });
        
        Nivel.setText("Nivel: " + nivel); // Actualiza la etiqueta de nivel en la interfaz
        // Inicializa y muestra el tablero de letras
        inicializarTablero();
        mostrarTablero();
        
        


        // Configura un temporizador para la ronda
        Timer tempo = new Timer();
        tempo.scheduleAtFixedRate(new TimerTask() {
            int tiempoRestante = 60;

            @Override
            public void run() {
                Temporizador.setText("Tiempo: " + tiempoRestante + " segundos");
                tiempoRestante--;

                if (tiempoRestante < 0) {
                    tiempoRestante = 60;
                }
                // Si el jugador alcanza un múltiplo de 10 (excepto 50), y no se ha añadido tiempo en el nivel actual
                if (puntaje == 10 && puntaje < 50 && !tiempoAñadido) {
                    tiempoRestante += 60; // Agrega 60 segundos al tiempo
                    tiempoAñadido = true; // Marca que ya se ha añadido tiempo en el nivel actual
                    inicializarTablero(); // Mostrar nuevas palabras
                    mostrarTablero();
                }
                if (puntaje == 20 && puntaje < 50 && !tiempoAñadido) {
                    tiempoRestante += 60; // Agrega 60 segundos al tiempo
                    tiempoAñadido = true; // Marca que ya se ha añadido tiempo en el nivel actual
                    inicializarTablero(); // Mostrar nuevas palabras
                    mostrarTablero();
                }
                if (puntaje == 30 && puntaje < 50 && !tiempoAñadido) {
                    tiempoRestante += 60; // Agrega 60 segundos al tiempo
                    tiempoAñadido = true; // Marca que ya se ha añadido tiempo en el nivel actual
                    inicializarTablero(); // Mostrar nuevas palabras
                    mostrarTablero();
                }
                if (puntaje == 40 && puntaje < 50 && !tiempoAñadido) {
                    tiempoRestante += 60; // Agrega 60 segundos al tiempo
                    tiempoAñadido = true; // Marca que ya se ha añadido tiempo en el nivel actual
                    inicializarTablero(); // Mostrar nuevas palabras
                    mostrarTablero();
                }
                if (puntaje==12.5 || puntaje==22.5 || puntaje==32.5 ||puntaje==42.5){
                    tiempoAñadido=false;
                }
                // Si el jugador alcanza 50 puntos, detener el juego y mostrar mensaje de finalización
                if (puntaje >= 50) {
                    cancel(); // Detiene el temporizador
                    System.out.println("¡Felicidades! El juego ha terminado.");
                    // Aquí puedes agregar cualquier otra acción que desees ejecutar al final del juego
                }

            tiempoRestante2=tiempoRestante;
            }
        }, 0, 1000); // Inicia inmediatamente y luego repite cada 1000 ms (1 segundo)
    
    }
    
    private void inicializarTablero() {
       // Selección aleatoria de un objeto DataWordQuest de la lista
        DataWordQuest palabraRandom = seleccionarPalabraAleatoria();

        // Almacena las palabras en un array para desordenarlas
        palabra1=palabraRandom.getPalabra1();
        palabra2=palabraRandom.getPalabra2();
        palabra3=palabraRandom.getPalabra3();
        palabra4=palabraRandom.getPalabra4();
        List<String> palabras = new ArrayList<>();
        palabras.add(desordenarLetras(palabraRandom.getPalabra1()));
        palabras.add(desordenarLetras(palabraRandom.getPalabra2()));
        palabras.add(desordenarLetras(palabraRandom.getPalabra3()));
        palabras.add(desordenarLetras(palabraRandom.getPalabra4()));

        // Mostrar las palabras en los JLabel
        jLabel1.setText(palabras.get(0));
        jLabel2.setText(palabras.get(1));
        jLabel3.setText(palabras.get(2));
        jLabel4.setText(palabras.get(3));
    }

    private void mostrarTablero() {
        tableroPanel = new JPanel(new GridLayout(5, 5)); // Suponiendo una cuadrícula de 5x5
        // ... Aquí agregarías los componentes al tableroPanel ...
        // Por ejemplo, con un bucle que llena el panel con JLabels o botones para cada letra
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        
        Tablero.add(tableroPanel); // Suponiendo que Tablero es un JPanel en tu JFrame
        Tablero.revalidate(); // Esto le dice al layout manager que reconsidere el layout
        Tablero.repaint(); // Esto le dice a Swing que repinte el área donde están los cambios
    }

    private void actualizarPuntaje(float puntajeRonda) {
        puntaje += puntajeRonda; // Actualiza el puntaje total del jugador
        Puntaje.setText("Puntaje: " + puntaje); // Actualiza la etiqueta de puntaje en la interfaz
    }

    private void verificarNivel() {
        if (puntaje >= puntajeNecesarioParaSiguienteNivel) {
            nivel++; // El jugador ha avanzado al siguiente nivel
            puntajeNecesarioParaSiguienteNivel += 10; // Incrementa el puntaje necesario para el próximo nivel
            Nivel.setText("Nivel: " + nivel); // Actualiza la etiqueta de nivel en la interfaz
        }


        
    }


    private float verificarPalabra(String palabraIngresada) {
        float puntaje = 0;
        String palabraAComparar = palabraIngresada.trim().toLowerCase();

        if (palabraAComparar.equalsIgnoreCase(palabra1)) {
            puntaje += 2.5;
            jLabel1.setVisible(false);
        } else if (palabraAComparar.equalsIgnoreCase(palabra2)) {
            puntaje += 2.5;
            jLabel2.setVisible(false);
        } else if (palabraAComparar.equalsIgnoreCase(palabra3)) {
            puntaje += 2.5;
            jLabel3.setVisible(false);
        } else if (palabraAComparar.equalsIgnoreCase(palabra4)) {
            puntaje += 2.5;
            jLabel4.setVisible(false);
        }
        return puntaje;
    }


    
    private DataWordQuest seleccionarPalabraAleatoria() {
         Random random = new Random();
        int indiceRandom;

        // Asegurarse de que no se repitan los índices
        do {
            indiceRandom = random.nextInt(lista.size());
        } while (indicesUtilizados.contains(indiceRandom));

        // Añadir el índice a la lista de índices utilizados
        indicesUtilizados.add(indiceRandom);

        // Si todos los índices han sido utilizados, limpiamos la lista para empezar de nuevo
        if (indicesUtilizados.size() == lista.size()) {
            indicesUtilizados.clear();
        }

        return lista.get(indiceRandom);
    }
    
    private String desordenarLetras(String palabra) {
        List<Character> caracteres = new ArrayList<>();
        for (char c : palabra.toCharArray()) {
            caracteres.add(c);
        }
        Collections.shuffle(caracteres);
        StringBuilder palabraDesordenada = new StringBuilder();
        for (char c : caracteres) {
            palabraDesordenada.append(c);
        }
        return palabraDesordenada.toString();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tablero = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Temporizador = new javax.swing.JLabel();
        Puntaje = new javax.swing.JLabel();
        txtPalabra = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        Nivel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tablero.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout TableroLayout = new javax.swing.GroupLayout(Tablero);
        Tablero.setLayout(TableroLayout);
        TableroLayout.setHorizontalGroup(
            TableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TableroLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(TableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        TableroLayout.setVerticalGroup(
            TableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TableroLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        Temporizador.setText("Tiempo");

        Puntaje.setText("Puntaje");

        btnEnviar.setText("Enviar");

        Nivel.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Temporizador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Puntaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEnviar)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Tablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Nivel)
                        .addGap(14, 14, 14)
                        .addComponent(Temporizador)
                        .addGap(18, 18, 18)
                        .addComponent(Puntaje)
                        .addGap(18, 18, 18)
                        .addComponent(txtPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnEnviar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Tablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(WordQuestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WordQuestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WordQuestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WordQuestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WordQuestFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nivel;
    private javax.swing.JLabel Puntaje;
    private javax.swing.JPanel Tablero;
    private javax.swing.JLabel Temporizador;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtPalabra;
    // End of variables declaration//GEN-END:variables

}
