package ch03;

import java.util.Scanner;

public class Point {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���.");
		
		String name = scan.next();
		
		System.out.println("���� ������ �Է��ϼ���");
		
		int kor = scan.nextInt();
		
		System.out.println("���� ������ �Է��ϻ���");
		
		int eng = scan.nextInt();
		
		System.out.println("���������� �Է��ϼ���");
		
		int mat = scan.nextInt();
		
		int tot = kor + eng + mat;
		
		double avg = tot / 3.0;
		
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + String.format("%5.1f",avg));
	}

}
