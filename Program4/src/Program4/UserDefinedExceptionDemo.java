package Program4;

import java.util.Scanner;


public class UserDefinedExceptionDemo {
	public static void main(String argv[]) throws PayoutOfBoundsException {
		System.out.print("Enter the Employee Salary: ");
		Scanner sc = new Scanner(System.in);
		int pay = sc.nextInt();
		if (pay < 10000 || pay > 50000) {
			throw new PayoutOfBoundsException("Salary not in the valid range");
		} else
			System.out.println("Employee eligible for 30% hike");
	}
}
