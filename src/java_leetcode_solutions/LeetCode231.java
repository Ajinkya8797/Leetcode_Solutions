package java_leetcode_solutions;

/**
 * @author AjinkyaL Java Solution for LeetCode Problem #231 - Power of Two
 */

public class LeetCode231 {

	public static boolean isPowerOfTwo(int n) {
		if (n < 1) {
			return false;
		} else if (n == 1) {
			return true;
		} else {

			while (n % 2 == 0) {
				n = n / 2;
			}

			if (n == 1) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static void main(String[] args) {
		// Test cases
		int[] testCases = {1, 16, 3};

        for (int n : testCases) {
            System.out.println("isPowerOfTwo(" + n + ") = " + isPowerOfTwo(n));
        }

	}

}
