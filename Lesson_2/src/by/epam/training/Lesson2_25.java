package by.epam.training;

public class Lesson2_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//задание 25
		//a*x*x+b*x+c=0
		
		double a, b, c, x1, x2, x, d;
		a = 2.0;
		b = 4.0;
		c = 1.0;
		
		d = b * b - 4.0 * a * c;
		System.out.println("d=" + d);
		
		if (a != 0 && d > 0) {
			x1 = (- b + Math.sqrt(d)) / (2.0 * a);
			x2 = (- b - Math.sqrt(d)) / (2.0 * a);
			System.out.println("x1=" + x1);
			System.out.println("x2=" + x2);
		}
		if (a != 0 && d == 0) {
			x = - b / (2.0 * a);
			System.out.println(x);
		}
		if (a == 0 || d < 0) {
			System.out.println("условия не выполняются");
		}

	}

}