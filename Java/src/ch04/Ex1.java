package ch04;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		 
	for(int i=0;i<size; i++) {
		
		for(int j=0; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
		}
	
	String stars = "";
	for(int i=0; i<size; i++) {
		stars += "*";
		System.out.println(stars);
	}
	}

}
