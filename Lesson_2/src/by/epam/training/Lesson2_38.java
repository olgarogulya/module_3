package by.epam.training;

public class Lesson2_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//задание 38 а
		double x1 = -2.0;
		double y1 = 2.0;
		if (x1>=0.0 && y1>=0.0 && (x1-y1)<=4.0) {
			System.out.println("task a - true");
		}
		if (x1<=0.0 && y1>=0.0 && (x1-y1)<=-4.0) {
			System.out.println("task a - true");
		}
		else {
			System.out.println("task a - false");
		}
		//выводит и true и false
		
		//задание 38 b
		double x2 = 0.0;
		double y2 = -5.0;
		if (x2>=-2.0 && x2<=2.0 && y2>=0.0 && y2<=4.0) {
			System.out.println("task b - true");
		}
		if (x2>=-4.0 && x2<=4.0 && y2>=-4.0 && y2<=0.0) {
			System.out.println("task b - true");
		}
		else {
			System.out.println("task b - false");
		}
		
		
		//задание 38 c
		double x3 = 1.0;
		double y3 = -1.0;
		double r = Math.sqrt(x3*x3 + y3*y3);
		System.out.println("r=" + r);
		if (x3 >= 0 && y3 >= 0 && r <= 4.0) {
			System.out.println("task c1 - true");
		}
		if (x3 >= 0 && y3 <= 0 && r <= 5.0) {
			System.out.println("task c2 - true");
		}
		else {
			System.out.println("task c3 - false");
		}
		//выводит и true и false
	}

}
