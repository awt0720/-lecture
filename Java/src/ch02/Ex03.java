package ch02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���");
		
		String name=scan.next();
		
		System.out.println("����� �̸���" + name + "�Դϴ�.");
		
		System.out.println("���̸� �Է��ϼ���");
		
		int age=scan.nextInt();
		
		System.out.println("����� ���̴�"+ age + "�Դϴ�.");
		
		scan.close();
	}

}
