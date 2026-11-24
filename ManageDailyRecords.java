
public class ManageDailyRecords {

    static void manageDailyRecords() {

        int choice;

        do {
            WellnessTracker.clearScreen();
            WellnessTracker.longLine();
            WellnessTracker.longUpperLine();
            System.out.println(WellnessTracker.CYAN + "║                                              MANAGE DAILY RECORDS                                                 ║" + WellnessTracker.RESET);
            WellnessTracker.longMiddleLine();
            System.out.println(WellnessTracker.CYAN + "║                                                                                                                   ║" + WellnessTracker.RESET);
            System.out.println(WellnessTracker.CYAN + "║                                                                                                                   ║" + WellnessTracker.RESET);
            System.out.println(WellnessTracker.CYAN + "║                                                                                                                   ║" + WellnessTracker.RESET);
            System.out.printf(WellnessTracker.CYAN + "║ Sleep:        %4.1f / %4.1f Hours                                                                                   ║%n" + WellnessTracker.RESET, WellnessTracker.sleep, WellnessTracker.sleepGoal);
            System.out.printf(WellnessTracker.CYAN + "║ Exercise:   %4d / %4d Minutes                                                                                   ║%n" +  WellnessTracker.RESET, WellnessTracker.exercise, WellnessTracker.exerciseGoal);
            System.out.printf(WellnessTracker.CYAN + "║ Water intake: %5.1f /%5.1f Liters                                                                                 ║%n" + WellnessTracker.RESET, WellnessTracker.water, WellnessTracker.waterGoal);
            System.out.println(WellnessTracker.CYAN + "║                                                                                                                   ║" + WellnessTracker.RESET);
            System.out.println(WellnessTracker.CYAN + "║                                                                                                                   ║" + WellnessTracker.RESET);
            System.out.println(WellnessTracker.CYAN + "║                                                                                                                   ║" + WellnessTracker.RESET);
            WellnessTracker.longMiddleLine();
            System.out.println(WellnessTracker.CYAN + "║ [1] Update Sleep Duration                                                                                         ║" + WellnessTracker.RESET);
            System.out.println(WellnessTracker.CYAN + "║ [2] Update Exercise Time                                                                                          ║" + WellnessTracker.RESET);
            System.out.println(WellnessTracker.CYAN + "║ [3] Update Water Intake                                                                                           ║" + WellnessTracker.RESET);
            System.out.println(WellnessTracker.CYAN + "║ [0] Back to Main Menu                                                                                             ║" + WellnessTracker.RESET);
            WellnessTracker.longLowerLine();
            WellnessTracker.longLine();

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
        double choice = WellnessTracker.readDouble();

        while (choice < 0 || choice > 24) {

            System.out.print("Invalid input! Enter a value from 0 to 24: ");
            choice = WellnessTracker.readDouble();
        }

        WellnessTracker.sleep = choice;
        writer.Update();

        System.out.println("\nSleep record updated!");
    }

    static void updateExercise() {

        System.out.print("Enter exercise time (0-1440): ");
        int choice = WellnessTracker.readInt();

        while (choice < 0 || choice > 1440) {

            System.out.print("Invalid input! Enter a value from 0 to 1440: ");
            choice = WellnessTracker.userInput.nextInt();
        }

        WellnessTracker.exercise = choice;
        writer.Update();

        System.out.println("\nExercise record updated!");
    }

    static void updateWater() {

        System.out.print("Enter water intake in liters (0-100): ");
        double choice = WellnessTracker.readDouble();

        while (choice < 0 || choice > 100) {

            System.out.print("Invalid input! Enter a value from 0 to 100: ");
            choice = WellnessTracker.readDouble();

        }

        WellnessTracker.water = choice;
        writer.Update();

        System.out.println("\nWater record updated");
    }

}
