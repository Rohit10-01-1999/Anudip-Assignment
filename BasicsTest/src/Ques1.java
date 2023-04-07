import java .util.Scanner;
public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int number[]= {25,36,52,74,56};
		
		int smallest=number[0];
		int largest=number[0];
		
		for(int i=1;i<number.length;i++) {
		if(number[i]>largest) 
			largest=number[i];
			else if(number[i]<smallest) 
				smallest=number[i];
		}
		System.out.println("largest number is: " +largest );
		System.out.println("smallest number is: " +smallest );
		
		}
	}


