public class ResetAllData {

    static void resetAllData() {

        WellnessTracker.upperLine();
        System.out.println("|                   RESET ALL DATA                   |");
        WellnessTracker.upperLine();
        System.out.println("| This will erase all saved information, including:  |");
        System.out.println("| your name, school ID, daily records, and goals.    |");
        System.out.println("| You will enter your profile information again.     |");
        WellnessTracker.upperLine();
        System.out.println("| [1] Confirm reset                                  |");
        System.out.println("| [0] Back to Main Menu                              |");
        WellnessTracker.upperLine();

        WellnessTracker.enterChoice();

    }

}
