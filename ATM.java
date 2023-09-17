import java.util.Scanner;

public class ATM{
    public static void main(String[] args) {
        int correctPIN = 1234;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        int enteredPIN = scanner.nextInt();
        if (enteredPIN == correctPIN) {
            System.out.println("PIN is correct. Access granted.");
        } else {
            System.out.println("Incorrect PIN. Access denied.");
        }
        scanner.close();
    }
}
