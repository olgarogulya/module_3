package by.epam.training;

public class Lesson2_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//������� 28
		double r, g, m, s;
		r = 0.5; //������
		
		// 1 ������ = 180 �� / ��
		g = r * 180 / Math.PI;
		System.out.println(g);
		int gr = (int)g;
		//1 ������ - 60 �����
		double temp1 = g - gr;
		m = temp1 * 60;
		System.out.println(m);
		int min = (int)m;
		// 1 ������ - 60 ������
		double temp2 = m - min;
		s = temp2 * 60;
		int sec = (int)s;
		System.out.println(s);
		
		System.out.println(gr + "`" + min+ "'" + sec +"''");
	}

}
