import java.util.ArrayList;

public class PersonArrayList {
	 public static void main(String[] args)
	    {
	        // create an ArrayList which going to
	        // contains a list of Numbers
	        ArrayList<Integer> Numbers = new ArrayList<Integer>();
	  
	        // Add Number to list
	        Numbers.add(23);
	        Numbers.add(32);
	        Numbers.add(45);
	        Numbers.add(63);
	        Numbers.add(60);
	        Numbers.add(64);
	        Numbers.add(69);
	        Numbers.add(33);
	        Numbers.add(13);
	        Numbers.add(83);
	  
	        // forEach method of ArrayList and
	        // print numbers
	        Numbers.forEach((n) -> System.out.println(n));
	    }
}
