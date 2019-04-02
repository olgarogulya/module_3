package by.epam.training;

public class Lesson2_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double a, b, y, S; 
		double h; 
		a = 10.0;
		b = 6.0;
		y = 60.0; //угол в градусах
		
		h = (a - b) / 2 * Math.tan(y * Math.PI / 180);
		S = (a + b) / 2 * h;
		System.out.println("площадь " + S);
	}

}
