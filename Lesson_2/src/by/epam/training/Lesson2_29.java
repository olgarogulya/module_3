package by.epam.training;

public class Lesson2_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//������� 29
		double x, y, z; //���� � ��������
		double x1, y1, z1; //���� � ��������
		double a, b, c; //�������
		double cosX, cosY, cosZ;
		a = 3.0;
		b = 4.0;
		c = 5.0;
			
		cosX = (a * a + c * c - b * b) / (2 * a * c);
		System.out.println("cosX " + cosX);
		x = Math.acos(cosX);
		System.out.println("x " + x + " ������");
		x1 = x * 180 / Math.PI;
		System.out.println("x " + x1 + " ��������");
		
		cosY = (a*a + b*b - c*c) / (2*a*b);
		System.out.println("cosY " + cosY);
		y = Math.acos(cosY);
		System.out.println("y " + y + " ������");
		y1 = y * 180 / Math.PI;
		System.out.println("y " + y1 + " ��������");
		
		cosZ = (b*b + c*c - a*a) / (2*c*b);
		System.out.println("cosZ " + cosZ);
		z = Math.acos(cosZ);
		System.out.println("z " + z + " ������");
		z1 = z * 180 / Math.PI;
		System.out.println("z " + z1 + " ��������");
						
		//System.out.println(x1 + y1 + z1);
	}

}
