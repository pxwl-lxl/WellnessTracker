public class ViewWellnessReports {

    static void viewWellnessReports() {

        WellnessTracker.line();
        System.out.println("|                   WELLNESS REPORT                  |");
        WellnessTracker.line();
        System.out.println("|                   DAILY SUMMARY                    |");
        WellnessTracker.line();
        System.out.printf("| Sleep: %.1f / %.1f hours                             |%n", WellnessTracker.sleep,
                WellnessTracker.sleepGoal);
        System.out.printf("| Exercise: %d / %d minutes                           |%n", WellnessTracker.exercise,
                WellnessTracker.exerciseGoal);
        System.out.printf("| Water intake: %.1f / %.1f liters                     |%n", WellnessTracker.water,
                WellnessTracker.waterGoal);
        WellnessTracker.line();
        System.out.println("| Wellness Score: +/100                              |");
        System.out.println("| Disclaimer: Score is a habit-tracking indicator,   |");
        System.out.println("| not a medical assesment.                           |");
        WellnessTracker.line();
        System.out.println("| [0] Back to Main Menu                              |");
        WellnessTracker.line();

        WellnessTracker.enterChoice();

    }

}
