import java.util.Scanner;

class HighestException extends Exception {
    @Override
    public String toString() {
        return "Max exceed exception: " + getMessage();
    }

    @Override
    public String getMessage() {
        return "You have exceeded the maximum limit of 5 attempts to access the array.";
    }
}

public class practice_5 {

    static void accessArray() throws HighestException {
        // declaration
        int index, attempts = 0;
        String[] vegetables = {"Potato", "Garlic", "Ginger", "Tomato", "Onion"};
        boolean isIndexValid;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an index number - ");
            index = sc.nextInt();
            isIndexValid = index >= 0 && index < vegetables.length;

            if (!isIndexValid) {
                System.out.println("Invalid index. Please enter a valid index.");
                attempts++;
            }

        } while (!isIndexValid && attempts < 5);

        if (!isIndexValid) {
            throw new HighestException();
        }

        // Perform array access or other operations with the valid index here
        System.out.println("You have successfully accessed the array at index: " + index);
    }

    public static void main(String[] args) {
        try {
            accessArray();
        } catch (HighestException e) {
            System.out.println(e);
        }
    }
}
