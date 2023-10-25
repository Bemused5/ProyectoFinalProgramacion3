/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import java.io.*;
import java.util.*;

public class AnagramManager {
    private ArrayList<String> palabrasUsadas; // Almacena las palabras ya utilizadas
    private List<String[]> anagramas; // Lista de anagramas disponibles

    public AnagramManager(BufferedReader reader) {
        palabrasUsadas = new ArrayList<>();
        anagramas = new ArrayList<>();
        cargarAnagramasDeArchivo(reader);
    }

    private void cargarAnagramasDeArchivo(BufferedReader reader) {
        try {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split("\t"); // Suponiendo que el formato es "palabra\tdescripcion"
                if (partes.length == 2) {
                    anagramas.add(partes);
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Maneja esto de la manera que desees
        }
    }

    public String[] obtenerNuevoAnagrama() {
        if (anagramas.isEmpty()) {
            return null; // o manejar esto de otra manera, si no hay más anagramas
        }

        String[] anagrama;
        do {
            int indiceAleatorio = new Random().nextInt(anagramas.size());
            anagrama = anagramas.get(indiceAleatorio);
        } while (palabrasUsadas.contains(anagrama[0]));

        palabrasUsadas.add(anagrama[0]); // Agrega la palabra usada a la lista
        return anagrama;
    }
}

