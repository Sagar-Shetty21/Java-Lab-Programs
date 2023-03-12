
// 18. Program to list the factorial of the numbers 1 to 10. To calculate the factorial value, use while loop. 

package program_18;

public class Factorial {
	public static void main(String args[]) {
		int fact = 1, i= 1, n;
		while (i <= 10) {
			fact = fact * i;
			System.out.println("The factorial of "+ i +" is : " + fact);
			i++;
		}
	}
}
