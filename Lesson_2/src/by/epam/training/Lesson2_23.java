package by.epam.training;

public class Lesson2_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double R, r; //радиусы малого и большого круга
		double s, S; //площади малого и большого круга
		double Sk; //площадь кольца
		
		R = 12;
		r = 4;
		
		if(R > r) {
			s = Math.PI * r * r;
			S = Math.PI * R * R;
			Sk = S - s;
			System.out.println("площадь кольца " + Sk);
		}
		else {
			System.out.println("R должен быть больше r");
		}
	}

}
