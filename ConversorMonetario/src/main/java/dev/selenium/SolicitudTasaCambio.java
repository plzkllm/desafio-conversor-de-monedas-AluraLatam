package dev.selenium;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SolicitudTasaCambio {

    public static String obtenerTasaDeCambio(String moneda){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/f9f67d14c8af9660ae1267f5/latest/"+moneda);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();;
            return json;
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
