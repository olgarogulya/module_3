package by.epam.training;

public class Lesson2_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//задание 35
		double M, N;
		M = 12151.7;
		N = 4.2;
		
		double a = M / N;
		System.out.println("число " + a);
		int a1 = (int)a;
		//System.out.println("a1=" + a1);
		int d = a1 % 10;
		System.out.println("младшая цифра целой части " + d);
		
		double a2 = (a - a1) * 10;
		//System.out.println("a2=" + a2);
		int e = (int)a2;
		System.out.println("старшая цифра дробной части " + e);
	
	}	
	}
