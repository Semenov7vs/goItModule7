package org.example;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpStatusImageDownloader {

    void downloadStatusImage(int code) throws Exception{

        String fileName = code + ".jpg";
        HttpStatusChecker httpStatusChecker = new HttpStatusChecker();
       String imageUrl = httpStatusChecker.getStatusImage(code);

        HttpURLConnection connection = (HttpURLConnection) new URL(imageUrl).openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode == 200) {
            try (InputStream inputStream = connection.getInputStream();
                 FileOutputStream outputStream = new FileOutputStream(fileName)) {
                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
            }
            System.out.println("Зображення успішно завантажене: " + fileName);
        } else {
            throw new Exception("Зображення не знайдено по цьому коду: " + code);
        }

        connection.disconnect();
    }

    }

