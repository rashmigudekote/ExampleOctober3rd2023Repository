package javatesting;

public class Dowhileloop5continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a program it should run 10 times and once it reaches 5th iteration 
		//skip the 5 the and continue with the remaining iteration   
		for (int i=1; i<=10; i++)
		{
			System.out.println("inside the loop"+i);
			if(i==5) {
				System.out.println("condition matched...");
				continue;
			}
			System.out.println("* * * * * * * ");
		}
		
	}

}
