public class StudentProfile {

    public static void studentProfile() {

        int choice;

        do {
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

            choice = WellnessTracker.enterChoice();
            WellnessTracker.userInput.nextLine();

            switch (choice) {
                case 1:
                    changeName();
                    break;
                case 2:
                    changeStudentID();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nInvalid choice! Please try again.");
            }

        } while (choice != 0);
    }

    static void changeName() {
        System.out.print("Enter new name (max 20 characters): ");
        String newName = WellnessTracker.userInput.nextLine().trim();

        if (newName.isEmpty() || newName.length() > 20) {
            System.out.println("\nInvalid name! Must be 1 to 20 characters.");
        } else {
            WellnessTracker.name = newName;
            System.out.println("\nName updated successfully!");
        }
    }

    static void changeStudentID() {
        System.out.print("Enter new Student ID (max 9 characters): ");
        String newID = WellnessTracker.userInput.nextLine().trim();

        if (newID.isEmpty() || newID.length() > 9) {
            System.out.println("\nInvalid Student ID! Must be 1 to 9 characters.");
        } else {
            WellnessTracker.studentID = newID;
            System.out.println("\nStudent ID updated successfully!");
        }
    }
}
