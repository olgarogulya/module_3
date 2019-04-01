package by.epam.training;

public class Lesson2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//задание 10
		double x, y, z, z1;
		double sinX, sinY, cosX, cosY, tgXY;
		x = 90; // градусы
		y = 60;
				
		sinX = Math.sin(x * Math.PI / 180);
		sinY = Math.sin(y * Math.PI / 180);
		cosX = Math.cos(x * Math.PI / 180);
		cosY = Math.cos(y * Math.PI / 180);
		tgXY = Math.tan((x* Math.PI / 180) * (y * Math.PI / 180));
		System.out.println("sinX " + sinX);
		System.out.println("sinY " + sinY);
		System.out.println("cosX " + cosX);
		System.out.println("cosY " + cosY);
		System.out.println("tgXY " + tgXY);
		
		z1 = (sinX + cosY) / (cosX - sinY) * tgXY;
		z = (Math.sin(x * Math.PI / 180) + Math.cos(y * Math.PI / 180)) / (Math.cos(x * Math.PI / 180) - Math.sin(y * Math.PI / 180)) * Math.tan((x * Math.PI / 180) * (y * Math.PI / 180));
		System.out.println("total " + z);
		System.out.println("total " + z1);

	}

}
