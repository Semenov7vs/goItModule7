package org.example;

import java.net.HttpURLConnection;
import java.net.URL;

public class HttpStatusChecker {

    String getStatusImage(int code) throws Exception{

        String url = "https://http.cat/" + code + ".jpg";

        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("HEAD");
        int responseCode = connection.getResponseCode();
        connection.disconnect();

        if (responseCode == 404) {
            throw new Exception("Зображення не знайдено по цьому коду: " + code);
        }
        return url;
    }
}

