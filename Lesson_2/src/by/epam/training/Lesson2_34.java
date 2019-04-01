package by.epam.training;

public class Lesson2_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//задание 34
		double A = 245.0; // объем информации в байтах
		
		double k, m, g;
		
		k= A / 1024.0;
		m = k / 1024.0;
		g = m / 1024.0;
				
		System.out.println(A + " байт равно " + k + " Кбайт");
		System.out.println(A + " байт равно " + m + " Мбайт");
		System.out.println(A + " байт равно " + g + " Гбайт");
	}

}
