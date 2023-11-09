/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.UInterfaces.AntoniJuego1.wordquest;

import java.util.Random;

/**
 *
 * @author daasa
 */
public class DataWordQuest {
    private String palabra1;
    private String palabra2;
    private String palabra3;
    private String palabra4;
    
    public DataWordQuest(String palabra1, String palabra2, String palabra3, String palabra4) {
        this.palabra1 = palabra1;
        this.palabra2 = palabra2;
        this.palabra3 = palabra3;
        this.palabra4 = palabra4;
    }


    public String getPalabra1() {
        return palabra1;
    }

    public void setPalabra1(String palabra1) {
        this.palabra1 = palabra1;
    }

    public String getPalabra2() {
        return palabra2;
    }

    public void setPalabra2(String palabra2) {
        this.palabra2 = palabra2;
    }

    public String getPalabra3() {
        return palabra3;
    }

    public void setPalabra3(String palabra3) {
        this.palabra3 = palabra3;
    }

    public String getPalabra4() {
        return palabra4;
    }

    public void setPalabra4(String palabra4) {
        this.palabra4 = palabra4;
    }
    
    
}
