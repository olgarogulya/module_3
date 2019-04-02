package by.epam.training;

public class Lesson2_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//37_1
				int N = 44;
				int a1 = N % 2;
				//System.out.println("a1=" + a1);
				if (N < 100 && a1 == 0) {
					System.out.println("task 1 - true");
				}
				else{
					System.out.println("task 1 - false");
				}
		
		//37_2
				int num = 5678;
				int a2 = num % 10; // 4я цифра
				//System.out.println("a2=" + a2);
				int num2 = num / 10; 
				//System.out.println("num2=" + num2);
				int a3 = num2 % 10; //3я цифра
				//System.out.println("a3=" + a3);
				int num3 = num2 / 10;
				//System.out.println("num3=" + num3);
				int a4 = num3 % 10; //2я цифра
				//System.out.println("a4=" + a4);
				int num4 = num3 / 10;
				//System.out.println("num4=" + num4);
				int a5 = num4 % 10; //1я цифра
				//System.out.println("a5=" + a5);
				
				if ((a5+a4) == (a3+a2)) {
					System.out.println("task 2 - true");
				}
				else{
					System.out.println("task 2 - false");
				}
				
		//37_3
				int C = 124;
				int b3 = C % 10; // 3я цифра
				//System.out.println("b3=" + b3);
				int c1 = C / 10; 
				int b2 = c1 % 10; //2я цифра
				//System.out.println("b2=" + b2);
				int c2 = c1 / 10;
				int b1 = c2 % 10; //1я цифра
				//System.out.println("b1=" + b1);
				int b = b1 + b2 + b3;
				//System.out.println("b=" + b);
				
				if (b % 2 == 0) {
					System.out.println("task 3 - true");
				}
				else{
					System.out.println("task 3 - false");
				}
				
		//37_5
				int E = 124;
				int d3 = E % 10; // 3я цифра
				//System.out.println("d3=" + d3);
				int e1 = E / 10; 
				int d2 = e1 % 10; //2я цифра
				//System.out.println("d2=" + d2);
				int e2 = e1 / 10;
				int d1 = e2 % 10; //1я цифра
				//System.out.println("d1=" + d1);
				int d = d1 + d2 + d3;
				//System.out.println("d=" + d);
				
				if (Math.pow(E, 2) == Math.pow(d, 3)) {
					System.out.println("task 5 - true");
				}
				else{
					System.out.println("task 5 - false");
				}
				
				
			}
	}


