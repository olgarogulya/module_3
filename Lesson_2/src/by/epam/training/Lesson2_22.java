package by.epam.training;

public class Lesson2_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//������� 22
		double T; //������������ � ��������
		T = 56311;
		if (T<60) {
			int ss = (int)T;
			if (ss<10) {
				System.out.println("00�" + " " + "00���" + " " + "0" + ss + "�");	
			}
			if (ss>=10) {
				System.out.println("00�" + " " + "00���" + " " + ss + "�");
			}
		
		}
		if (T>=60 && T<3600){
			double m = T / 60.0;
			int mm = (int)m;
			//System.out.println(mm);
			double s = T - mm * 60;
			int ss = (int)s;
			//System.out.println(ss);
			System.out.println("00�" + " " + mm + "���" + " " + ss + "�");
		}
		if (T>=3600){
			double h = T / 3600.0;
			int hh = (int)h;
			//System.out.println(hh);
			double m = T / 60.0 - hh * 60;
			int mm = (int)m;
			//System.out.println(mm);
			double s = T - (hh * 60 + mm) * 60;
			int ss = (int)s;
			//System.out.println(ss);
			System.out.println(hh + "�" + " " + mm + "���" + " " + ss + "�");
			}
	}

}
//�� ������� � ����������� �������, ���� �������� ������ 10