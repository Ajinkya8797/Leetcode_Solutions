package java_leetcode_solutions;

import java.util.Arrays;

public class TwoSum_Solution {

	public int[] twoSum(int[] nums, int target) {
		int[] arr = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					arr[0] = i;
					arr[1] = j;
					return arr; // return immediately after finding the pair
				}
			}
		}
		return arr; // default return (though in LeetCode it's guaranteed that one solution exists)
	}

	public static void main(String[] args) {
		TwoSum_Solution sol = new TwoSum_Solution();

		// Sample test case
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		int[] result = sol.twoSum(nums, target);

		// Print the result
		System.out.println("Indices of numbers that add up to " + target + ": " + Arrays.toString(result));
	}
}
