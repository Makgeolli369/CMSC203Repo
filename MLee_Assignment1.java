package Assignment1;
public class MLee_Assignment1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your MC M#: ");
        String mcNumber = scanner.nextLine();
        System.out.print("Describe yourself: ");
        String description = scanner.nextLine();
        System.out.println("Due Date: 06/20/23");
        System.out.println("CMSC203 Assignment1: Test your ESP skills!");
        int correctGuesses = 0;
        for (int round = 1; round <= 10; round++) {
            System.out.println("\nRound " + round);
            System.out.println("I am thinking of a color.");
            System.out.println("Is it Red (0), Green (1), Blue (2), Orange (3), or Yellow (4)?");
            int randomNumber = (int) (Math.random() * 5); // Generate a random number from 0 to 4
            System.out.print("Enter your guess here: ");
            int userGuess = scanner.nextInt();
            String selectedColor;
            switch (randomNumber) {
                case 0:
                    selectedColor = "Red";
                    break;
                case 1:
                    selectedColor = "Green";
                    break;
                case 2:
                    selectedColor = "Blue";
                    break;
                case 3:
                    selectedColor = "Orange";
                    break;
                case 4:
                    selectedColor = "Yellow";
                    break;
                default:
                    selectedColor = "";
                    break;
            }
            System.out.println("I was thinking of " + selectedColor);
            if (userGuess == randomNumber) {
                correctGuesses++;
            }
        }
        System.out.println("\nGame Over");
        System.out.println("You guessed " + correctGuesses + " out of 10 colors correctly.");
        System.out.println("\nUser Name: " + name);
        System.out.println("Student MC M#: " + mcNumber);
        System.out.println("User Description: " + description);
        System.out.println("Date: " + java.time.LocalDate.now());
    }
    }
