package ch04;

public class If2 {

	public static void main(String[] args) {

		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		
		int num = Integer.parseInt(args[0]);
		
		if(num % 2 == 0) {
			
			System.out.println(num+"�� ¦�� �Դϴ�.");
		}else {
			System.out.println(num+"�� Ȧ�� �Դϴ�.");
		}

	}

}

