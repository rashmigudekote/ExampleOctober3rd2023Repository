package javatesting;

public class whileloop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Display the below pattern
		// * * * * * *
		// * * * * * *
		// * * * * * *
		int i = 1;
		while (i <= 3) 
		{
			int j = 1;

			while (j <= 6) {
				System.out.print("* ");
				j++;
			}
			System.out.println("*"); 
			   i++;
		}
	}
}
