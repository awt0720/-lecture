package ch04;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		String str = null;
		
		System.out.println(str);
		System.out.println(args);
		
		if( args.length == 0 ) {
			System.out.println("����� �Ű������� �Է��ϼ���");
			
			System.exit(0);
		}
		
		int num = Integer.parseInt(args[0]);
		
		for(int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		
		System.out.println("�����Ϸ��� 0�� �Է��ϼ���");
		Scanner scan =  new Scanner(System.in);
		
		for(;;) {
			//���ѷ���
			System.out.println("�Է��ϼ���");
			int n = scan.nextInt();
			
			if(n==0) break;
			
			System.out.println("�Է��� ����"+n+"�Դϴ�.");
		}
	}

}
