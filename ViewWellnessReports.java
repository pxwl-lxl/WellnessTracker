public class ViewWellnessReports {

        static void viewWellnessReports() {

                int choice;

                WellnessTracker.upperLine();
                System.out.println("|                   WELLNESS REPORT                  |");
                WellnessTracker.upperLine();
                System.out.println("|                   DAILY SUMMARY                    |");
                WellnessTracker.upperLine();
                System.out.printf("| Sleep:        %4.1f / %4.1f Hours                    |%n",
                                WellnessTracker.sleep,
                                WellnessTracker.sleepGoal);
                System.out.printf("| Exercise:   %4d / %4d Minutes                    |%n",
                                WellnessTracker.exercise, WellnessTracker.exerciseGoal);
                System.out.printf("| Water intake: %5.1f /%5.1f Liters                  |%n",
                                WellnessTracker.water,
                                WellnessTracker.waterGoal);
                WellnessTracker.upperLine();
                System.out.printf("| Wellness Score: %3d / 100                          |%n",
                                CalculateScore.calculateScore());
                System.out.println("| Disclaimer: Score is a habit-tracking indicator,   |");
                System.out.println("| not a medical assesment.                           |");
                WellnessTracker.upperLine();
                System.out.println("| [0] Back to Main Menu                              |");
                WellnessTracker.upperLine();

                choice = WellnessTracker.enterChoice();
        }
}
