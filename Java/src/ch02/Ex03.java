package ch02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		
		String name=scan.next();
		
		System.out.println("당신의 이름은" + name + "입니다.");
		
		System.out.println("나이를 입력하세요");
		
		int age=scan.nextInt();
		
		System.out.println("당신의 나이는"+ age + "입니다.");
		
		scan.close();
	}

}
