package javatesting;

public class Assnt7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Display the below pattern using while loop
		// 1 3 5 7 9
		int i = 0;
		while (i <= 10) {
			int j = 1;
			while (j <= 5) {
				System.out.print(i + j + " ");
				i++;
				j++;
			}
			break;
		}

	}
}
