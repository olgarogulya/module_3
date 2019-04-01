package by.epam.training;

public class Lesson2_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//задание 18
		double a; //длина грани куба
		double S, Sk, V; //площадь грани, площадь полной поверхности, объем куба
		
		a = 3.0;
		S = a * a;
		Sk = S * 6;
		V = a * a * a;
		System.out.println("площадь грани " + S);
		System.out.println("площадь всей поверхности " + Sk);
		System.out.println("объем куба " + V);
	}

}
