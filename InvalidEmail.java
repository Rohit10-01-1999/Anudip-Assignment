
public class InvalidEmail {
	 static boolean  InValid(String email) {
	      String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
	      return email.matches(regex);
	   }
	   public static void main(String[] args) {
	      String email = "rohit.kr.rohit99@gmail.com";
	      System.out.println("The E-mail ID is: " + email);
	      System.out.println("Is the above E-mail ID Invalid? " + InValid(email));
	   }
	}




