package ch04;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {

		Scanner scan =  new Scanner(System.in);
		
		System.out.println("반지름을 입력하세요");

		double r = scan.nextDouble();
		
		double length = 2 * Math.PI * r;
		
		double area = Math.PI * r * r;
		
		System.out.println("반지름"+r);
		
		System.out.println("원둘레"+ String.format("%5.2f", length));
		
		System.out.println("넓이" + String.format("%5.2f", area));
	}

}
