package by.epam.training;

//import java.util.*;

public class Lesson2_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//задание 36
		
		/*System.out.println("¬ведите четырехзначное число ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); */
        int a = 2465;
        int mult1 = 1; //четные
        int mult2 = 1; //нечетные
        
        for (int i = 1; i <= 4; i++) {
           
        	int d = a % 10;
            System.out.println("d=" + d);
            a = a / 10;
            System.out.println("a=" + a);
            System.out.println("d0=" + d % 2);
            
            if (d % 2 == 0) {
                mult1 = mult1 * d;
                System.out.println("d1=" + d % 2);
                System.out.println("mult1=" + mult1);
            } 
            
            if (d % 2 != 0) {
                mult2 = mult2 * d;
                System.out.println("d2=" + d % 2);
                System.out.println("mult2=" + mult2);
            }
        }
        double a4 = (double)mult1;
        double a5 = (double)mult2;
        
        if (a5 != 0) {
        double a3 = a4 / a5;
        System.out.println("частное произведений " + a3);
        }
        if (a5 == 0) {
        System.out.println("частное произведений не €вл€етс€ числом");
            }
        }

}
//не учитывает отсутствие нечетных или четных цифр