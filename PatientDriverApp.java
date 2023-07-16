/* Class: CMSC203 CRN 40539
 Program: Assignment #2
 Instructor: Professor Tanveer
 Summary of Description: Assignment2
 Due Date: 07/17/2023 
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
Student’s Name: Michael Lee
*/
import java.util.Scanner;

public class PatientDriverApp {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Get patient information
        System.out.println("Enter patient name: ");
        String patientName = sc.nextLine();

        System.out.println("Enter address: ");
        String address = sc.nextLine();

        System.out.println("Enter city: ");
        String city = sc.nextLine();

        System.out.println("Enter state: ");
        String state = sc.nextLine();

        System.out.println("Enter zip code: ");
        String zip = sc.nextLine();

        System.out.println("Enter contact information: ");
        String contact = sc.nextLine();

        // Date of procedures
        System.out.println("Enter procedure date: ");
        String procedureDate = sc.nextLine();

        // Procedure 1 information
        System.out.println("Enter procedure 1 name: ");
        String procedureName1 = sc.nextLine();

        System.out.println("Enter procedure 1 practitioner: ");
        String practitioner1 = sc.nextLine();

        System.out.println("Enter procedure 1 charge: ");
        int procedureCharge1 = sc.nextInt();
        sc.nextLine(); 

        // Procedure 2 information
        System.out.println("Enter procedure 2 name: ");
        String procedureName2 = sc.nextLine();

        System.out.println("Enter procedure 2 practitioner: ");
        String practitioner2 = sc.nextLine();

        System.out.println("Enter procedure 2 charge: ");
        int procedureCharge2 = sc.nextInt();
        sc.nextLine(); 

        // Procedure 3 information
        System.out.println("Enter procedure 3 name: ");
        String procedureName3 = sc.nextLine();

        System.out.println("Enter procedure 3 practitioner: ");
        String practitioner3 = sc.nextLine();

        System.out.println("Enter procedure 3 charge: ");
        int procedureCharge3 = sc.nextInt();
        sc.nextLine(); 

        Patient patient = new Patient(patientName, address, city, state, zip, contact);
        Procedure procedure1 = new Procedure(procedureName1, procedureDate, practitioner1, procedureCharge1);
        Procedure procedure2 = new Procedure(procedureName2, procedureDate, practitioner2, procedureCharge2);
        Procedure procedure3 = new Procedure(procedureName3, procedureDate, practitioner3, procedureCharge3);

        // Print program information
        System.out.println("Program Author: Michael Lee <07/10/23>\n");

        // Display patient data
        System.out.println("Patient name: " + patient.getName() + "\nAddress: " + patient.getaddress() + "\nCity: " + patient.getCity() + "\nState: " + patient.getState() + "\nZIP: " + patient.getZip() + "\nContact: " + patient.getcontact() + "\n");

        // Display procedures
        System.out.println(procedureToString(procedure1));
        System.out.println(procedureToString(procedure2));
        System.out.println(procedureToString(procedure3));

        // Compute and display total charge
        double totalCharge = procedure1.getCost() + procedure2.getCost() + procedure3.getCost();
        System.out.println("\nThe total charge is: $" + totalCharge + "\n");

        System.out.println("Student name: Michael Lee \nStudent MC M#: M21161342 \nDue Date: 7/17/23");
        sc.close();
    }

    private static String procedureToString(Procedure procedure) {
        return "Procedure: " + procedure.getProcedureName() + "\nProcedure Date: " + procedure.getProcedureDate() + "\nPractitioner: " + procedure.getDoctorName() + "\nProcedure Charge: " + procedure.getCost() + "\n\n";
    }
}