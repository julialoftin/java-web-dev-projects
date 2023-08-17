package launchcode.org;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class HashMapPractice {
    public static void main(String[] args){

        // Create HashMap collection
        HashMap<String, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newID;

        System.out.println("Enter student IDs (Enter to finish):");


        //collect IDs and names
        do {

            System.out.print("ID: ");
            newID = input.nextLine();

            if(!newID.isEmpty()){
                System.out.print("Name: ");
                String student = input.nextLine();
                students.put(newID, student);

                input.nextLine();
            }
        } while (!newID.isEmpty());

        //Print out the roster
        System.out.println("\nClass Roster:");
        for(Map.Entry<String, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }
    }
}
