package kontrwork2;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class TextCombiner {
    public static void combineTextFiles(File[] files, String combinedFileName) {
        try (FileWriter writer = new FileWriter(combinedFileName)) {
            for (File file : files) {
                try (RandomAccessFile raf = new RandomAccessFile(file, "r")) {
                    raf.readInt(); // skip 'k'
                    byte[] data = new byte[raf.readInt()];
                    raf.read(data);
                    writer.write(new String(data, StandardCharsets.UTF_8));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
