package by.epam.training;

public class Lesson2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//задание 8
		double a, b, c, d;
		a = 2;
		b = 144; 
		c = 1;
		
		d = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
		d = (b +Math.sqrt( b * b + 4 * a * c)) / (2 * a) - a * a * a * c + Math.pow(b, -2);
		System.out.println(d);

	}

}
