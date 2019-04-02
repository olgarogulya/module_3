package by.epam.training;

public class Lesson2_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double A = 245.0; 
		
		double k, m, g;
		
		k= A / 1024.0;
		m = k / 1024.0;
		g = m / 1024.0;
				
		System.out.println(A + " byte - " + k + " Kbyte");
		System.out.println(A + " byte - " + m + " Mbyte");
		System.out.println(A + " byte - " + g + " Gbyte");
	}

}
