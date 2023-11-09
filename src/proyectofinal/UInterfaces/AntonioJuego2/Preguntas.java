/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.UInterfaces.AntonioJuego2;

/**
 *
 * @author jacr3
 */
public class Preguntas {
    private String Pregunta;
    private String Opcion1;
    private String Opcion2;
    private String Opcion3;
    private String Opcion4;
    private String OpcionCorrecta;

    public Preguntas(String Pregunta, String Opcion1, String Opcion2, String Opcion3, String Opcion4, String OpcionCorrecta) {
        this.Pregunta = Pregunta;
        this.Opcion1 = Opcion1;
        this.Opcion2 = Opcion2;
        this.Opcion3 = Opcion3;
        this.Opcion4 = Opcion4;
        this.OpcionCorrecta = OpcionCorrecta;
    }
    public String getPregunta() {
        return Pregunta;
    }

    public String getOpcion1() {
        return Opcion1;
    }

    public String getOpcion2() {
        return Opcion2;
    }

    public String getOpcion3() {
        return Opcion3;
    }

    public String getOpcion4() {
        return Opcion4;
    }

    public String getOpcionCorrecta() {
        return OpcionCorrecta;
    }        
    
    
}
