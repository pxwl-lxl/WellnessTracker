
// -----------------------------------------------------------------
// Current Version: 1.3.0 (https://github.com/pxwl-lxl/WellnessTracker.git)
// Last commit: 11/25/26 7:19 AM
// -----------------------------------------------------------------
import java.util.Scanner;
import java.time.LocalDate;
import java.io.File;
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

   // COLORS
	static final String RESET = "\033[0m";
	static final String CYAN = "\033[96m";
	static final String GREEN = "\033[92m";
	static final String YELLOW = "\033[93m";
	static final String BLUE = "\033[94m";
	static final String PURPLE = "\033[95m";
	static final String WHITE = "\033[97m";
	static final String GRAY = "\033[90m";
	static final String BOLD = "\033[1m";

    // upperLine and lowerLine
    static String border;

    public static void main(String[] args) {

        displayWelcomeHeader();
        enterStudentInformation();

        do {
            clearScreen();
            
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

    public static void clearScreen() {
            for (int i = 0; i < 30; i++) {
                System.out.println();
            }
        }

    // Reusable border line
    static void longLine() { // Long white line
        border = "═".repeat(117);
        System.out.println(WHITE + border + RESET);
    }

    static void longUpperLine() { // Long upper line
        border = "╔" + "═".repeat(115) + "╗";
        System.out.println(CYAN + border + RESET);
    }

    static void longLowerLine() { // Long lower line
        border = "╚" + "═".repeat(115) + "╝";
        System.out.println(CYAN + border + RESET);
    }

    static void longMiddleLine() { // Long middle line
        border = "╠" + "═".repeat(115) + "╣";
        System.out.println(CYAN + border + RESET);
    }

    static void upperLine() { // Short upper line 
        border = "╔" + "═".repeat(55) + "╗";
        System.out.println(CYAN + border + "   " + border + RESET);
    }

    static void middleLine() { // Short middle line
        border = "╠" + "═".repeat(55) + "╣";
        System.out.println(CYAN + border + "   " + border + RESET);
    }

    static void lowerLine() { // Short lower line
        border = "╚" + "═".repeat(55) + "╝";
        System.out.println(CYAN + border + "   " + border + RESET);
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
        double choice = userInput.nextDouble();
        return choice;
    }

    // Main menu
    public static void displayWelcomeHeader() {
        longLine();
        upperLine();
        System.out.println(CYAN + "║                                                       ║   ║                                                       ║");
        System.out.println(CYAN + "║                   Wellness Tracker                    ║   ║   THE LEGENDARY PROGRAMMERS THAT MADE IT POSSIBLE!    ║");
        System.out.println(CYAN + "║                                                       ║   ║                                                       ║" + RESET);
        lowerLine();
    }

    static void enterStudentInformation() {
        while (true) {
            longLine();
            upperLine();
            System.out.print(CYAN + "║                                                       ║   ║                                                       ║\n");
            System.out.print(CYAN + "║                                                       ║   ║  - Lourence Jun P. Animas   (   Roles   )             ║\n");
            System.out.print(CYAN + "║                    app logo                           ║   ║  - Paul Angelo P. Binbinon  (   Roles   )             ║\n");
            System.out.print(CYAN + "║                                                       ║   ║  - Joshua Redel A. Busloy   (   Roles   )             ║\n");
            System.out.print(CYAN + "║                                                       ║   ║  - Jymrel A. Canubida       (   Roles   )             ║\n");
            System.out.print(CYAN + "║                                                       ║   ║  - Jayve Sean Delfin        (   Roles   )             ║\n");
            System.out.print(CYAN + "║                                                       ║   ║                                                       ║\n");
            lowerLine();
            longLine();
            System.out.print("Enter Your Username: ");
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
            System.out.println("");
            System.out.print("Enter Your Student ID: ");
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

        // Check if the user file exists, if not mahimo bag-o nga file para sa user
        File userFile = new File("Data/" + studentID.toUpperCase().trim() + ".txt");
        if (userFile.exists()) {
            writer.Read();
        } else {
            writer.Write();
        }
    }

    static void mainMenu() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        String formattedDate = today.format(formatter);

        longLine();
        longUpperLine();
        System.out.println(CYAN + "║                                            STUDENT WELLNESS TRACKER                                               ║" + RESET);
        System.out.println(CYAN + "║                                           Your Health, Your Progress                                              ║" + RESET);
        longMiddleLine();
        System.out.printf(CYAN + "║ Student: %-22.20s                                                                Date: %-12s ║%n" + RESET, name, formattedDate);
        System.out.printf(CYAN + "║ Student ID: %-38.9s                                                                ║%n" + RESET, studentID);
        longMiddleLine();
        System.out.println(CYAN + "║                                                 TODAY'S STATS                                                     ║" + RESET);
        System.out.println(CYAN + "║                                                                                                                   ║" + RESET);
        System.out.println(CYAN + "║ +----------------------+  +----------------------+                                                                ║    " + RESET);
        System.out.println(CYAN + "║ ║    WELLNESS SCORE    ║  ║    SLEEP DURATION    ║                                                                ║    " + RESET);
        System.out.printf(CYAN + "║ ║     %3d / 100        ║  ║  %4.1f / %4.1f Hours   ║                                                                ║   %n" + RESET, CalculateScore.calculateScore(), sleep, sleepGoal);
        System.out.println(CYAN + "║ +----------------------+  +----------------------+                                                                ║");
        System.out.println(CYAN + "║                                                                                                                   ║");
        System.out.println(CYAN + "║ +----------------------+  +----------------------+                                                                ║");
        System.out.println(CYAN + "║ ║    EXERCISE TIME     ║  ║     WATER INTAKE     ║                                                                ║");
        System.out.printf(CYAN + "║ ║ %4d /%4d Minutes   ║  ║ %5.1f /%5.1f Liters  ║                                                                ║%n" + RESET, exercise, exerciseGoal, water, waterGoal);
        System.out.println(CYAN + "║ +----------------------+  +----------------------+                                                                ║" + RESET);
        System.out.println(CYAN + "║                                                                                                                   ║" + RESET);
        System.out.println(CYAN + "║                                                                                                                   ║" + RESET);
        System.out.println(CYAN + "║                                                                                                                   ║" + RESET);
        System.out.println(CYAN + "║                                                                                                                   ║" + RESET);
        System.out.println(CYAN + "║                                                                                                                   ║" + RESET);
        System.out.println(CYAN + "║                                                                                                                   ║" + RESET);
        System.out.println(CYAN + "║                                                                                                                   ║" + RESET);
        System.out.println(CYAN + "║                                                                                                                   ║" + RESET);
        longMiddleLine();
        System.out.println(CYAN + "║                                                   MAIN MENU                                                       ║" + RESET);
        longMiddleLine();
        System.out.println(CYAN + "║ [1] Manage Daily Records                                                                                          ║" + RESET);
        System.out.println(CYAN + "║ [2] View Wellness Reports                                                                                         ║" + RESET);
        System.out.println(CYAN + "║ [3] Manage Goals                                                                                                  ║" + RESET);
        System.out.println(CYAN + "║ [4] View Achievements                                                                                             ║" + RESET);
        System.out.println(CYAN + "║ [5] Student Profile                                                                                               ║" + RESET);
        System.out.println(CYAN + "║ [6] Wellness Guide                                                                                                ║" + RESET);
        System.out.println(CYAN + "║ [7] Reset All Data                                                                                                ║" + RESET);
        System.out.println(CYAN + "║ [0] Exit                                                                                                          ║" + RESET);
        longLowerLine();
        longLine();
    }

}