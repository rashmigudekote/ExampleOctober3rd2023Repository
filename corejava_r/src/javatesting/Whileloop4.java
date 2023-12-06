package javatesting;

public class Whileloop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Display the below pattern
		//1 2 3
		//4 5 6 
		//7 8 9
		int x=1;
		int i=1;
		while(i<=3) {
			int j=1;
			while(j<=3) {
				System.out.print(x+" ");
				j++;
				x++;
		}
			System.out.println(" ");
			i++;
	}

	}
}
