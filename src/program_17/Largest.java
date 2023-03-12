
// 17. Program to assign two integer values to X and Y . Using the 'if' statement the program should display a message whether X is greater than Y.

package program_17;

import java.util.Scanner;

public class Largest {
	public static void main(String args[]) {
		int X, Y;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of X : ");
		X = sc.nextInt();
		System.out.print("Enter the value of Y : ");
		Y = sc.nextInt();
		
		if (X > Y) {
			System.out.println("X is Largest!");
		}else {
			System.out.println("Y is Largest!");
		}
	}
}
