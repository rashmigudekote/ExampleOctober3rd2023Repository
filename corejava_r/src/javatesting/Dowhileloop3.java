package javatesting;

public class Dowhileloop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Display the below pattern
		// * * * *
		// * * * *
		// * * * *
		// * * * *
		int i = 1;
		do {
			int j = 1;

			do {
				System.out.print("* ");
				j++;
			} while (j <= 4);
			System.out.println("*");
			i++;

		} while (i <= 4);
	}
}