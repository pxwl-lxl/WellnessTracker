public class ViewAchievements {

    static void viewAchievements() {

        WellnessTracker.upperLine();
        System.out.println("|                 MAIN ACHIEVEMENTS                  |");
        WellnessTracker.upperLine();
        System.out.printf("| %-50s |%n", mainAchievementsSleep());
        System.out.printf("| %-50s |%n", mainAchievementsExercise());
        System.out.printf("| %-50s |%n", mainAchievementsWater());
        WellnessTracker.upperLine();
        System.out.println("|              DAILY GOAL ACHIEVEMENTS               |");
        WellnessTracker.upperLine();
        System.out.printf("| %-50s |%n", achievementSleep());
        System.out.printf("| %-50s |%n", achievementExercise());
        System.out.printf("| %-50s |%n", achievementWater());
        WellnessTracker.upperLine();
        System.out.println("| [0] Back to Main Menu                              |");
        WellnessTracker.upperLine();

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
