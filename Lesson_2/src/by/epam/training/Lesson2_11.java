package by.epam.training;

public class Lesson2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double a, b; 
		double c;
		double p; 
		double s; 
		
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
