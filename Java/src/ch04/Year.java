package ch04;

public class Year {

	public static void main(String[] args) {

		for (int year = 1900; year <= 2020; year++) {
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.println(year+"���� �����Դϴ�.");
			}else {
				System.out.println(year+"���� ����Դϴ�.");
			}
		}

	}

}
