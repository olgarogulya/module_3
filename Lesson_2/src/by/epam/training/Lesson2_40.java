package by.epam.training;

public class Lesson2_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//задание 40
		
		double x = 2.0;
		double a, b;
		//a = -2*x+3*x*x-4*x*x*x; //9 операторов
		a = x*(-2+x*(3-4*x)); //6 операторов
		System.out.println(a);
				
		//b = 1+2*x+3*x*x+4*x*x*x; //9
		b = 1+x*(2+x*(3+4*x)); //6
		System.out.println(b);
	
	
		
	}

}
