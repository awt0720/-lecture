package ch02;

public class Verscope {
	
	static int x; //전역 변수
	
	public static void main(String[] args) {
		int y = 0; //지역변수
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
