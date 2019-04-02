package by.epam.training;

public class Lesson2_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//çàäàíèå 32
		
		double m, n, k; //текущее показание времени
		double p, q, r; //будущее показание времени 
		
		m = 11.0;
		n = 15.0;
		k = 46.0;
		
		p = 16.0;
		q = 38.0;
		r = 59.0;
		
		double t = (m+p)*60*60 + (n+q)*60 + k + r;
		//System.out.println(t);
		double T; //длительность в секундах
		T = t;
		
		if (T<60) {
			int ss = (int)T;
			System.out.println("00ч" + " " + "00мин" + " " + ss + "с");
		}
		
		if (T>=60 && T<3600){
			double f = T / 60.0;
			int mm = (int)f;
			//System.out.println(mm);
			double s = T - mm * 60;
			int ss = (int)s;
			//System.out.println(ss);
			System.out.println("00ч" + " " + mm + "мин" + " " + ss + "с");
		}
		
		if (T>=3600 && T<86400){
			double h = T / 3600.0;
			int hh = (int)h;
			//System.out.println(hh);
			double f = T / 60.0 - hh * 60;
			int mm = (int)f;
			//System.out.println(mm);
			double s = T - (hh * 60 + mm) * 60;
			int ss = (int)s;
			//System.out.println(ss);
			System.out.println(hh + "ч" + " " + mm + "мин" + " " + ss + "с");
			}
		if (T>=86400){
			double d = T / 86400.0;
			int dd = (int)d;
			//System.out.println(dd);
			double h = T / 3600.0 - dd * 24;
			int hh = (int)h;
			//System.out.println(hh);
			double f = T / 60.0 - dd * 24 * 60 - hh * 60;
			int mm = (int)f;
			//System.out.println(mm);
			double s = T - dd * 24 * 60 * 60 - hh * 60 * 60 - mm * 60;
			int ss = (int)s;
			//System.out.println(ss);
			System.out.println(hh + "ч" + " " + mm + "мин" + " " + ss + "с");
			}
		}
	}


		

