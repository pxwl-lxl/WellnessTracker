public class CalculateScore {
    // Sleep, Exercise, Water Intake. Add Sleep 35 + Exercise 35 + Hydration 30 =
    // 100
    static int calculateScore() {

        double sleepRatio = 0.0;
        if (WellnessTracker.sleepGoal > 0) {
            sleepRatio = WellnessTracker.sleep / WellnessTracker.sleepGoal;

            if (sleepRatio < 0) {
                sleepRatio = 0;
            } else if (sleepRatio > 1.0) {
                sleepRatio = 1.0;
            }
        }

        double exerciseRatio = 0.0;
        if (WellnessTracker.exerciseGoal > 0) {
            exerciseRatio = (double) WellnessTracker.exercise / WellnessTracker.exerciseGoal;

            if (exerciseRatio < 0) {
                exerciseRatio = 0.0;
            } else if (exerciseRatio > 1.0) {
                exerciseRatio = 1.0;
            }
        }

        double waterRatio = 0.0;
        if (WellnessTracker.waterGoal > 0) {
            waterRatio = WellnessTracker.water / WellnessTracker.waterGoal;

            if (waterRatio < 0) {
                waterRatio = 0.0;
            } else if (waterRatio > 1.0) {
                waterRatio = 1.0;
            }
        }

        double rawWellnessScore = (sleepRatio * 35.0) + (exerciseRatio * 35.0) + (waterRatio * 30.0);

        int totalWellnessScore = (int) Math.round(rawWellnessScore);

        if (totalWellnessScore < 0) {
            totalWellnessScore = 0;
        } else if (totalWellnessScore > 100) {
            totalWellnessScore = 100;
        }

        return totalWellnessScore;

        // ManageDailyRecords.updateSleep(); / ManageGoals.updateSleepGoal(); //hours

        // ManageDailyRecords.updateExercise(); / ManageGoals.updateExerciseGoal();
        // //minutes

        // ManageDailyRecords.updateWater(); / ManageGoals.updateWaterGoal(); //liters
    }
}
