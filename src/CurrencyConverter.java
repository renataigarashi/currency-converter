import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyConverter {
    public CurrencyResult currencyConverterResult(String currencyBase, String currencyTarget, double amount) {
        String apiKey = "584c83099f8c4ab187b2315b";

        URI apiAddress = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + currencyBase + "/" + currencyTarget + "/" + amount);


        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(apiAddress).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), CurrencyResult.class);
        } catch(Exception e) {
            throw new RuntimeException("Invalid Conversion!");
        }

    }
}