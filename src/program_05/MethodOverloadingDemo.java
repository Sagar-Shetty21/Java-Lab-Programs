
// 05. Program to add two integers and two float numbers. When no arguments are supplied, give a default value to calculate the sum. Use function overloading.

package program_05;

public class MethodOverloadingDemo {
	
	int addition() {
		return (10+10);
	}
	
	int addition(int x, int y) {
		return (x+y);
	}
	
	float addition(float a, float b) {
		return (a+b);
	}
	
	public static void main(String args[]) {
		MethodOverloadingDemo a = new MethodOverloadingDemo();
		System.out.println("By using default values, Sum is : " + a.addition());
		System.out.println("Sum of two integer values(10 and 50) is : " + a.addition(10,20));
		System.out.println("Sum of two float values(10.5 and 20.5) is : " + a.addition(10.5f,20.5f));
	}
}
