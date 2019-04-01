package by.epam.training;

public class Lesson2_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//задание 21
		double R;
		R = 987.654;
		
		int x = (int)R;
		//System.out.println(x);
		double y = R - x;
		//System.out.println(y);
		
		double r;
		r = y*1000 + x*0.001;
		
		float w = (float)r;
		System.out.println(w);

	}

}
