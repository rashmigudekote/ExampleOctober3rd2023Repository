package javatesting;

public class Loop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Display the given number from 1 to 10 ,show only odd number
		for (int i=1; i<= 10; i++) {
			if ((i%2) != 0) {
				System.out.println("Odd numbers:" + i);
			}
		}
	}
}