package ch04;

import java.util.Scanner;

public class Cont {

	public static void main(String[] args) {


		String name="";
		
		int price = 0;
		
		int point = 0;
		
		int point_use = 0;
		
		int fee = 0;
		
		int pay;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���");
		
		name=scan.next();
		
		System.out.println("�ݾ��� �Է��ϼ���");
		
		price = scan.nextInt();
		
		System.out.println("����Ʈ�� �Է��ϼ���");
		
		point = scan.nextInt();
		
		if(price < 20000) {
			
			fee = 2000;
			
		}
		
		if(point >= 10000) {
			
			point_use = point;
			
			pay = price + fee - point;
		}
		else {
			
			pay = price + fee;
		}
		
		System.out.println("�̸�\t���űݾ�\\t��۷�\\t����Ʈ���\\t�����ݾ�");
		
		System.out.println(name + "\t" + price + "\t" + fee + "\t" + point_use + "\t\t" + pay);
	}

}
