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
			
		case 9: grade = "��"; break;
		case 8: grade = "��"; break;
		case 7: grade = "��"; break;
		case 6: grade = "��"; break;
		default: grade="��";
	}
		System.out.println("����\t����\t����\t����\t���\t���");
		
		System.out.println(kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + String.format("%5.1f", avg) + "\t" + grade);
	}
}
