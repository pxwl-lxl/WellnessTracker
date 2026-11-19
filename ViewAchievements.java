public class ViewAchievements {

    static void viewAchievements() {

        WellnessTracker.line();
        System.out.println("|                 MAIN ACHIEVEMENTS                  |");
        WellnessTracker.line();
        System.out.println("| [X] Welcome Aboard                                 |");
        WellnessTracker.line();
        System.out.println("|              DAILY GOAL ACHIEVEMENTS               |");
        WellnessTracker.line();
        System.out.println("| [X] Sleep Goal Completed                           |");
        System.out.println("| [X] Exercise Goal Completed                        |");
        System.out.println("| [X] Water Goal Completed                           |");
        WellnessTracker.line();
        System.out.println("| [0] Back to Main Menu                              |");
        WellnessTracker.line();

        WellnessTracker.enterChoice();

    }

}
