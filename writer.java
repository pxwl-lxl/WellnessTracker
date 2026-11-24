import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


//  READ AT THE BOTTOM!!
//  CURRENT PROBLEMS
public class writer


{

    //AMO NI ANG WAY TA TO SAVE OUR USER DATA
    static void Write()
    {
        try
        {
            File folder = new File("Data");

            if (!folder.exists())
            {
                folder.mkdir();
            }
            
            // Create a new file for the user if wala pa ga exist
            File sav = new File("Data/" + WellnessTracker.studentID.toUpperCase().trim() + ".txt");
            {
                sav.createNewFile();
            }

            // Gina sulate a user data sa file
            try (FileWriter save = new FileWriter("Data/" + WellnessTracker.studentID.toUpperCase().trim() + ".txt"))
            {
                
                save.write("Name: " + WellnessTracker.name.toUpperCase().trim());
                save.write("\nID: " + WellnessTracker.studentID.toUpperCase().trim());
                save.write("\nSleep: " + WellnessTracker.sleep);
                save.write("\nSleepGoal: " + WellnessTracker.sleepGoal);
                save.write("\nExercise: " + WellnessTracker.exercise);
                save.write("\nExerciseGoal: "  + WellnessTracker.exerciseGoal);
                save.write("\nWater: " + WellnessTracker.water);
                save.write("\nWaterGoal: " + WellnessTracker.waterGoal);
            }

            System.out.println("\nData saved successfully!");
                
        
        }
        catch (IOException e)
        {
            System.out.println("Error saving data: " + e.getMessage());
            System.out.println("Attempted path: " + new File("Data", WellnessTracker.studentID.toUpperCase().trim() + ".txt").getAbsolutePath());
        }
    }



    //AMO NI ATON NGA WAY PARA MA LOAD ANG SAVE TA
    public static void Read()
    {
        // gina check if naga exist ang file sang user, if wala ga exist indi na mag load sang data 
        File sav = new File("Data/" + WellnessTracker.studentID.toUpperCase().trim() + ".txt");

        if (!sav.exists())
        {
            System.out.println("\nNo data found");
            return;
        }

        Scanner reader = new Scanner("Data/" + WellnessTracker.studentID + ".txt");

        try (BufferedReader br = new BufferedReader(new FileReader(sav))) {

            String line;

            // Read the file line by line
            while ((line = br.readLine()) != null) {

                // Separate variable name and value
                String[] data = line.split(":", 2);

                if (data.length < 2) {
                    continue;
                }

                String key = data[0].trim();
                String value = data[1].trim();

                // Identify which variable needs to be loaded
                switch (key) {

                    case "Name":
                        WellnessTracker.name = value;
                        break;

                    case "ID":
                        WellnessTracker.studentID = value;
                        break;

                    case "Sleep":
                        WellnessTracker.sleep = Double.parseDouble(value);
                        break;

                    case "SleepGoal":
                        WellnessTracker.sleepGoal = Double.parseDouble(value);
                        break;

                    case "Exercise":
                        WellnessTracker.exercise = Integer.parseInt(value);
                        break;

                    case "ExerciseGoal":
                        WellnessTracker.exerciseGoal = Integer.parseInt(value);
                        break;

                    case "Water":
                        WellnessTracker.water = Double.parseDouble(value);
                        break;

                    case "WaterGoal":
                        WellnessTracker.waterGoal = Double.parseDouble(value);
                        break;
                }
            }

            System.out.println("Data loaded successfully!");

        }
        catch (IOException | NumberFormatException e) {

            System.out.println("Error loading data: " + e.getMessage());

        }
    }

    static void Update() {
        Write();
    }

}

//  SO FAR GOODS NA IBAN 
//  NEED NALANG MA FIX ANG SAVING
//  PROBLEM:
//  EVERYTIME MAG SULOD ANG SAVED NA USER GA LIWAT SA PUNO ANA DATA
//  NEED MAKA UBRA SANG WAY TO WRITE THE DATA IN ITS SPECIFIC LINE OF TEXT
//  FOR EXAMPLE IF MABUTANG KAW SANG SLEEP GOAL MO
//  SLEEP GOAL LANG MA CHANGE INDI ANG TANAN NGA DATA

//  I SUGGEST SEARCH KAMO ABOUT FILEWRITE AND OTHERS, REFER LANG SA GIN IMPORT KO.
//  LANTAW MAN KAMO VIDEOS IF WANT NIYU, BUT WALA VIBE CODE.

//  I RECOMMEND NGA MAG UBRA SANG COPY KA SCRIPT KO NGANI AS BACK UP JUST INCASE NEED MO MAG LIWAT.
//  YELLOW LINES ARE FINE, WARNING LANG NA SILA BUT NOT AN ERROR.