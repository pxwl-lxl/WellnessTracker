public class ResetAllData {

    static void resetAllData() {

        WellnessTracker.clearScreen();
        WellnessTracker.longLine();
        WellnessTracker.longUpperLine();
        System.out.println(WellnessTracker.CYAN + "║                                                  RESET ALL DATA                                                   ║");
        WellnessTracker.longMiddleLine();
        System.out.println(WellnessTracker.CYAN + "║ This will erase all saved information, including:                                                                 ║");
        System.out.println(WellnessTracker.CYAN + "║ your name, school ID, daily records, and goals.                                                                   ║");
        System.out.println(WellnessTracker.CYAN + "║ You will enter your profile information again.                                                                    ║");
        WellnessTracker.longMiddleLine();
        System.out.println(WellnessTracker.CYAN + "║ [1] Confirm reset                                                                                                 ║");
        System.out.println(WellnessTracker.CYAN + "║ [0] Back to Main Menu                                                                                             ║");
        WellnessTracker.longLowerLine();
        WellnessTracker.longLine();

        WellnessTracker.enterChoice();

    }
}