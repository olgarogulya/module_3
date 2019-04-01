package by.epam.training;

public class Lesson2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//задание 11
		double a, b; //катеты
		double c; //гипотенуза
		double p; //периметр
		double s; //площадь
		
		a = 3;
		b = 4;

		c = Math.sqrt(a * a + b * b);
		System.out.println("гипотенуза " + c);
		
		p = a + b + c;
		s = a * b / 2;
		
		System.out.println("периметр " + p);
		System.out.println("площадь " + s);
	}

}
