import java.util.Scanner;

public class LineReader {
    public static void main(String args[]) {

    }

    public int getLines(String filepath) {
        int count = 0;
        try {
            Scanner sc = new Scanner(filepath);
            while (sc.hasNextLine()) {
                sc.nextLine();
                count++;
            }
            sc.close();
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println(e);
            System.exit(0);
        }
        return count;
    }
}
