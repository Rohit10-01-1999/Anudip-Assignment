
public class String1 {
	   public static void main(String[]e)
	   {
	     String s=new String("Welcome to Java World ");
	    System.out.println(s);

	     char ch=s.charAt(5);
	     System.out.println(ch);

	      String s2=new String("Welcome");
	       boolean b=s.equalsIgnoreCase(s2);
	     System.out.println(b);    

	     String s3=new String("Let us Learn ");
	     String s4=s.concat(s3);
	     System.out.println(s4); 
	   
	     int x=s.indexOf('a');
	     System.out.println(x);

	     String s5=s.replace('a','e');
	     System.out.println(s5);
	     
	     System.out.println(s.substring(4, 10));

	    String str=s.toLowerCase();
	    System.out.println(str);


	    }
}
