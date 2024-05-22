package kontrwork2;

import java.io.File;

public class Mainn {
    public static void main(String[] args) {
        File directory = new File("C:\\Users\\Софья Шувалова\\Downloads\\Telegram Desktop\\cw2\\v4");
        File[] files = directory.listFiles();

        assert files != null;
        for (File file : files) {
            FileReaderThread thread = new FileReaderThread(file);
            thread.start();
        }

        // Ждем завершения всех потоков
        for (File file : files) {
            try {
                FileReaderThread thread = new FileReaderThread(file);
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        TextCombiner.combineTextFiles(files, "v4.txt");
    }
}