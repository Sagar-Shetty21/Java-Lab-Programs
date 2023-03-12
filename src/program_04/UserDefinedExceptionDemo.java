
// 04. Program to create a user-defined exception saying pay out of bounds.

package program_04;

import java.util.*;

class PayOutOfBoundsException extends Exception {
	PayOutOfBoundsException(String msg){
		System.out.println("Pay out of bound Exception : " + msg);
	}
}

public class UserDefinedExceptionDemo {
	public static void main(String args[]) throws PayOutOfBoundsException {
		System.out.print("Enter the Employee Salary : ");
		Scanner sc = new Scanner(System.in);
		int pay = sc.nextInt();
		if(pay < 10000 || pay > 50000) {
			throw new PayOutOfBoundsException("Salary not in the valid range!");
		}else {
			System.out.println("Employee eligible for 30% hike");
		}
	}
}
