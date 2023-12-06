package javatesting;

public class Dowhileloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// display alphabets alternatively
		int i = 0;
		do {
			System.out.println((char) (i + 65));
			i = i + 2;
		} while (i <26);
	}
}
