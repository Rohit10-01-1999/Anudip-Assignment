package Multithreading;

public class Mains {

	public static void main(String[] args) {

			// Objects of Threads
			Thread th1 = new Myfriend();
			Thread th2 = new Myfriend();
			Thread th3 = new Myfriend();
			
			// Starting Threads
			th1.start();
			th2.start();
			th3.start();

		}

}
