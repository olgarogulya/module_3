package by.epam.training;

public class Lesson2_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//������� 35
		double M, N;
		M = 12151.7;
		N = 4.2;
		
		double a = M / N;
		System.out.println("����� " + a);
		int a1 = (int)a;
		//System.out.println("a1=" + a1);
		int d = a1 % 10;
		System.out.println("������� ����� ����� ����� " + d);
		
		double a2 = (a - a1) * 10;
		//System.out.println("a2=" + a2);
		int e = (int)a2;
		System.out.println("������� ����� ������� ����� " + e);
	
	}	
	}
