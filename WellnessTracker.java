import java.util.Scanner;

public class WellnessTracker {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // ------------------------------------------------------------------
        // Version 1.0.0
        // Last github commit 11/1/26 (msg sa group chat before
        // you make changes para ma save namin file for backups.)
        // ------------------------------------------------------------------

        // static String name;
        // static String studentID;

        // Initial daily wellness records
        // static double sleep = 0;
        // static int exercise = 0;
        // static double water = 0;

        // Initial wellness goals
        // static double sleepGoal = 8;
        // static int exerciseGoal = 60;
        // static double waterGoal = 2;

        displayWelcomeHeader();
        enterStudentInformation();

    }

    // Reusable border - Paul 11/1/26
    public static void line() {
        System.out.println("+---------------------------------------------------+");
    }

    public static void displayWelcomeHeader() {
        line();
        System.out.println("|                 Wellness Tracker                  |");
        System.out.println("|         Java Final Project by Group 3:            |");
        line();
    }

    public static void enterStudentInformation() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your Student ID: ");
        String studentID = scanner.nextLine(); // Put restriction - Paul 11/1/26

        scanner.close();
    }
}
