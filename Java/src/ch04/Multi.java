package ch04;

public class Multi {

	public static void main(String[] args) {

		int num = 20;
		
		long sum = 1;
		
		for(int i=1; i <= num; i++) {
			
			sum *=i;
		}
		
		System.out.println("1~"+num+"������ ��:"+sum);

	}

}
