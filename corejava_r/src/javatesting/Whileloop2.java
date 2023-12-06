package javatesting;

public class Whileloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print the below pattern
		// * * *
		// * * *
		// * * *
		// * * *
		// * * *
		int i = 1;
		while (i <= 5) 
		{
			int j = 1;
			while ( j<= 3) 
			{
				System.out.print("* ");
				j++;

			}
			System.out.println("*");
			i++;
		}
	}
}
