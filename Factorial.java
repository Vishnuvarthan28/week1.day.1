package week1.Day1;

public class Factorial {

	public static void main(String[] args) {
		int range = 5;
		int fact = 1;
		for (int i=1; i<=5; i++) {
			fact= fact*i;
		}
		System.out.println("Factorial value is " + fact);
	}

}
