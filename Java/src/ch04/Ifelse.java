package ch04;

public class Ifelse {

	public static void main(String[] args) {

		int kor = 55;
		int eng = 35;
		int mat = 45;
		
		int tot=kor+eng+mat;
		
		double avg=tot/3.0;
		
		String grade="";
		
		if(avg >= 90 && avg <=100) {grade="��";

	}else if(avg >= 80 && avg <=90) {grade="��";

	}else if(avg >= 70 && avg <=80) {grade="��";
	
	}else if(avg >= 60 && avg <=70) {grade="��";
	
	}else {grade="��";
	
	}
		System.out.println("����\t����\t����\t����\t���\t���");
		System.out.println(kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + String.format("%5.1f", avg) + "\t" + grade);
	}
	}
