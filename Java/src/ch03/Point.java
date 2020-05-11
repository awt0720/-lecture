package ch03;

import java.util.Scanner;

public class Point {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		
		String name = scan.next();
		
		System.out.println("국어 점수를 입력하세요");
		
		int kor = scan.nextInt();
		
		System.out.println("영어 점수를 입력하새요");
		
		int eng = scan.nextInt();
		
		System.out.println("수학점수를 입력하세요");
		
		int mat = scan.nextInt();
		
		int tot = kor + eng + mat;
		
		double avg = tot / 3.0;
		
		System.out.println("이릅\t국어\t영어\t수학\t총점\t평균");
		
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + String.format("%5.1f",avg));
	}

}
