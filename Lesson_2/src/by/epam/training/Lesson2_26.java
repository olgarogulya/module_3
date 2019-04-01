package by.epam.training;

public class Lesson2_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//задание 26
		double a, b, y, s; //сторона a, сторона b, угол, площадь
		a = 5.0;
		b = 7.0;
		y = 30; //градусов
		
		s = a * b * Math.sin(y * Math.PI / 180) / 2;
		System.out.println("площадь треугольника " + s);
	}

}
