package javatesting;

public class Dowhileloop4break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a program it should run 10 times 
		//and once it reaches 5th iteration the execution should stop
		for (int i=1; i<=10; i++) {
			System.out.println("inside the loop :"+i);
			if(i==5) {
				System.out.println("condition matched...");
				break;
				
			}	
			System.out.println("* * * * * * *");
		}
		
	}
	

}
