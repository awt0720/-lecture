package ch04;

public class LabelBreak {

	public static void main(String[] args) {

		b:
		
		for(int i = 1; i<=5; i++) {
			
			for(int j = 1; j<=5; j++) {
				
				if(j==3) break;
				
				System.out.println(i+ ","+j);
			}
			if(i==3)break;
		}

	}

}
