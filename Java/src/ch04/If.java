package ch04;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���");
		
		int num=scan.nextInt();
		
		if(num % 2 == 0) {
			
			System.out.println(num+"�� ¦�� �Դϴ�.");
		}else {
			System.out.println(num+"�� Ȧ�� �Դϴ�.");
		}

	}

}
