package by.epam.training;

public class Lesson2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//задание 12
		double x1, y1, x2, y2; //координаты
		double x, y, z;
		
		x1 = 3; y1 = 4;
		x2 = 6; y2 = 12;
		
		x = Math.abs(x2 - x1);
		y = Math.abs(y2 - y1);
		
		//z = Math.sqrt(x * x + y * y);
		z = Math.hypot(x, y);
		
		System.out.println(z);
		}
	}


