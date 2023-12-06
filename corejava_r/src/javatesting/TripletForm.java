package javatesting;

import java.util.Iterator;

public class TripletForm {
	public static void main(String[] args) {
		int i = 0;
		
		while (i < 10) {
//			for (int j = 1; j < 6; j++) {
//				System.out.print(i+j + " ");
//				i++;
//			}
			int j = 1;
			while(j < 6) {
				System.out.print(i+j + " ");
				i++;
				j++;
			}
			
			break;
		}
		
		
	}
}
