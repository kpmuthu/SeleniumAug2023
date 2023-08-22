package assessments.week1.day1;

import java.util.Scanner;

public class CheckNumberIsPositive {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter num");

		int num = in.nextInt();

		if (num > 0) {
			System.out.println("Given Number is Positive");
		} else if (num < 0) {
			System.out.println("Given Number is Negative");
		} else {
			System.out.println("Given Number is neither positive or negative");
		}
	}
}
