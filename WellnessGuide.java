public class WellnessGuide {

    static void wellnessGuide() {

        int choice;

        do {
            WellnessTracker.longLine();
            WellnessTracker.longUpperLine();
            System.out.println(WellnessTracker.CYAN + "║                                                   WELLNESS GUIDE                                                  ║");
            WellnessTracker.longMiddleLine();
            System.out.println(WellnessTracker.CYAN + "║                                   Learn about your score and healthy daily habits.                                ║");
            WellnessTracker.longMiddleLine();
            System.out.println(WellnessTracker.CYAN + "║ [1] Wellness Score Calculation                                                                                    ║");
            System.out.println(WellnessTracker.CYAN + "║ [2] Recommend Daily Habits                                                                                        ║");
            System.out.println(WellnessTracker.CYAN + "║ [3] Goals and Progress Guide                                                                                      ║");
            System.out.println(WellnessTracker.CYAN + "║ [0] Back to Main Menu                                                                                             ║");
            WellnessTracker.longLowerLine();
            WellnessTracker.longLine();

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
            WellnessTracker.longLine();
            WellnessTracker.longUpperLine();
            System.out.println(WellnessTracker.CYAN + "║                                              WELLNESS SCORE CALCULATOR                                            ║");
            WellnessTracker.longMiddleLine();
            System.out.println(WellnessTracker.CYAN + "║                                  Your wellness score is calculated out of 100 points.                             ║");
            System.out.println(WellnessTracker.CYAN + "║                                   Points depend on your progress toward three goals.                              ║");
            WellnessTracker.longMiddleLine();
            System.out.println(WellnessTracker.CYAN + "║ CATEGORY                   | MAXIMUM POINTS                                                                       ║");
            WellnessTracker.longMiddleLine();
            System.out.println(WellnessTracker.CYAN + "║ Sleep                      | 35                                                                                   ║");
            System.out.println(WellnessTracker.CYAN + "║ Exercise                   | 35                                                                                   ║");
            System.out.println(WellnessTracker.CYAN + "║ Hydration                  | 30                                                                                   ║");
            WellnessTracker.longMiddleLine();
            System.out.println(WellnessTracker.CYAN + "║ TOTAL                      | 100                                                                                  ║");
            WellnessTracker.longMiddleLine();
            System.out.println(WellnessTracker.CYAN + "║ Each Category earns points based on progress                                                                      ║");
            System.out.println(WellnessTracker.CYAN + "║ toward its goal, up to its maximum points.                                                                        ║");
            System.out.println(WellnessTracker.CYAN + "║ The score is an educational habit indicator,                                                                      ║");
            System.out.println(WellnessTracker.CYAN + "║ not a medical measurement or diagnosis.                                                                           ║");
            WellnessTracker.longMiddleLine();
            System.out.println(WellnessTracker.CYAN + "║ [0] Back                                                                                                          ║");
            WellnessTracker.longLowerLine();
            WellnessTracker.longLine();
            choice = WellnessTracker.enterChoice();

            if (choice != 0) {
                System.out.println("Invalid choice. Enter 0 to go back.");
            }
        } while (choice != 0);
    }

    static void recommendedDailyHabits() {

        int choice;

        do {
            WellnessTracker.longLine();
            WellnessTracker.longUpperLine();
            System.out.println(WellnessTracker.CYAN + "║                                               RECOMMENDED DAILY HABITS                                            ║");
            WellnessTracker.longMiddleLine();
            System.out.println(WellnessTracker.CYAN + "║ 1. SLEEP                                                                                                          ║");
            System.out.println(WellnessTracker.CYAN + "║ Teenagers generally need 8-10 hours of sleep.                                                                     ║");
            System.out.println(WellnessTracker.CYAN + "║ Adults generally need at least 7 hours.                                                                           ║");
            System.out.printf(WellnessTracker.CYAN + "║ Your current goal:  %4.1f Hours                                                                                    ║%n",
                    WellnessTracker.sleepGoal);
            WellnessTracker.longMiddleLine();
            System.out.println(WellnessTracker.CYAN + "║ 2. EXERCISE                                                                                                       ║");
            System.out.println(WellnessTracker.CYAN + "║ School-age children and teens generally need                                                                      ║");
            System.out.println(WellnessTracker.CYAN + "║ about 60 minutes of daily physical activity.                                                                      ║");
            System.out.println(WellnessTracker.CYAN + "║ Adults should aim for regularly weekly activity.                                                                  ║");
            System.out.printf(WellnessTracker.CYAN + "║ Your current goal: %4d Minutes                                                                                   ║%n",
                    WellnessTracker.exerciseGoal);
            WellnessTracker.longMiddleLine();
            System.out.println(WellnessTracker.CYAN + "║ 3. HYDRATION                                                                                                      ║");
            System.out.println(WellnessTracker.CYAN + "║ Water needs vary with age, activity, climate,                                                                     ║");
            System.out.println(WellnessTracker.CYAN + "║ diet, and individual health needs.                                                                                ║");
            System.out.println(WellnessTracker.CYAN + "║ Set a suitable personal water goal.                                                                               ║");
            System.out.printf(WellnessTracker.CYAN + "║ Your current goal: %5.1f Liters                                                                                   ║%n",
                    WellnessTracker.waterGoal);
            WellnessTracker.longMiddleLine();
            System.out.println(WellnessTracker.CYAN + "║ These are general educational guideupperLines.                                                                    ║");
            System.out.println(WellnessTracker.CYAN + "║ Individual needs may differ.                                                                                      ║");
            System.out.println(WellnessTracker.CYAN + "║ [0] Back                                                                                                          ║");
            WellnessTracker.longLowerLine();
            WellnessTracker.longLine();
            choice = WellnessTracker.enterChoice();

            if (choice != 0) {
                System.out.println("Invalid choice. Enter 0 to go back.");
            }
        } while (choice != 0);
    }

    static void goalsProgressGuide() {

        int choice;

        do {
            WellnessTracker.longLine();
            WellnessTracker.longUpperLine();
            System.out.println(WellnessTracker.CYAN + "║                                               GOALS AND PROGRESS GUIDE                                            ║");
            WellnessTracker.longMiddleLine();
            System.out.println(WellnessTracker.CYAN + "║                                                HOW TO USE YOUR GOALS                                              ║");
            WellnessTracker.longMiddleLine();
            System.out.println(WellnessTracker.CYAN + "║ 1. Open Manage Goals from the main menu.                                                                          ║");
            System.out.println(WellnessTracker.CYAN + "║ 2. Choose sleep, exercise, or water.                                                                              ║");
            System.out.println(WellnessTracker.CYAN + "║ 3. Set a realistic personal target.                                                                               ║");
            System.out.println(WellnessTracker.CYAN + "║ 4. Enter your habits in Daily Records.                                                                            ║");
            System.out.println(WellnessTracker.CYAN + "║ 5. Review your Wellness Report.                                                                                   ║");
            System.out.println(WellnessTracker.CYAN + "║ 6. Check Achievements to celebrate progress.                                                                      ║");
            WellnessTracker.longMiddleLine();
            System.out.println(WellnessTracker.CYAN + "║ CURRENT GOALS                                                                                                     ║");
            System.out.printf(WellnessTracker.CYAN + "║ Sleep goal:          %4.1f Hours                                                                                   ║%n",
                    WellnessTracker.sleepGoal);
            System.out.printf(WellnessTracker.CYAN + "║ Exercise goal:      %4d Minutes                                                                                  ║%n",
                    WellnessTracker.exerciseGoal);
            System.out.printf(WellnessTracker.CYAN + "║ Water intake goal:  %5.1f Liters                                                                                  ║%n",
                    WellnessTracker.waterGoal);
            WellnessTracker.longMiddleLine();
            WellnessTracker.longMiddleLine();
            System.out.println(WellnessTracker.CYAN + "║ TIPS FOR PROGRESS                                                                                                 ║");
            System.out.println(WellnessTracker.CYAN + "║ - Start with achievable changes.                                                                                  ║");
            System.out.println(WellnessTracker.CYAN + "║ - Review your records regularly.                                                                                  ║");
            System.out.println(WellnessTracker.CYAN + "║ - Focus on consistency, not perfection.                                                                           ║");
            System.out.println(WellnessTracker.CYAN + "║ - Adjust goals when your needs change.                                                                            ║");
            System.out.println(WellnessTracker.CYAN + "║ - Celebrate your achievements.                                                                                    ║");
            WellnessTracker.longMiddleLine();
            System.out.println(WellnessTracker.CYAN + "║ [0] Back                                                                                                          ║");
            WellnessTracker.longLowerLine();
            WellnessTracker.longLine();
            choice = WellnessTracker.enterChoice();

            if (choice != 0) {
                System.out.println("Invalid choice. Enter 0 to go back.");
            }
        } while (choice != 0);
    }
}
