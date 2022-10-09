import java.util.LinkedList;
import java.util.Scanner;

public class School {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String args[]) {

        String actionChoice;

        Actions action1 = new Actions("Create Your Own School", "COS");

        Actions action2 = new Actions("Login into your own school", "LOS");

        Actions action3 = new Actions("Delete your own school", "DOS");

        LinkedList<Actions> actions = new LinkedList<Actions>();

        actions.push(action1);
        actions.push(action2);
        actions.push(action3);


        System.out.println("===================================================");
        System.out.println("Welcome to the school management system using JAVA");
        System.out.println("Want brings you here today? ");

        for (int i = actions.size(); i > 0; i--) {
            // System.out.println(ANSI_GREEN + "Option " + (i + 1) + ": " + actions.get(i) + " ==> " + actions.get(i) + ANSI_RESET);
        }

        System.out.println("ACTION: ");
        Scanner sc = new Scanner(System.in);

        actionChoice = sc.nextLine().toLowerCase();

        if (actionChoice.equals(action3.initial.toLowerCase())) {
            action3.deleteSchool();
        } else if (actionChoice.equals(action2.initial.toLowerCase())) {
            action2.login();
        } else if (actionChoice.equals(action1.initial.toLowerCase())) {
            action3.createSchool();
        }
        sc.close();
    }
}
