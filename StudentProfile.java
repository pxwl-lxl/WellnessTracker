public class StudentProfile {

    public static void studentProfile() {

        int choice;

        do {
            WellnessTracker.upperLine();
            System.out.println("|                   STUDENT PROFILE                  |");
            WellnessTracker.upperLine();
            System.out.printf("| Name: %-44.20s |%n", WellnessTracker.name);
            System.out.printf("| Student ID: %-38.9s |%n", WellnessTracker.studentID);
            WellnessTracker.upperLine();
            System.out.println("| [1] Change Name                                    |");
            System.out.println("| [2] Change Student ID                              |");
            System.out.println("| [0] Back to Main Menu                              |");
            WellnessTracker.upperLine();

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
        while (true) {
            System.out.print("Enter your name (max 30 characters): ");
            String newName = WellnessTracker.userInput.nextLine().trim().toUpperCase();

            if (!newName.isEmpty() && newName.length() <= 30) {

                boolean valid = true;

                for (int i = 0; i < newName.length(); i++) {
                    if (!Character.isLetter(newName.charAt(i)) && newName.charAt(i) != ' ') {
                        valid = false;
                        break;

                    }
                }

                if (valid) {
                    WellnessTracker.studentID = newName;
                    System.out.println("\nName updated successfully!");
                    break;
                }
            }
            System.out.println("Invalid name! Use only letters, with a maximum of 30 characters.\n");
        }
    }

    static void changeStudentID() {
        while (true) {
            System.out.print("Enter your Student ID (max 9 characters): ");
            String newStudentID = WellnessTracker.userInput.nextLine().trim().toUpperCase();

            boolean valid = !newStudentID.isEmpty() && newStudentID.length() <= 9;

            for (int i = 0; i < newStudentID.length(); i++) {
                if (!Character.isLetterOrDigit(newStudentID.charAt(i))) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                WellnessTracker.studentID = newStudentID;
                System.out.println("\nStudent ID updated successfully!");
                break;
            }

            System.out.println("Invalid Student ID! Use only letters and numbers, with a maximum of 9 characters.\n");
        }

    }
}
