import java.util.Scanner;

/**
 * Task 5 Nishan
 */

public class task5Nishan {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input a String: ");
        String input = keyboard.nextLine();
        input = input.toLowerCase();

        boolean isPalindrome = true;
        int length = input.length();

        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " isn't a palindrome.");
        }
    }
}
