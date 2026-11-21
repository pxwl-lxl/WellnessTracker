public class ViewWellnessReports {

        static void viewWellnessReports() {

                int choice;

                WellnessTracker.line();
                System.out.println("|                   WELLNESS REPORT                  |");
                WellnessTracker.line();
                System.out.println("|                   DAILY SUMMARY                    |");
                WellnessTracker.line();
                System.out.printf("| Sleep:        %4.1f / %4.1f Hours                    |%n",
                                WellnessTracker.sleep,
                                WellnessTracker.sleepGoal);
                System.out.printf("| Exercise:   %4d / %4d Minutes                    |%n",
                                WellnessTracker.exercise, WellnessTracker.exerciseGoal);
                System.out.printf("| Water intake: %5.1f /%5.1f Liters                  |%n",
                                WellnessTracker.water,
                                WellnessTracker.waterGoal);
                WellnessTracker.line();
                System.out.printf("| Wellness Score: %3d / 100                          |%n",
                                CalculateScore.calculateScore());
                System.out.println("| Disclaimer: Score is a habit-tracking indicator,   |");
                System.out.println("| not a medical assesment.                           |");
                WellnessTracker.line();
                System.out.println("| [0] Back to Main Menu                              |");
                WellnessTracker.line();

                choice = WellnessTracker.enterChoice();
        }
}
