package java_leetcode_solutions;

/**
 * @author AjinkyaL Java Solution for LeetCode Problem #09 - Palindrome Number
 */

public class LeetCode09 {
	public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int n = x;
        int revNum = 0;

        while (n > 0) {
            int d = n % 10;
            revNum = revNum * 10 + d;
            n = n / 10;
        }

        return revNum == x;
    }

	public static void main(String[] args) {
		
        int[] testCases = {121, -121, 10};

        for (int x : testCases) {
            System.out.println("Is " + x + " a palindrome - " + LeetCode09.isPalindrome(x));
        }

	}

}
