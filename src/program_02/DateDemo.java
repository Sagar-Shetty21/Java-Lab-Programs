
// 02. Program to display the month of a year. Months of the year should be held in array.

package program_02;

import java.util.Calendar;

public class DateDemo {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		String[] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		System.out.println("Current Month : " + month[calendar.get(calendar.MONTH)]);
	}
}
