package ch04;

import java.util.GregorianCalendar;

public class Test {
	
	public static void main(String[] args) {
	
			System.out.println(Math.PI);
			
			int year=2016;
			
			GregorianCalendar cal = new GregorianCalendar();
	if(cal.isLeapYear(year)) {
		System.out.println("윤년입니다.");
	}else {
		System.out.println("평년입니다.");
	}

}
}
