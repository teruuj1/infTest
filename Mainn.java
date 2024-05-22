package kontrwork2;

import java.io.File;

public class Mainn {
    public static void main(String[] args) {
        File directory = new File("C:\\Users\\Софья Шувалова\\Downloads\\Telegram Desktop\\cw2\\v4");
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                Thread thread = new Thread(new FileReaderThread(file));
                thread.start();
            }
        }

        if (files != null) {
            for (File file : files) {
                try {
                    Thread thread = new Thread(new FileReaderThread(file));
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        if (files != null) {
            TextCombiner.combineTextFiles(files, "v4.txt");
        }
    }
}