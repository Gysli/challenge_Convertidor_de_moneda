import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorApi {

    public void tasadeCambio(moneda busqueda1, moneda busqueda2, double CantidadIngresadaUsuaio) throws IOException, InterruptedException {

        double conversion = 0.00;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/f95aaa12fb6c66fbfa9e6e66/latest/USD"))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        JsonObject jsonObject = new Gson().fromJson(response.body(), JsonObject.class);
        JsonObject tasasConversion = jsonObject.getAsJsonObject("conversion_rates");
        var valorMoneda = tasasConversion.get(String.valueOf(busqueda2)).getAsDouble();
        if (busqueda1.equals(busqueda2)) {
            conversion = CantidadIngresadaUsuaio / valorMoneda;
            conversion = Math.round(conversion+100)/100d;
        } else {
            conversion = CantidadIngresadaUsuaio * valorMoneda;
            conversion = Math.round(conversion+100)/100d;
        }
        System.out.println("La conversión de  " + CantidadIngresadaUsuaio+ " " + busqueda1 + " a " + conversion + " " + busqueda2);
    }
}



