package assessments.week3.day2;

public class FindInterSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 3, 2, 11, 4, 6, 7 };
		int[] b = { 1, 2, 8, 4, 9, 7 };

		int length = a.length;

		int length2 = b.length;

		for (int i = 0; i <= length - 1; i++) {
			for (int j = 0; j <= length2 - 1; j++) {
				if (a[i] == b[i]) {
					System.out.println(a[i]);

				}
				break;
			}

		}
	}

}
