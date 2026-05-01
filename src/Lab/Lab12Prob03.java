/**
 * File: Lab12Prob03.java
 * Author: Kalis Sandlin, Tyrone Darby, Wesley Soto
 * Created: MAY 1, 2026
 * Modified: MAY 1, 2026
 * Description: Reverse a string using recursion and a helper method
 */
package Lab;

public class Lab12Prob03 {
	public static void main(String[] args) {
		System.out.print(reverseString("Hello"));
	}
	
	// Recursive method for string
	public static String reverseString(String s) {
		return reverseString(s, s.length() - 1);
	}
	
	// Helper method
	public static String reverseString(String s, int pointer) {
		if (pointer < 0) {
			return "";
		} else {	
			return  s.charAt(pointer) + reverseString(s, pointer - 1);
		}
	}
}
