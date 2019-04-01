package by.epam.training;

public class Lesson2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//задание 13
				double x1, y1; //координаты a
				double x2, y2; //координаты b
				double x3, y3; //координаты c
				double ab, bc, ac; //стороны треугольника
				double P, p; //периметр и полупериметр
				double S; //площадь
				
				x1 = 3; y1 = 4;
				x2 = 6; y2 = 12;
				x3 = 9; y3 = 7;
				
				ab = Math.hypot(Math.abs(x2 - x1), Math.abs(y2 - y1));
				bc = Math.hypot(Math.abs(x3 - x2), Math.abs(y3 - y2));
				ac = Math.hypot(Math.abs(x3 - x1), Math.abs(y3 - y1));
				
				P = ab + bc + ac;
				p = P / 2;
				S = Math.sqrt(P * (p - ab) * (p - bc) * (p - ac));
				
				System.out.println("периметр треугольника равен " + P);
				System.out.println("площадь треугольника равна " + S);
	}

}
