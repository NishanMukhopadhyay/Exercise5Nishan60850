import java.util.Scanner;

public class task4Nishan {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input the first string: ");
        String nishan60850FirstInput = keyboard.nextLine();
        System.out.print("Input the second string: ");
        String nishan60850SecondString = keyboard.nextLine();

        String concatStr1 = nishan60850FirstInput.concat(nishan60850SecondString);
        String concatStr2 = nishan60850SecondString.concat(nishan60850FirstInput);
        // checks if the composition of two different Strings is alternating
        //  didn't understand what that means :) sorry
        boolean isAlternating = true;
        for (int i = 0; i < concatStr1.length() - 1; i++) {
            if (concatStr1.charAt(i) != concatStr2.charAt(i)) {
                isAlternating = false;
                break;
            }
        }
        System.out.println(isAlternating);
    }
}

