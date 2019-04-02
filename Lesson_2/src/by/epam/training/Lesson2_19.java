package by.epam.training;

public class Lesson2_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a; 
		double S; 
		double h; 
		double r; 
		double R; 
		double p; 
		
		a = 8.0;
		S = (Math.sqrt(3.0) / 4.0) * a * a;
		h = a * Math.sqrt(3.0) / 2;
		p = (a + a + a) / 2;
		r = Math.sqrt((p - a) * (p - a) * (p - a) / p);
		R = a / Math.sqrt(3.0);
		
		//System.out.println("полупериметр " + p);
		System.out.println("площадь " + S);
		System.out.println("высота " + h);
		System.out.println("радиус вписанной окружности " + r);
		System.out.println("радиус описанной окружности " + R);

	}

}
