package by.epam.training;

public class Lesson2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//задание 6
		double n; //количество малых бидонов
		double m; //количество больших бидонов
		double kn; //количество молока в малом бидоне, литров
		double km; //количество молока в большом бидоне, литров
		double l; //количество молока в m больших бидонах
		
		n = 10;
		m = 10;
		kn = 80 / n;
		km = kn + 12;
		l = km * m;
		//l = (80 / n + 12) * m;
		
		System.out.println(l);
		

	}

}
