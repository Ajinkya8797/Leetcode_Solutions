package java_leetcode_solutions;
import java.util.Arrays;

/**
 * @author AjinkyaL Java Solution for LeetCode Problem #01 - Two Sum
 */

public class LeetCode01 {

	public int[] twoSum(int[] nums, int target) {
		int[] arr = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					arr[0] = i;
					arr[1] = j;
					return arr;
				}
			}
		}
		return arr; // This will never be reached as per LeetCode guarantee
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		LeetCode01 obj = new LeetCode01(); // create object
		int[] result = obj.twoSum(nums, target); // call method

		System.out.println("Indices of numbers that add up to " + target + ": " + Arrays.toString(result));
	}
}
