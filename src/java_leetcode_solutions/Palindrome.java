package java_leetcode_solutions;

/** 09 - Palindrome Number */

public class Palindrome {
	public boolean isPalindrome(int x) {
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
		Palindrome sol = new Palindrome();

        int[] testCases = {121, -121, 10};

        for (int x : testCases) {
            System.out.println("Is " + x + " a palindrome? " + sol.isPalindrome(x));
        }

	}

}
