/* Class: CMSC203 CRN 23239
Program: Assignment #1
Instructor: Professor Eivazi
Summary of Description: ESP program
Due Date: 09/11/2023 
Integrity Pledge: I pledge that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
Student’s Name: Michael Lee
*/
package esp;

public class assignment1 {
    public static void main(String[] args) {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
			System.out.print("Enter your name: ");
			String name = scanner.nextLine();
			System.out.print("Enter your MC M#: ");
			String mcNumber = scanner.nextLine();
			System.out.print("Describe yourself: ");
			String description = scanner.nextLine();
			System.out.println("Due Date: 9/11/23");
			System.out.println("CMSC203 Assignment1: Test your ESP skills!");
			int correctGuesses = 0;
			for (int round = 1; round <= 10; round++) {
			    System.out.println("\nRound " + round);
			    System.out.println("I am thinking of a color.");
			    System.out.println("Is it Red, Green, Blue, Orange, or Yellow?");
			    System.out.print("Enter your guess here: ");
			    String userGuess = scanner.nextLine();
			    String selectedColor;
			    switch (userGuess) {
			        case "Red":
			        case "red":
			            selectedColor = "Red";
			            break;
			        case "Green":
			        case "green":
			            selectedColor = "Green";
			            break;
			        case "Blue":
			        case "blue":
			            selectedColor = "Blue";
			            break;
			        case "Orange":
			        case "orange":
			            selectedColor = "Orange";
			            break;
			        case "Yellow":
			        case "yellow":
			            selectedColor = "Yellow";
			            break;
			        default:
			            selectedColor = "a color not listed";
			            break;
			    }
			    System.out.println("I was thinking of " + selectedColor);
			    int randomNumber = (int) (Math.random() * 5); // Generates a random number from 0 to 4		    
			    String randomColor = null;
			    switch (randomNumber) {
	               case 0:
	                   randomColor = "Red";
	                   break;
	               case 1:
	                   randomColor = "Green";
	                   break;
	               case 2:
	                   randomColor = "Blue";
	                   break;
	               case 3:
	                   randomColor = "Orange";
	                   break;
	               case 4:
	                   randomColor = "Yellow";
	                   break;
	           }
			    if (userGuess.equalsIgnoreCase(randomColor)) {
			        correctGuesses++;
			    }
			}
			System.out.println("\nGame Over");
			System.out.println("You guessed " + correctGuesses + " out of 10 colors correctly.");
			System.out.println("\nUser Name: " + name);
			System.out.println("Student MC M#: " + mcNumber);
			System.out.println("User Description: " + description);
		}
        System.out.println("Date: " + java.time.LocalDate.now());
    }
    }