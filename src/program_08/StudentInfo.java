
// 08. Program to create a student class with following attribute enrollment-id, name, marks of sub1, marks of sub2, marks of sub3, total marks.
//     Total of all three subject marks must be calculated only when the student passes in all three subjects. The passing marks for a subject is 50.
//     If a candidate fails in any one of the subjects, his total marks should be declared as zero. Using this condition write a constructor for this class.
//     Write separate functions for accepting and displaying student details. In the main method create an array of three student objects and display the details. 

package program_08;

import java.util.*;

class Student {
	Scanner sc = new Scanner(System.in);
	String enrollmentId;
	String name;
	int sub1, sub2, sub3, total;
	
	Student() {
		readStudentInfo();
	}
	
	public void readStudentInfo() {
		System.out.println("Enter Student Details : ");
		System.out.println("Enrollment Number : ");
		enrollmentId = sc.next();
		System.out.print("Name : ");
		name = sc.next();
		System.out.print("Enter marks of 3 subjects : ");
		sub1 = sc.nextInt();
		sub2 = sc.nextInt();
		sub3 = sc.nextInt();
		
		if(sub1 >= 50 && sub2 >= 50 && sub3 >= 50) {
			total = sub1 + sub2 + sub3;
		}else {
			total = 0;
		}
	}
	
	public void displayInfo() {
		System.out.println(enrollmentId + "\t\t" + name + "\t" + total);
	}
}


public class StudentInfo {
	public static void main(String[] args) {
		Student s[] = new Student[3];
		
		for(int i=0; i<3; i++) {
			s[i] = new Student();
		}
		
		System.out.println("\t\tStudent Details");
		System.out.println("Enrollment Number \t\t Name \t Total");
		
		for(int i=0; i<3; i++) {
			s[i].displayInfo();
		}
	}
}
