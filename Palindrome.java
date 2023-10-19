import java.util.Scanner;

/* Write a Java program to check whether a given word or phrase is a palindrome or not. A palindrome is a word, phrase, number. */



public class Palindrome {
    public static void main(String[] args) {
        Scanner pali = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String input = pali.nextLine();
        pali.close();

        if (isPalindrome(input)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String input) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        input = input.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // It's a palindrome
    }
}
