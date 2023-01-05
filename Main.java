package Multithreading;

public class Main extends Thread {
	
   public static void main(String[] args)
	     {
	          try
	          {
	               Fibonacci fib = new Fibonacci();
	               fib.start();
	               fib.sleep(1000);
	               Reverse rev = new Reverse();
	               rev.start();
	          }
	          catch (Exception ex)
	          {
	               ex.printStackTrace();
	          }
	     }
	}

