package week1.Day1;

public class Fibonacci {

	public static void main(String[] args) {
        int range = 8, firstNum = 0, secNum = 1, sum;
		System.out.println(firstNum);
		for (int i = 1; i < range; i++) {

			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(firstNum);
}
	}
}
