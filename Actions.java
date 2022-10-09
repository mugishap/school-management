import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Actions {
    public String actionName;
    public String initial;

    public static void main(String args[]) {
    }

    public Actions(String actionName, String initial) {
        this.actionName = actionName;
        this.initial = initial;
    }


    public void createSchool() {
        try {
            Scanner name = new Scanner(System.in);
            String schoolName, passcode;
            System.out.println("Enter the name of your school: ");
            schoolName = name.nextLine();
            System.out.println("Enter school passcode: ");
            passcode = name.nextLine();
            try (FileWriter schoolCreator = new FileWriter("schools.txt")) {
                LineReader lines = new LineReader();
                int nextId = lines.getLines("schools.txt") + 1;
                schoolCreator.write("ID:" + nextId + ",Name:" + schoolName + ",Passcode:" + passcode + "\n");
                schoolCreator.close();
            }

            name.close();
        } catch (

        Exception e) {
            System.out.println(e);
            // System.exit();
        }

    }

    public void deleteSchool() {
        try {

            String confirmation;
            try (Scanner confirm = new Scanner(System.in)) {
                System.out.println("Are you sure you want to delete your school (Y/N)? ");
                confirmation = confirm.next();
                if (confirmation.toLowerCase().equals("y")) {
                    String schoolName, passcode;
                    System.out.println("Enter the name of your school how it was registered: ");
                    schoolName = confirm.nextLine();
                    System.out.println("Enter the passcode of your school: ");
                    passcode = confirm.nextLine();

                    File filename = new File("schools.txt");
                    try (Scanner reader = new Scanner(filename)) {
                        while (reader.hasNextLine()) {
                            String data = reader.nextLine();
                            System.out.println(data);
                        }
                        // myReader.
                    }

                    System.out.println("Authenticating ----> " + schoolName + " & " + passcode);
                    // Read File

                } else if (confirmation.toLowerCase().equals("n")) {
                    System.out.println("Great, now we can continue");
                    // System.exit();
                } else {
                    System.out.println("You entered an invalid character");
                    // System.exit();
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println("Error deleting your school");
        }
    }

    public void login() {
        try {

            String schoolName, passcode;
            try (Scanner name = new Scanner(System.in)) {
                System.out.println("Enter the name of your school: ");
                schoolName = name.nextLine();
                System.out.println("Enter school passcode: ");
                passcode = name.nextLine();
            }

            System.out.println("Authenticating ----> " + schoolName + " & " + passcode);
            // Read File to See if there is that school

            File filename = new File("schools.txt");
            try (Scanner reader = new Scanner(filename)) {
                while (reader.hasNextLine()) {
                    String data = reader.nextLine();
                    System.out.println(data);
                }
                // myReader.
            }
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }

    }

}
