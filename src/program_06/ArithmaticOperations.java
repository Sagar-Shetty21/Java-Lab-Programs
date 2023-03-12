
// 06. Program to perform mathematical operations, create a class called AddSub with methods to add and subtract.
//     Create another class called MulDiv that extends from AddSub class to use the member data of the super class.
//     MulDiv should have methods to multiply and divide. A main function should access the methods and perform the mathematical operations.

package program_06;


class AddSub{
	int n1, n2;
	
	public AddSub(int x, int y) {
		n1= x;
		n2= y;
	}
	
	public int add() {
		return (n1 + n2);
	}
	
	public int sub() {
		return (n1 - n2);
	}
}

class MulDiv extends AddSub {
	
	public MulDiv(int x, int y) {
		super(x, y);
	}
	
	public int mul() {
		return (n1 * n2);
	}
	
	public int div() {
		return (n1 / n2);
	}
}


public class ArithmaticOperations {
	public static void main(String args[]) {
		MulDiv obj = new MulDiv(20,10);
		System.out.println("Sum of 20 and 10 is : " + obj.add());
		System.out.println("Difference between 20 and 10 is : " + obj.sub());
		System.out.println("Product of 20 and 10 is : " + obj.mul());
		System.out.println("Division of 20 by 10 is : " + obj.div());
	}
}
