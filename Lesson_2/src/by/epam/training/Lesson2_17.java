package by.epam.training;

public class Lesson2_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//задание 17
		double a,b;
		double c; //среднее арифметическое
		double d; //среднее геометрическое
		a = 21.0;
		b = -12.0;
		
		c = (a + b) / 2;
		System.out.println("среднее арифметическое " + c);
		
		d = Math.sqrt(Math.abs(a) * Math.abs(b));
		//d = Math.pow((Math.abs(a) * Math.abs(b)), (1 / 2.0));
		System.out.println("среднее геометрическое " + d);
	}

}
