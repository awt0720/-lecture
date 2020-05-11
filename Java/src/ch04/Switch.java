package ch04;

public class Switch {

	public static void main(String[] args) {


		int kor=55;
		int eng=35;
		int mat=45;
		int tot=kor+eng+mat;
		double avg=tot/3.0;
		String grade="";
		
		switch((int)(avg/10)){
		
		case 10:
			
		case 9: grade = "수"; break;
		case 8: grade = "우"; break;
		case 7: grade = "미"; break;
		case 6: grade = "양"; break;
		default: grade="가";
	}
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		
		System.out.println(kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + String.format("%5.1f", avg) + "\t" + grade);
	}
}
