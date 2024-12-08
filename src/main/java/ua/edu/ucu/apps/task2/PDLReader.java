package ua.edu.ucu.apps.task2;

import org.json.JSONObject;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class PDLReader {
    private static final String API_KEY = "";

    @SuppressWarnings("deprecation")
    public JSONObject getCompanyData(String website) throws IOException {
        URL url = new URL("https://api.peopledatalabs.com/v5/company/enrich?website=" + website);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("twitter-api-key", API_KEY);
        connection.connect();
        @SuppressWarnings("resource")
        String text = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
        return new JSONObject(text);
    }
}