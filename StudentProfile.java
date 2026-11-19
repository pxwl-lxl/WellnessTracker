public class StudentProfile {

    static void studentProfile() {

        WellnessTracker.line();
        System.out.println("|                   STUDENT PROFILE                  |");
        WellnessTracker.line();
        System.out.printf("| Name: %-44.20s |%n", WellnessTracker.name);
        System.out.printf("| Student ID: %-38.9s |%n", WellnessTracker.studentID);
        WellnessTracker.line();
        System.out.println("| [1] Change Name                                    |");
        System.out.println("| [2] Change Student ID                              |");
        System.out.println("| [0] Back to Main Menu                              |");
        WellnessTracker.line();

        WellnessTracker.enterChoice();

    }

}
