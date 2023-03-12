
// 10. Program to define a class called employee with the name and date of appointment. Create then employee objects as an array and sort them as per their date of appointment. That is, print them as per their seniority. 

package program_10;

import java.util.Date;

class Employee{
	String name;
	Date appDate;
	
	public Employee(String aName, Date aAppDate) {
		name = aName;
		appDate = aAppDate;
	}
	
	public void display() {
		System.out.println("Employee name : " + name + "\tAppointment date :\t" + appDate.getDate() + "/" + appDate.getMonth() + "/" + appDate.getYear());
	}
}

public class EmpDate {
	public static void main(String args[]) {
		Employee emp[] = new Employee[10];

		emp[0] = new Employee("Bheem", new Date(1999,05,22));
		emp[1] = new Employee("Chutki", new Date(1979,11,17));
		emp[2] = new Employee("Raju", new Date(2022,07,22));
		emp[3] = new Employee("Jaggu", new Date(1999,05,22));
		emp[4] = new Employee("Indumathi", new Date(1999,05,22));
		emp[5] = new Employee("Daaku Mangalseen", new Date(1999,05,22));
		emp[6] = new Employee("Kaliya", new Date(1999,05,22));
		emp[7] = new Employee("Dholu", new Date(1999,05,22));
		emp[8] = new Employee("Bholu", new Date(1999,05,22));
		emp[9] = new Employee("Kilmaada", new Date(1999,05,22));
		
		System.out.println("List of Employees:-");
		for(int i=0; i<emp.length; i++) {
			emp[i].display();
		}
		
		for(int i=0; i<emp.length; i++) {
			for(int j=i+1; j<emp.length; j++) {
				if(emp[i].appDate.after(emp[j].appDate)) {
					Employee t = emp[i];
					emp[i] = emp[j];
					emp[j] = t;
				}
			}
		}
		
		System.out.println("\n\nList of Employees:-");
		for(int i=0; i<emp.length; i++) {
			emp[i].display();
		}
	}
}
