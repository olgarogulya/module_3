package by.epam.training;

public class Lesson2_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//задание 27
		int a, b, c;
		a = 2;
		b = 2;
		
		a = a*a; //4 (2*2)
		//System.out.println(a);
		a = a*a; //16 (2*2 * 2*2)
		//System.out.println(a);
		a = a*a; //256 (2*2*2*2 * 2*2*2*2)
		
		System.out.println(a);
		
		c = b*b; //4 (2*2)
		//System.out.println(c);
		b = b*c; //8 (2 * 2*2)
		//System.out.println(b);
		b = b*c; //32 (2*2*2 * 2*2)
		//System.out.println(b);
		b = b*b; //1024 (2*2*2*2*2 * 2*2*2*2*2)
		
		System.out.println(b);
	}

}
