import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


public class PrincipalAPI {

    public static void main(String[] args) throws IOException, InterruptedException{


        URL url = new URL("https://v6.exchangerate-api.com/v6/f95aaa12fb6c66fbfa9e6e66/pair");
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        // convertir a JSON

        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();

        // Accediendo al objeto
        String req_result = jsonobj.get("result").getAsString();
        System.out.println(req_result);


    }

    public String PrincipalAPI(int opcion, double cantidadIngresadaUsuario) {

        return "";
    }
}