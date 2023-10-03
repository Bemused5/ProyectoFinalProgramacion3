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
import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class ApiIntegration {

    public static void main(String[] args) {
        String[] response = callOpenAIApi();
        if(response != null) {
            System.out.println(response[1]);
        }
    }


public static String[] callOpenAIApi() {
    try {
        System.out.println("Iniciando llamada a la API...");

        URL url = new URL("https://api.openai.com/v1/chat/completions");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("Authorization", "Bearer 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");
        conn.setDoOutput(true);

        String input = "{"
                + "\"model\": \"gpt-3.5-turbo\","
                + "\"messages\": [{\"role\": \"user\", \"content\": \"Quiero que me des una palabra, el tema es informática, cosas de tecnología y computación que puede conocer un niño en un grado de escolaridad secundaria y que no sean temas tan actuales. Quiero que también me des una descripción corta para poder entender un poco cual es la palabra que busco, esta no debe de ser mas de un renglon, y en la descripcion no incluyas la palabra que debe de adivinar el usuario. Haz que el usuario tenga que adivinar por lo que conoce. El resultado me lo debes de dar de la siguiente forma: Palabra\\n Descripción\"}],"
                + "\"temperature\": 0.7"
                + "}";

        try (OutputStream os = conn.getOutputStream()) {
            byte[] inputBytes = input.getBytes("utf-8");
            os.write(inputBytes, 0, inputBytes.length);
        }

        int responseCode = conn.getResponseCode();
        System.out.println("Código de Respuesta HTTP: " + responseCode);

        StringBuilder responseSB = new StringBuilder();
        if(responseCode == 200) { // Código HTTP OK
            try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"))) {
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                    responseSB.append(responseLine.trim());
                }
            }
        } else {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getErrorStream(), "utf-8"))) {
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                    responseSB.append(responseLine.trim());
                }
            }
        }

        System.out.println("Respuesta completa: " + responseSB.toString());

        JSONObject jsonResponse = new JSONObject(responseSB.toString());
        String content = jsonResponse.getJSONArray("choices").getJSONObject(0).getJSONObject("message").getString("content");
        String[] splitContent = content.split("\n");
        
        String palabra = splitContent[0];
        String descripcion = splitContent[1];
        String palabraRevuelta = revuelvePalabra(palabra);

        System.out.println(palabra);
        System.out.println(descripcion);
        System.out.println(palabraRevuelta);

        return new String[] {palabra, descripcion, palabraRevuelta};

    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}


    public static String revuelvePalabra(String palabra) {
    Random rand = new Random();
    Set<Integer> indicesUsados = new HashSet<>();
    StringBuilder palabraFinal = new StringBuilder();

    while (indicesUsados.size() < palabra.length()) {
        int indiceAleatorio = rand.nextInt(palabra.length());
        if (!indicesUsados.contains(indiceAleatorio)) {
            palabraFinal.append(palabra.charAt(indiceAleatorio));
            indicesUsados.add(indiceAleatorio);
        }
    }

    return palabraFinal.toString();
    }


}

