package ch04;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {

		Scanner scan =  new Scanner(System.in);
		
		System.out.println("�������� �Է��ϼ���");

		double r = scan.nextDouble();
		
		double length = 2 * Math.PI * r;
		
		double area = Math.PI * r * r;
		
		System.out.println("������"+r);
		
		System.out.println("���ѷ�"+ String.format("%5.2f", length));
		
		System.out.println("����" + String.format("%5.2f", area));
	}

}
