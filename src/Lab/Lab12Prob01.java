/**
 * File: Lab12Prob01.java
 * Author: Kalis Sandlin, Tyrone Darby, Wesely Soto
 * Created: MAY 1, 2026
 * Description: 
 */
package Lab;

public class Lab12Prob01 {
	public static void main(String[] args) {
		System.out.print(recursiveAbstract(5));
	}
	
	// Recursive method
	public static int recursiveAbstract(int n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return 3;
		} else if (n == 2) {
			return 4;
		} else {
			return recursiveAbstract(n-3) * (recursiveAbstract(n - 2) - recursiveAbstract(n - 1));
		}
	}
}
