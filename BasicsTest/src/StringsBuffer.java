
public class StringsBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StringBuffer sb = new StringBuffer("This is StringBuffer ");
		  //System.out.println(sb);
		  
	//for add new String
		 sb.append("This is a Sample Programme");
		  System.out.println(sb);
		  
		 //insert the string object at 21th position
		  sb.insert(21, "object");
		  System.out.println(sb);
		  
	 //  For reverse the String
		  sb.reverse();
		  System.out.println(sb);
		  
		 // Replace the String Buffer to Builder
		  sb.replace(14, 20," Builder");
		  System.out.println(sb);
		  
	}

}
