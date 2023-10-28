import java.util.Scanner;

public class PrimeNumberChecker {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();
        scanner.close();

        boolean result = isPrime(inputNumber);

        if (result) {
            System.out.println(inputNumber + " is a prime number.");
        } else {
            System.out.println(inputNumber + " is not a prime number.");
        }
    }
}
