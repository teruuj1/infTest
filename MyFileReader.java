package kontrwork2;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileReader {
    private static final Object lock = new Object();
    private static final String logFileName = "v4.log";

    public static void readFile(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file.getPath()))) {
            int k = Integer.parseInt(reader.readLine());
            char[] data = new char[k];
            reader.read(data);
            int d = Integer.parseInt(reader.readLine());
            int p = Integer.parseInt(reader.readLine());

            synchronized (lock) {
                writeToLog("прочитали файл " + file.getName() + " кол-во байт данных: " + k
                        + ", кол-во считанных символов: " + data.length
                        + ", контрольное число: " + d + ", номер части: " + p);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeToLog(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFileName))) {
            writer.write(message);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
