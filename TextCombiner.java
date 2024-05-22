package kontrwork2;
import java.io.*;

public class TextCombiner {
    public static void combineTextFiles(File[] files, String outputFileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            for (File file : files) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    int k = Integer.parseInt(reader.readLine());
                    char[] data = new char[k];
                    reader.read(data);
                    int d = Integer.parseInt(reader.readLine());
                    int p = Integer.parseInt(reader.readLine());
                    writer.write(data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
