import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please type a number");

		int a = scanner.nextInt();

		for (int number = 1; number <= a; number++) {
			if (number % 3 != 0)
				if (number % 7 != 0)

					System.out.println("Number is: " + number);

		}

		scanner.close();
	}
}