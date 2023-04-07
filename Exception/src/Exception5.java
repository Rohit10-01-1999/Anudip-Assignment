import java.util.Scanner;

public class Exception5 extends RuntimeException{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Age");
		
		int age= sc.nextInt();
		if(age<18) {
			System.out.println("Success");
		}else {
			System.out.println("Not Success");
		}
	}

}
