/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.BufferedReader;
import org.json.JSONObject;

public class ApiIntegration {

    public static void main(String[] args) {
        String[] response = callOpenAIApi();
        if(response != null) {
            System.out.println(response[1]);
        }
    }


public static String[] callOpenAIApi() {
    try {
        // La URL y los parámetros de configuración de la petición HTTP
        URL url = new URL("https://api.openai.com/v1/chat/completions");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("Authorization", "Bearer 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"); // Recuerda no exponer tus llaves de API públicamente.
        conn.setDoOutput(true);

        // El cuerpo de la petición
        String input = "{"
                + "\"model\": \"gpt-3.5-turbo\","
                + "\"messages\": [{\"role\": \"user\", \"content\": \"Quiero que me des una palabra, el tema es informática, cosas de tecnología y computación que puede conocer un niño en un grado de escolaridad secundaria y que no sean temas tan actuales. Quiero que también me des una descripción corta para poder entender un poco cual es la palabra que busco, esta no debe de ser mas de un renglon, y en la descripcion no incluyas la palabra que debe de adivinar el usuario, haz que el usuario tenga que adivinar por lo que conoce, despues revuelve las letras de la palabra. El resultado me lo debes de dar de la siguiente forma: Palabra\\n Descripción\\n Palabra revuelta \"}],"
                + "\"temperature\": 0.7"
                + "}";

        try (OutputStream os = conn.getOutputStream()) {
            byte[] inputBytes = input.getBytes("utf-8");
            os.write(inputBytes, 0, inputBytes.length);
        }

        // Leer la respuesta
        StringBuilder responseSB = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"))) {
            String responseLine;
            while ((responseLine = br.readLine()) != null) {
                responseSB.append(responseLine.trim());
            }
        }

        // Procesar la respuesta JSON y extraer la información
        JSONObject jsonResponse = new JSONObject(responseSB.toString());
        String content = jsonResponse.getJSONArray("choices").getJSONObject(0).getJSONObject("message").getString("content");
        String[] splitContent = content.split("\n");
        return splitContent; // Devuelve un arreglo con [Palabra, Descripción, Palabra revuelta]

    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}



}

