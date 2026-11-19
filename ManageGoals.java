public class ManageGoals {

    static void manageGoals() {

        int choice;

        do {

            WellnessTracker.line();
            System.out.println("|                   MANAGE GOALS                     |");
            WellnessTracker.line();
            System.out.printf("| Sleep goal: %.1f hours                              |%n",
                    WellnessTracker.sleepGoal);
            System.out.printf("| Exercise goal: %d minutes                          |%n",
                    WellnessTracker.exerciseGoal);
            System.out.printf("| Water intake goal: %.1f liters                      |%n",
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

    static void updateSleepGoal() {
        System.out.print("Enter sleep goal (0.5-24 hours): ");
        double choice = WellnessTracker.userInput.nextDouble();
    }

    static void updateExerciseGoal() {
        System.out.print("Enter exercise goal (1-1440 minutes): ");
        double choice = WellnessTracker.userInput.nextDouble();
    }

    static void updateWaterGoal() {
        System.out.print("Enter water goal in litters (0.1-20): ");
        double choice = WellnessTracker.userInput.nextDouble();
    }

}
