package Multithreading;

public class Myfriend extends Thread {
	
	@Override
	public void run()
	{
		String[] frndArr = {"Amit","Golu","preet","Bhanu","Vanshraj","moli","Gauravit","Shani","Rajal","arya"};
		
		for (String n : frndArr) 
		{
		    System.out.println(n);
		}
	}
	
	  
}