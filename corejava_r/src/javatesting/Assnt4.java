package javatesting;

public class Assnt4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String gender= "female";
		int age= 10;
		
		if (gender.equals("male") && age>= 21) 
		{
			System.out.println("male Is Eligible For Marriage");

		}
		else if (gender.equals("female") && age>= 18) {
			System.out.print("Female Is Eligible For Marriage");
		}
		else
		{System.out.println("you didn't meet the age requirements");
		}
		
	}
}