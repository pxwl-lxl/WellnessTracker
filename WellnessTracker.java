// -----------------------------------------------------------------
// Current Version: 1.0.0 (https://github.com/pxwl-lxl/WellnessTracker.git)
// -----------------------------------------------------------------

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WellnessTracker {

    static Scanner userInput = new Scanner(System.in);

    static String name;
    static String studentID;

    // Initial daily wellness records
    // static double sleep = 0;
    // static int exercise = 0;
    // static double water = 0;

    // Initial wellness goals
    // static double sleepGoal = 8;
    // static int exerciseGoal = 60;
    // static double waterGoal = 2;

    public static void main(String[] args) {

        displayWelcomeHeader();
        enterStudentInformation();

        System.out.print("\nWelcome, " + name + "!\n\n");

        int choice;

        do {
            mainMenu();

            System.out.print("Enter your choice: ");
            choice = userInput.nextInt();

            switch (choice) {

                case 1:
                    manageDailyRecords(); // Jymrel
                    break;
                case 2:
                    viewWellnessReport(); // Lourence
                    break;
                case 3:
                    // manageGoals(); // wala pa
                    break;
                case 4:
                    // viewAchievements(); // wala pa
                    break;
                case 5:
                    // studentProfile(); // wala pa
                    break;
                case 6:
                    // wellnessGuide(); // wala pa
                    break;
                case 7:
                    // resetAllData(); // wala pa
                    break;
                case 0:
                    // exit(); // wala pa
                    System.out.println("\nThank you for our Wellness Tracker!");
                    break;

                default:
                    System.out.println("\nInvalid choice!");
            }

        } while (choice != 0);

        userInput.close();

    }

    // Reusable border line - Paul 11/1/26
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
        name = userInput.nextLine();

        System.out.print("Enter your Student ID: ");
        studentID = userInput.nextLine();

    }

    static void mainMenu() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        String formattedDate = today.format(formatter);

        line();
        System.out.println("|             STUDENT WELLNESS TRACKER              |");
        System.out.println("|            Your Health, Your Progress             |");
        line();
        System.out.println("| Student: " + name + "               Date: " + formattedDate + "  |");
        System.out.println("| Student ID: " + studentID + "                     |");
        line();
        System.out.println("|                  TODAY'S STATS                    |");
        System.out.println("|                                                   |");
        System.out.println("| +----------------------+  +----------------------+|");
        System.out.println("| |     WELLNESS SCORE           SLEEP DURATION    ||");
        System.out.println("| |        +                            +          ||");
        System.out.println("| +----------------------+  +----------------------+|");
        System.out.println("|                                                   |");
        System.out.println("| +----------------------+  +----------------------+|");
        System.out.println("| |     EXERCISE TIME             WATER INTAKE     ||");
        System.out.println("| |            +                         +         ||");
        System.out.println("| +----------------------+  +----------------------+|");
        line();
        System.out.println("|                    MAIN MENU                      |");
        line();
        System.out.println("|   [1] Manage Daily Records                        |");
        System.out.println("|   [2] View Wellness Reports                       |");
        System.out.println("|   [3] Manage Goals                                |");
        System.out.println("|   [4] View Achievements                           |");
        System.out.println("|   [5] Student Profile                             |");
        System.out.println("|   [6] Wellness Guide                              |");
        System.out.println("|   [7] Reset All Data                              |");
        System.out.println("|   [0] Exit                                        |");
        line();

    }

    static void manageDailyRecords() {
        line();
        System.out.println("|               MANAGE DAILY RECORDS                |");
        line();
        System.out.println("| Sleep: + hours                                    |");
        System.out.println("| Exercise: + minutes                               |");
        System.out.println("| Water intake: + liters                            |");
        line();
        System.out.println("| Wellness score: +                                 |");
        System.out.println("| Disclamer: Score is a habit-tracking indicator,   |");
        System.out.println("| not a medical assessment.                         |");
        line();
        System.out.println("| [0] Back to Main Menu                             |");
        line();

        System.out.print("Enter your choice: ");
        int choice = userInput.nextInt();
    }

    static void viewWellnessReport() {
        line();
        System.out.println("|                 WELLNESS REPORT                  |");
        line();
        System.out.println("|                 DAILY SUMMARY                    |");
        line();
        System.out.println("|  Sleep: + hours                                  |");
        System.out.println("|  Exercise: + minutes                             |");
        System.out.println("|  Water Intake: + liters                          |");
        line();
        System.out.println("| Wellness Score: +/100                            |");
        System.out.println("| Disclaimer: Score is a habit-tracking indicator, |");
        System.out.println("| not a medical assesment.");
        line();
        System.out.println("| [0] Back to Main Menu                            |");
        line();

        System.out.print("Enter your choice: ");
        int choice = userInput.nextInt();

    }
}