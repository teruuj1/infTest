package kontrwork2;
import java.io.File;

public class FileReaderThread extends Thread {
    private final File file;

    public FileReaderThread(File file) {
        this.file = file;
    }

    @Override
    public void run() {
        MyFileReader.readFile(file);
    }
}
