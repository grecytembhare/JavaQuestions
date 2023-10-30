
import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // Close the Scanner
        scanner.close();
    }

    // Function to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 400 == 0) 
        || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }
}
