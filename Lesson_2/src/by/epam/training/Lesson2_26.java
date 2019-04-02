package by.epam.training;

public class Lesson2_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//çàäàíèå 26
		double a, b, y, s; 
		a = 5.0;
		b = 7.0;
		y = 30; //угол в градусах
		
		s = a * b * Math.sin(y * Math.PI / 180) / 2;
		System.out.println("площадь треугольника " + s);
	}

}
