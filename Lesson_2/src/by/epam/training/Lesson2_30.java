package by.epam.training;

public class Lesson2_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//задание 30
		double R1, R2, R3; //сопротивления
		double R; //сопротивление соединения
		R1 = 10;
		R2 = 12;
		R3 = 7;
		
		R = 1 / (1/R1 + 1/R2 + 1/R3);
		System.out.println("сопротивление соединения равно " + R);
		
	}

}
