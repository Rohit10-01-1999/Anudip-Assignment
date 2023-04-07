
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str=new String("Welcome to Java");
System.out.println(str);

//Returns the character at 5th position and display it
for (int i=0;i<str.length();i++);
System.out.println(str.charAt(5));

// Compare the Two String
String str1=new String("Welcome ");
if(str.compareTo(str1)==0){
	System.out.println("String are Equal");
}else {
	System.out.println("String are not Equal");
	
	//Concatenates “- Let us learn” to the above string and display it.
	
	// (str.concat(str1)
	 System.out.println(str.concat(str1));

	// Returns the position of the first occurrence of character ‘a’ and display it.
	
	
	int x=str.indexOf('a', 0);
	System.out.println(str);
}





	}

}
