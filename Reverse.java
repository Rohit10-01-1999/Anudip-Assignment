package Multithreading;

public class Reverse extends Thread{
	   public void run()
	     {
	          try
	          {
	          //     System.out.println("");
	               System.out.println("\nReverse is: ");
	           //    System.out.println("Printno");
	               for (int i=10; i >= 1 ;i-- )
	               {
	                    System.out.print(i+"  ");
	               }
	            //   System.out.println("Print the Reverse no.");
	          }
	          catch (Exception ex)
	          {
	               ex.printStackTrace();
	          }
	     }
	}

