package by.epam.training;

public class Lesson2_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//������� 23
		double R, r; //������� ������ � �������� �����
		double s, S; //������� ������ � �������� �����
		double Sk; //������� ������
		
		R = 12;
		r = 4;
		
		if(R > r) {
			s = Math.PI * r * r;
			S = Math.PI * R * R;
			Sk = S - s;
			System.out.println("������� ������ ����� " + Sk);
		}
		else {
			System.out.println("R ������ ���� ������ r");
		}
	}

}
