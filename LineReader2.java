import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LineReader2 {
    public static void main(String args[]) {

    }

    public static int main(String filepath) {
        int count = 0;
        try {
            Path file = Paths.get(filepath);

            count = (int)Files.lines(file).count();

        } catch (Exception e) {
            e.getStackTrace();
            System.out.println(e);
            System.exit(0);
        }
        return count;
    }

}
