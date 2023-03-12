
// 09. In a college first year class are having the following attributes. Name of the class(BCA, BCOM, BSC), Name of the staff, Number of students in class, Array of students in class.
//     Define a class called first year with above attributes and define a suitable constructor. Also write a method called best student() which process a first year object and return the student with the highest total marks.
//     In the main method, define a first year object and find the best student of this class.

package program_09;

import java.util.*;

class FirstYear {
	String className;
	String classTeacher;
	int studentCount;
	int studentMarks[] = new int[50];
	String studentNames[] = new String[50];
	
	Scanner sc = new Scanner(System.in);
	
	public FirstYear() {
		getInfo();
	}
	
	public void getInfo() {
		System.out.println("Please enter the class name : ");
		className = sc.nextLine();
		System.out.println("Please enter the class teacher name : ");
		classTeacher = sc.nextLine();
		System.out.println("Please enter the total number of students of the class : ");
		studentCount = Integer.parseInt(sc.nextLine());
		System.out.println("Please enter the name of all the students in class : ");
		for(int i=0; i<studentCount; i++) {
			studentNames[i] = sc.nextLine();
		}
		System.out.println("Please enter the marks of all the students of the class : ");
		for(int i=0; i<studentCount; i++) {
			studentMarks[i] = sc.nextInt();
		}
	}
	
	public void bestStudent() {
		int best = 0, k = -1;
		for(int i=0; i<studentCount; i++) {
			if(studentMarks[i] > best) {
				best = studentMarks[i];
				k=i;
			}
		}
		System.out.println("The best student is " + studentNames[k]);
	}
}


public class Student {
	public static void main(String args[]) {
		FirstYear fy = new FirstYear();
		fy.bestStudent();
	}
}
