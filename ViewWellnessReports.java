public class ViewWellnessReports {

        static void viewWellnessReports() {

                int choice;

                WellnessTracker.clearScreen();
                WellnessTracker.longLine();
                WellnessTracker.longUpperLine();
                System.out.println(WellnessTracker.CYAN + "║                                                WELLNESS REPORT                                                    ║" + WellnessTracker.RESET);
                WellnessTracker.longMiddleLine();
                System.out.println(WellnessTracker.CYAN + "║                                                 DAILY SUMMARY                                                     ║" + WellnessTracker.RESET);
                WellnessTracker.longMiddleLine();
                System.out.println(WellnessTracker.CYAN + "║                                                                                                                   ║" + WellnessTracker.RESET);
                System.out.println(WellnessTracker.CYAN + "║                                                                                                                   ║" + WellnessTracker.RESET);
                System.out.println(WellnessTracker.CYAN + "║                                                                                                                   ║" + WellnessTracker.RESET);
                System.out.printf(WellnessTracker.CYAN + "║ Sleep:        %4.1f / %4.1f Hours                                                                                   ║%n", WellnessTracker.sleep, WellnessTracker.sleepGoal);
                System.out.printf(WellnessTracker.CYAN + "║ Exercise:   %4d / %4d Minutes                                                                                   ║%n" + WellnessTracker.RESET, WellnessTracker.exercise, WellnessTracker.exerciseGoal);
                System.out.printf(WellnessTracker.CYAN + "║ Water intake: %5.1f /%5.1f Liters                                                                                 ║%n" + WellnessTracker.RESET, WellnessTracker.water, WellnessTracker.waterGoal);
                System.out.println(WellnessTracker.CYAN + "║                                                                                                                   ║" + WellnessTracker.RESET);
                System.out.println(WellnessTracker.CYAN + "║                                                                                                                   ║" + WellnessTracker.RESET);
                System.out.println(WellnessTracker.CYAN + "║                                                                                                                   ║" + WellnessTracker.RESET);
                WellnessTracker.longMiddleLine();
                System.out.printf(WellnessTracker.CYAN + "║ Wellness Score: %3d / 100                                                                                         ║%n", CalculateScore.calculateScore());
                System.out.println(WellnessTracker.CYAN + "║ Disclaimer: Score is a habit-tracking indicator,                                                                  ║" + WellnessTracker.RESET);
                System.out.println(WellnessTracker.CYAN + "║ not a medical assesment.                                                                                          ║" + WellnessTracker.RESET);
                WellnessTracker.longMiddleLine();
                System.out.println(WellnessTracker.CYAN + "║ [0] Back to Main Menu                                                                                             ║" + WellnessTracker.RESET);
                WellnessTracker.longLowerLine();
                WellnessTracker.longLine();

                choice = WellnessTracker.enterChoice();
        }
}
