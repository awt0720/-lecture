package ch04;

import java.util.Scanner;

public class Holiday {
	
	public static void main(String[] args) {
		
		int year;
		
		int days;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�ټӿ����� �Է��ϼ���");
		
		year = scan.nextInt();
		
		if(year <= 3) {
			
			days = 3;
			
		}else if (year < 10) {
			
			days = 5;
			
		}else if(year < 20) {
			
			days = 10;
			
		}else {
			
			days =20;
		}
		
		System.out.println("�ټ� ������ " +year+"���̰�");
		System.out.println("�ް� �ϼ���" +days+"�Դϴ�.");
	}

}
