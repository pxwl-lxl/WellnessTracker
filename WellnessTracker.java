
// -----------------------------------------------------------------
// Current Version: 1.1.0 (https://github.com/pxwl-lxl/WellnessTracker.git)
// Last commit: 11/22/26 4:20 PM
// -----------------------------------------------------------------
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WellnessTracker {

    static Scanner userInput = new Scanner(System.in);

    static String name;
    static String studentID;

    static int choice;

    // Initial daily wellness records
    static double sleep = 0.0;
    static int exercise = 0;
    static double water = 0.0;

    // Initial wellness goals (I-research ang recommended)
    static double sleepGoal = 8;
    static int exerciseGoal = 60;
    static double waterGoal = 2;

    public static void main(String[] args) {

        displayWelcomeHeader();
        enterStudentInformation();

        do {
            mainMenu(); // Jymrel
            choice = enterChoice();

            switch (choice) {

                case 1:
                    ManageDailyRecords.manageDailyRecords(); // Jymrel
                    break;
                case 2:
                    ViewWellnessReports.viewWellnessReports(); // Lourence
                    break;
                case 3:
                    ManageGoals.manageGoals(); // Paul
                    break;
                case 4:
                    ViewAchievements.viewAchievements(); // Paul
                    break;
                case 5:
                    StudentProfile.studentProfile(); // Paul
                    break;
                case 6:
                    WellnessGuide.wellnessGuide(); // Jymrel
                    break;
                case 7:
                    ResetAllData.resetAllData(); // Paul
                    break;
                case 0:
                    // exit(); // wala pa. ma create ako UI for this - paul
                    System.out.println("\nThank you for our Wellness Tracker!");
                    break;

                default:
                    System.out.println("\nInvalid choice!");
                    break;
            }

        } while (choice != 0);

        userInput.close();

    }

    // Reusable border line
    static void line() {
        System.out.println("+----------------------------------------------------+");
    }

    // Reusable enter your choice
    static int enterChoice() {
        while (true) {
            System.out.print("Enter your choice: ");
            int choice = readInt();

            if (choice >= 0 && choice <= 7) {
                return choice;
            }

            System.out.print("Invalid choice! Please select a number from the menu.\n");
        }
    }

    // Reading an integer, para ma detect ang errors
    static int readInt() {
        while (!userInput.hasNextInt()) {
            System.out.print("Invalid input! Enter a valid number: ");
            userInput.nextLine();
        }
        int choice = userInput.nextInt();
        return choice;
    }

    // Reading a double, para ma detect ang errors
    static double readDouble() {
        while (!userInput.hasNextDouble()) {
            System.out.print("Invalid choice! Please select a number from the menu.\n");
            userInput.nextLine();
        }
        double choice = userInput.nextInt();
        return choice;
    }

    // Main menu
    public static void displayWelcomeHeader() {
        line();
        System.out.println("|                  Wellness Tracker                  |");
        System.out.println("|          Java Final Project by Group 3:            |");
        line();
    }

    static void enterStudentInformation() {
        while (true) {
            System.out.print("Enter your name (max 30 characters): ");
            name = userInput.nextLine().trim().toUpperCase();

            if (!name.isEmpty() && name.length() <= 30) {

                boolean valid = true;

                for (int i = 0; i < name.length(); i++) {
                    if (!Character.isLetter(name.charAt(i)) && name.charAt(i) != ' ') {
                        valid = false;
                        break;

                    }
                }

                if (valid) {
                    break;
                }
            }
            System.out.println("Invalid name! Use only letters, with a maximum of 30 characters.\n");
        }

        while (true) {
            System.out.print("Enter your Student ID (max 9 characters): ");
            studentID = userInput.nextLine().trim().toUpperCase();

            boolean valid = !studentID.isEmpty() && studentID.length() <= 9;

            for (int i = 0; i < studentID.length(); i++) {
                if (!Character.isLetterOrDigit(studentID.charAt(i))) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                break;
            }

            System.out.println("Invalid Student ID! Use only letters and numbers, with a maximum of 9 characters.\n");
        }

    }

    static void mainMenu() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        String formattedDate = today.format(formatter);

        line();
        System.out.println("|              STUDENT WELLNESS TRACKER              |");
        System.out.println("|             Your Health, Your Progress             |");
        line();
        System.out.printf("| Student: %-22.20s Date: %-12s |%n", name, formattedDate);
        System.out.printf("| Student ID: %-38.9s |%n", studentID);
        line();
        System.out.println("|                  TODAY'S STATS                     |");
        System.out.println("|                                                    |");
        System.out.println("| +----------------------+  +----------------------+ |");
        System.out.println("| |    WELLNESS SCORE    |  |    SLEEP DURATION    | |");
        System.out.printf("| |     %3d / 100        |  |  %4.1f / %4.1f Hours   | |%n",
                CalculateScore.calculateScore(), sleep, sleepGoal);
        System.out.println("| +----------------------+  +----------------------+ |");
        System.out.println("|                                                    |");
        System.out.println("| +----------------------+  +----------------------+ |");
        System.out.println("| |    EXERCISE TIME     |  |     WATER INTAKE     | |");
        System.out.printf("| | %4d /%4d Minutes   |  | %5.1f /%5.1f Liters  | |%n", exercise, exerciseGoal,
                water, waterGoal);
        System.out.println("| +----------------------+  +----------------------+ |");
        line();
        System.out.println("|                    MAIN MENU                       |");
        line();
        System.out.println("| [1] Manage Daily Records                           |");
        System.out.println("| [2] View Wellness Reports                          |");
        System.out.println("| [3] Manage Goals                                   |");
        System.out.println("| [4] View Achievements                              |");
        System.out.println("| [5] Student Profile                                |");
        System.out.println("| [6] Wellness Guide                                 |");
        System.out.println("| [7] Reset All Data                                 |");
        System.out.println("| [0] Exit                                           |");
        line();

    }

}