package week1.day1.assignments;

public class PrimeNumber {
	public static void main(String[] args) {
		int input = 13;
		boolean flag = false;

		for (int i = 2; i <= input / 2; i++) {
			int j = input % i;

			if (input % i == 0)
				flag = true;
			break;
		}

		if (!flag) {
			System.out.println(input + " is a prime number.");
		} else
			System.out.println(input + " not a prime number.");
	}
}