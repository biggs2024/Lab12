/**
 * File: Lab12Prob02.java
 * Author: Kalis Sandlin, Tyrone Darby, Wesley Soto
 * Created: MAY 1, 2026
 * Modified: MAY 1, 2026
 * Description: Reverse a string using recursion
 */
package Lab;

public class Lab12Prob02 {
	public static void main(String[] args) {
		System.out.print(reverseString("Hello"));
	}
	
	// Recursive method for string
	public static String reverseString(String s) {
		if (s.length() == 0) {
			return s;
		} else if (s.length() == 1) {
			return s;
		} else {
			return reverseString(s.substring(1)) + s.charAt(0);
		}
	}
}
