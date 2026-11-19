public class ManagaDailyRecords {

    static void manageDailyRecords() {
        WellnessTracker.line();
        System.out.println("|                MANAGE DAILY RECORDS                |");
        WellnessTracker.line();
        System.out.printf("| Sleep: %.1f hours                                   |%n", WellnessTracker.sleep);
        System.out.printf("| Exercise: %d minutes                                |%n", WellnessTracker.exercise);
        System.out.printf("| Water intake: %.1f liters                           |%n", WellnessTracker.water);
        WellnessTracker.line();
        System.out.println("| Wellness score: +                                  |");
        System.out.println("| Disclamer: Score is a habit-tracking indicator,    |");
        System.out.println("| not a medical assessment.                          |");
        WellnessTracker.line();
        System.out.println("| [0] Back to Main Menu                              |");
        WellnessTracker.line();

        WellnessTracker.enterChoice();
    }

}
