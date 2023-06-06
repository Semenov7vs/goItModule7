package org.example;

public class Test {

    public static void main(String[] args) {

            HttpStatusChecker httpStatusChecker = new HttpStatusChecker();
//            try {
//                String imageUrl = httpStatusChecker.getStatusImage(200);
//                System.out.println("Зображення: " + imageUrl);
//            } catch (Exception e) {
//                System.out.println("Виключення: " + e.getMessage());
//            }

        HttpStatusImageDownloader httpStatusImageDownloader = new HttpStatusImageDownloader();
//        try {
//            httpStatusImageDownloader.downloadStatusImage(300);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        HttpImageStatusCli httpImageStatusCli = new HttpImageStatusCli();
        httpImageStatusCli.askStatus();
    }
}