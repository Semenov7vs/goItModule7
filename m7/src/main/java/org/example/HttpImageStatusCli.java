package org.example;

import java.util.Scanner;

class HttpImageStatusCli {

    public void askStatus() {
        HttpStatusImageDownloader imageDownloader = new HttpStatusImageDownloader();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть код статусу: ");
        String input = scanner.nextLine();

        try {
            int statusCode = Integer.parseInt(input);
            imageDownloader.downloadStatusImage(statusCode);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
        } catch (Exception e) {
            System.out.println("There is no image for HTTP status " + input);
        }
    }
}
