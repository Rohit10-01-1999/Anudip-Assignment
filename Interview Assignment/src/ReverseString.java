
import java .util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		
		String str="";
		
		System .out.println("Enter your String");
		str=sc.nextLine();
		
	 String reverse="";
		
		for (int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
			
		}
		System.out.print("Reverse String is"+"\t" +reverse);
	}

}
