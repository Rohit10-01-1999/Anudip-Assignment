import java.util.HashMap;


public class MapKeys {
	public static void main(String[] args) {
	    HashMap<Integer, String> languages = new HashMap<>();

	    HashMap<String, Integer> people = new HashMap<String, Integer>();

	    // Add keys and values (Name, Age)
	    people.put("John", 32);
	    people.put("Steve", 30);
	    people.put("Angie", 33);
	    people.put("Tiger", 23);
	    people.put("Lovely", 43);
	    people.put("Heetu", 33);
	      for (String i : people.keySet()) {
	      System.out.println("Name: " + i + " Age: " + people.get(i));
	
	  }
	}
}
