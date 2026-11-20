
public class ManageDailyRecords {

    static void manageDailyRecords() {

        int choice;

        do {

            WellnessTracker.line();
            System.out.println("|                MANAGE DAILY RECORDS                |");
            WellnessTracker.line();
            System.out.printf("| Sleep:        %4.1f hour/s                          |%n",
                    WellnessTracker.sleep);
            System.out.printf("| Exercise:   %4d minute/s                          |%n", WellnessTracker.exercise);
            System.out.printf("| Water intake: %4.1f liter/s                         |%n", WellnessTracker.water);
            WellnessTracker.line();
            System.out.println("| [1] Update Sleep Duration                          |");
            System.out.println("| [2] Update Exercise Time                           |");
            System.out.println("| [3] Update Water Intake                            |");
            System.out.println("| [0] Back to Main Menu                              |");
            WellnessTracker.line();

            choice = WellnessTracker.enterChoice();

            switch (choice) {

                case 1:
                    updateSleep();
                    break;

                case 2:
                    updateExercise();
                    break;

                case 3:
                    updateWater();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("\nInvalid choice!");
            }

        } while (choice != 0);
    }

    static void updateSleep() {

        System.out.print("Enter sleep duration (0-24): ");
        double choice = WellnessTracker.userInput.nextDouble();

        while (choice < 0 || choice > 24) {

            System.out.print("Invalid input! Enter a value from 0 to 24: ");
            choice = WellnessTracker.userInput.nextDouble();
        }

        WellnessTracker.sleep = choice;

        System.out.println("\nSleep record updated!");
    }

    static void updateExercise() {

        System.out.print("Enter exercise time (0-1440): ");
        int choice = WellnessTracker.userInput.nextInt();

        while (choice < 0 || choice > 1440) {

            System.out.print("Invalid input! Enter a value from 0 to 1440: ");
            choice = WellnessTracker.userInput.nextInt();
        }

        WellnessTracker.exercise = choice;

        System.out.println("\nExercise record updated!");
    }

    static void updateWater() {

        System.out.print("Enter water intake in liters (0-100): ");
        int choice = WellnessTracker.userInput.nextInt();

        while (choice < 0 || choice > 100) {

            System.out.print("Invalid input! Enter a value from 0 to 100: ");
            choice = WellnessTracker.userInput.nextInt();

        }

        WellnessTracker.water = choice;

        System.out.println("\nWater record updated");
    }

}
