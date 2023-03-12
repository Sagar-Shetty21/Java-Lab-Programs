
// 07. Program with class variable that is available for all instances of a class. Use static variable declaration.
//     Observe the changes that occur in the object's member variable value.

package program_07;

class Student {
	static String collegeName = "Silicon College";
	int rollNo;
	String name;
	
	Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	void display() {
		System.out.println(collegeName + " " + rollNo + " " + name);
	}
}


public class StaticDemo {
	public static void main(String args[]) {
		System.out.println("Objects sharing the static variable - collegeName\n");
		Student s1 = new Student (1001, "Ram");
		Student s2 = new Student (1002, "Bheem");
		s1.display();
		s2.display();
		System.out.println("\nStatic value changed by one of the objects. \n");
		s1.collegeName = "SJES College";
		s1.display();
		s2.display();
	}
}
