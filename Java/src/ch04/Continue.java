package ch04;

public class Continue {

	public static void main(String[] args) {

		for(int i =1; i<=10; i++) {
			
			//5의 배수이면
			
			//if(i % 5 == 0) break;
			
			if(i % 5 == 0) continue;
			System.out.println(i);
		}
		System.out.println("프로그램 종료");
	}

}
