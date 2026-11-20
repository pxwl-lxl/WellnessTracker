public class ViewWellnessReports {

        static void viewWellnessReports() {

                int choice;

                WellnessTracker.line();
                System.out.println("|                   WELLNESS REPORT                  |");
                WellnessTracker.line();
                System.out.println("|                   DAILY SUMMARY                    |");
                WellnessTracker.line();
                System.out.printf("| Sleep:         %.1f / %.1f hour/s                    |%n",
                                WellnessTracker.sleep,
                                WellnessTracker.sleepGoal);
                System.out.printf("| Exercise:      %d / %d minute/s                     |%n",
                                WellnessTracker.exercise,
                                WellnessTracker.exerciseGoal);
                System.out.printf("| Water intake:  %.1f / %.1f liter/s                   |%n",
                                WellnessTracker.water,
                                WellnessTracker.waterGoal);
                WellnessTracker.line();
                System.out.println("| Wellness Score: +/100                              |");
                System.out.println("| Disclaimer: Score is a habit-tracking indicator,   |");
                System.out.println("| not a medical assesment.                           |");
                WellnessTracker.line();
                System.out.println("| [0] Back to Main Menu                              |");
                WellnessTracker.line();

                choice = WellnessTracker.enterChoice();
        }
}
