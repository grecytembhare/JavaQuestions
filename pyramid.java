import java.util.Scanner;

// Date: 02-11-2023. Write a program to print pyramid pattern using loop


public class pyramid {
    public static void main(String[] args) {
        // taking input fron user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pyramid: ");


        int Rows = input.nextInt();

        for (int i = 1; i <= Rows; i++) {
            // for leading spaces
            for (int j = 1; j <= Rows - i; j++) {
                System.out.print(" ");
            }
            
            // for Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            // Move to the next line
            System.out.println();
        }
        
        input.close();
    }
}
