package java_leetcode_solutions;
import java.util.HashMap;
import java.util.Map;

/**
 * @author AjinkyaL Java Solution for LeetCode Problem #13 - Roman to integer
 */

public class LeetCode13 {

	public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
            }
        }

        return result;
    }
	public static void main(String[] args) {
		
		// Test Cases: 
		String rm1 = "III";  
		int result = romanToInt(rm1);
		System.out.println("The integer value of " + rm1 + " is: " + result);
		
		String rm2 = "LVIII";
		result = romanToInt(rm2);
		System.out.println("The integer value of " + rm2 + " is: " + result);
		
		String rm3 = "MCMXCIV";  
        result = romanToInt(rm3);  
        System.out.println("The integer value of " + rm3 + " is: " + result);
	}

}
