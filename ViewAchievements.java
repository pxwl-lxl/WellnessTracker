public class ViewAchievements {

    static void viewAchievements() {

        WellnessTracker.longLine();
        WellnessTracker.longUpperLine();
        System.out.println(WellnessTracker.CYAN + "║                                               MAIN ACHIEVEMENTS                                                   ║" + WellnessTracker.RESET);
        WellnessTracker.longMiddleLine();
        System.out.printf(WellnessTracker.CYAN + "║ %-50s                                                                ║%n" + WellnessTracker.RESET, mainAchievementsSleep());
        System.out.printf(WellnessTracker.CYAN + "║ %-50s                                                                ║%n" + WellnessTracker.RESET, mainAchievementsExercise());
        System.out.printf(WellnessTracker.CYAN + "║ %-50s                                                                WellnessTracker.CYAN + %n" + WellnessTracker.RESET, mainAchievementsWater());
        WellnessTracker.longMiddleLine();
        System.out.println("║              DAILY GOAL ACHIEVEMENTS                                                                              ║");
        WellnessTracker.longMiddleLine();
        System.out.printf(WellnessTracker.CYAN + "║ %-50s                                                                ║%n" + WellnessTracker.RESET, achievementSleep());
        System.out.printf(WellnessTracker.CYAN + "║ %-50s                                                                ║%n" + WellnessTracker.RESET, achievementExercise());
        System.out.printf(WellnessTracker.CYAN + "║ %-50s                                                                ║%n" + WellnessTracker.RESET, achievementWater());
        WellnessTracker.longMiddleLine();
        System.out.println(WellnessTracker.CYAN + "║ [0] Back to Main Menu                                                                                             ║" + WellnessTracker.RESET);
        WellnessTracker.longLowerLine();
        WellnessTracker.longLine();

        WellnessTracker.enterChoice();
    }

    static String achievementSleep() {

        if (WellnessTracker.sleep >= WellnessTracker.sleepGoal) {
            return "[V] Sleep Goal Completed";
        } else {
            return "[X] Sleep Goal Not Completed";
        }
    }

    static String achievementExercise() {

        if (WellnessTracker.exercise >= WellnessTracker.exerciseGoal) {
            return "[V] Exercise Goal Completed";
        } else {
            return "[X] Execise Goal Not Completed";
        }
    }

    static String achievementWater() {

        if (WellnessTracker.water >= WellnessTracker.waterGoal) {
            return "[V] Water Goal Completed";
        } else {
            return "[X] Water Goal Not Completed";
        }
    }

    static String mainAchievementsSleep() {

        if (WellnessTracker.sleep > WellnessTracker.sleepGoal) {
            return "[V] Achieved: No Phantoms Tonight";
        } else {
            return "[X] Surpass your daily sleep goal to unlock.";
        }
    }

    static String mainAchievementsExercise() {

        if (WellnessTracker.exercise > WellnessTracker.exerciseGoal) {
            return "[V] Achieved: Overkill";
        } else {
            return "[X] Surpass your daily exercise goal to unlock.";
        }
    }

    static String mainAchievementsWater() {

        if (WellnessTracker.water > WellnessTracker.waterGoal) {
            return "[V] Achieved: Potion of Water Breathing";
        } else {
            return "[X] Surpass your daily water goal to unlock.";
        }
    }
}
