package javatesting;

public class Dowhileloop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Display the Alphabets

		int i = 1;
		do {
			int val = (i + 65);
			char ch = (char) val;
			System.out.println(ch);
			i++;
		} while (i < 26);

	}
}
