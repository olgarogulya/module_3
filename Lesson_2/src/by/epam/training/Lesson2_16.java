package by.epam.training;

public class Lesson2_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 4567;
		int mult = 1;
		int num;
		
		while (x > 0) {
		num = x % 10;
		System.out.println(num);
		mult = mult * num;
		x = x / 10;
		System.out.println(mult);
		}
		System.out.println(mult);
	}
}
