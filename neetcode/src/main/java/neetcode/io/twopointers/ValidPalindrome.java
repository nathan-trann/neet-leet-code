package neetcode.io.twopointers;

import java.util.Arrays;

public class ValidPalindrome {

    public static void main(String[] args) {
        String test = " ";
        System.out.println(isPalindrome(test));
    }

    private static boolean isPalindrome(String s) {
        if (s.isBlank() || s.isEmpty()) {
            return true;
        }

        int i = 0;
        int j = s.length() - 1;
        while (i < j) {

            char start = s.charAt(i);
            char end = s.charAt(j);

            if (!Character.isLetterOrDigit(start)) {
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(end)) {
                j--;
                continue;
            }

            if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
