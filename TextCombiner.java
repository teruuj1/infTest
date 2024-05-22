package kontrwork2;
import java.io.*;

public class TextCombiner {
    public static void combineTextFiles(File[] files, String outputFileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            for (File file : files) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        writer.write(line);
                        writer.newLine();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
