import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Tester {
    public static void main(String[] args) {
        try {
            String fileTxt = "src/file.txt";
            Stream<String> fileTxtReading = Files.lines(Path.of(fileTxt));
            fileTxtReading.forEach(text -> System.out.println(text));
        } catch (IOException ioException) {
            System.err.println("Error!");
            ioException.printStackTrace();
        }
    }
}