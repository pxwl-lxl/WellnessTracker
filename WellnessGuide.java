public class WellnessGuide {

    static void wellnessGuide() {

        int choice;

        do {
            WellnessTracker.upperLine();
            System.out.println("| WELLNESS GUIDE                                     |");
            WellnessTracker.upperLine();
            System.out.println("|   Learn about your score and healthy daily habits. |");
            WellnessTracker.upperLine();
            System.out.println("| [1] Wellness Score Calculation                     |");
            System.out.println("| [2] Recommend Daily Habits                         |");
            System.out.println("| [3] Goals and Progress Guide                       |");
            System.out.println("| [0] Back to Main Menu                              |");
            WellnessTracker.upperLine();

            choice = WellnessTracker.enterChoice();

            switch (choice) {
                case 1:
                    wellnessScoreCalculator();
                    break;
                case 2:
                    recommendedDailyHabits();
                    break;
                case 3:
                    goalsProgressGuide();
                    break;
                case 0:
                    WellnessTracker.mainMenu();
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
    }

    static void wellnessScoreCalculator() {

        int choice;

        do {
            WellnessTracker.upperLine();
            System.out.println("| WELLNESS SCORE CALCULATOR                                     ");
            WellnessTracker.upperLine();
            System.out.println("| Your wellness score is calculated out of 100 points.          ");
            System.out.println("| Points depend on your progress toward three goals.            ");
            WellnessTracker.upperLine();
            System.out.println("| CATEGORY                   | MAXIMUM POINTS                   ");
            WellnessTracker.upperLine();
            System.out.println("| Sleep                      | 35                               ");
            System.out.println("| Exercise                   | 35                               ");
            System.out.println("| Hydration                  | 30                               ");
            WellnessTracker.upperLine();
            System.out.println("| TOTAL                      | 100                              ");
            WellnessTracker.upperLine();
            System.out.println("| Each Category earns points based on progress                  ");
            System.out.println("| toward its goal, up to its maximum points.                    ");
            System.out.println("| The score is an educational habit indicator,                  ");
            System.out.println("| not a medical measurement or diagnosis.                       ");
            WellnessTracker.upperLine();
            System.out.println("| [0] Back                                                      ");
            WellnessTracker.upperLine();
            choice = WellnessTracker.enterChoice();

            if (choice != 0) {
                System.out.println("Invalid choice. Enter 0 to go back.");
            }
        } while (choice != 0);
    }

    static void recommendedDailyHabits() {

        int choice;

        do {
            WellnessTracker.upperLine();
            System.out.println("| RECOMMENDED DAILY HABITS                                      ");
            WellnessTracker.upperLine();
            System.out.println("| 1. SLEEP                                                      ");
            System.out.println("| Teenagers generally need 8-10 hours of sleep.                 ");
            System.out.println("| Adults generally need at least 7 hours.                       ");
            System.out.printf("| Your current goal:  %4.1f Hours                    %n",
                    WellnessTracker.sleepGoal);
            WellnessTracker.upperLine();
            System.out.println("| 2. EXERCISE                                                   ");
            System.out.println("| School-age children and teens generally need                  ");
            System.out.println("| about 60 minutes of daily physical activity.                  ");
            System.out.println("| Adults should aim for regularly weekly activity.              ");
            System.out.printf("| Your current goal: %4d Minutes                   %n",
                    WellnessTracker.exerciseGoal);
            WellnessTracker.upperLine();
            System.out.println("| 3. HYDRATION                                                  ");
            System.out.println("| Water needs vary with age, activity, climate,                 ");
            System.out.println("| diet, and individual health needs.                            ");
            System.out.println("| Set a suitable personal water goal.                           ");
            System.out.printf("| Your current goal: %5.1f Liters                   %n",
                    WellnessTracker.waterGoal);
            WellnessTracker.upperLine();
            System.out.println("| These are general educational guideupperLines.                     ");
            System.out.println("| Individual needs may differ.                                  ");
            System.out.println("| [0] Back                                                      ");
            WellnessTracker.upperLine();
            choice = WellnessTracker.enterChoice();

            if (choice != 0) {
                System.out.println("Invalid choice. Enter 0 to go back.");
            }
        } while (choice != 0);
    }

    static void goalsProgressGuide() {

        int choice;

        do {
            WellnessTracker.upperLine();
            System.out.println("| GOALS AND PROGRESS GUIDE                                  ");
            WellnessTracker.upperLine();
            System.out.println("| HOW TO USE YOUR GOALS                                     ");
            WellnessTracker.upperLine();
            System.out.println("| 1. Open Manage Goals from the main menu.                  ");
            System.out.println("| 2. Choose sleep, exercise, or water.                      ");
            System.out.println("| 3. Set a realistic personal target.                       ");
            System.out.println("| 4. Enter your habits in Daily Records.                    ");
            System.out.println("| 5. Review your Wellness Report.                           ");
            System.out.println("| 6. Check Achievements to celebrate progress.              ");
            WellnessTracker.upperLine();
            System.out.println("| CURRENT GOALS                                             ");
            System.out.printf("| Sleep goal:          %4.1f Hours                    |%n",
                    WellnessTracker.sleepGoal);
            System.out.printf("| Exercise goal:      %4d Minutes                   |%n",
                    WellnessTracker.exerciseGoal);
            System.out.printf("| Water intake goal:  %5.1f Liters                   |%n",
                    WellnessTracker.waterGoal);
            WellnessTracker.upperLine();
            WellnessTracker.upperLine();
            System.out.println("| TIPS FOR PROGRESS                                         ");
            System.out.println("| - Start with achievable changes.                          ");
            System.out.println("| - Review your records regularly.                          ");
            System.out.println("| - Focus on consistency, not perfection.                   ");
            System.out.println("| - Adjust goals when your needs change.                    ");
            System.out.println("| - Celebrate your achievements.                            ");
            WellnessTracker.upperLine();
            System.out.println("| [0] Back                                                  ");
            WellnessTracker.upperLine();
            choice = WellnessTracker.enterChoice();

            if (choice != 0) {
                System.out.println("Invalid choice. Enter 0 to go back.");
            }
        } while (choice != 0);
    }
}
