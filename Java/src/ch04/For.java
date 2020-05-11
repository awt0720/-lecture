package ch04;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		String str = null;
		
		System.out.println(str);
		System.out.println(args);
		
		if( args.length == 0 ) {
			System.out.println("명령행 매개변수를 입력하세요");
			
			System.exit(0);
		}
		
		int num = Integer.parseInt(args[0]);
		
		for(int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		
		System.out.println("종료하려면 0을 입력하세요");
		Scanner scan =  new Scanner(System.in);
		
		for(;;) {
			//무한루프
			System.out.println("입력하세요");
			int n = scan.nextInt();
			
			if(n==0) break;
			
			System.out.println("입력한 값은"+n+"입니다.");
		}
	}

}
