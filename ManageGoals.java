public class ManageGoals {

    static void manageGoals() {

        int choice;

        do {

            WellnessTracker.line();
            System.out.println("|                   MANAGE GOALS                     |");
            WellnessTracker.line();
            System.out.printf("| Sleep goal: %.1f hour/s                             |%n",
                    WellnessTracker.sleepGoal);
            System.out.printf("| Exercise goal: %d minute/s                         |%n",
                    WellnessTracker.exerciseGoal);
            System.out.printf("| Water intake goal: %.1f liter/s                     |%n",
                    WellnessTracker.waterGoal);
            WellnessTracker.line();
            System.out.println("| [1] Update Sleep Goal                              |");
            System.out.println("| [2] Update Exercise Goal                           |");
            System.out.println("| [3] Update Water Goal                              |");
            System.out.println("| [0] Back to Main Menu                              |");
            WellnessTracker.line();

            choice = WellnessTracker.enterChoice();

            switch (choice) {

                case 1:
                    updateSleepGoal();
                    break;
                case 2:
                    updateExerciseGoal();
                    break;
                case 3:
                    updateWaterGoal();
                    break;
                default:
                    System.out.println("\nInvalid choice!");
            }

        } while (choice != 0);
    }

    static double updateSleepGoal() {
        System.out.print("Enter sleep goal (0.0-24 hours): ");
        double choice = WellnessTracker.userInput.nextDouble();

        while (choice < 0 || choice > 24) {

            System.out.print("Invalid input! Enter a value from 0.0 to 24: ");
            choice = WellnessTracker.userInput.nextDouble();
        }

        WellnessTracker.sleepGoal = choice;

        System.out.println("\nSleep goal updated!");

    }

    static void updateExerciseGoal() {
        System.out.print("Enter exercise goal (0-1440 minutes): ");
        int choice = WellnessTracker.userInput.nextInt();

        while (choice < 0 || choice > 1440) {

            System.out.print("Invalid input! Enter a value from 0 to 1440: ");
            choice = WellnessTracker.userInput.nextInt();
        }

        WellnessTracker.exerciseGoal = choice;

        System.out.println("\nSleep goal updated!");

    }

    static void updateWaterGoal() {
        System.out.print("Enter water goal in litters (0.0-20): ");
        double choice = WellnessTracker.userInput.nextDouble();

        while (choice < 0 || choice > 20) {

            System.out.print("Invalid input! Enter a value from 0.0 to 20: ");
            choice = WellnessTracker.userInput.nextDouble();
        }

        WellnessTracker.waterGoal = choice;

        System.out.println("\nWater goal updated!");

    }

}
