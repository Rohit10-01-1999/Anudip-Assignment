import java.util.*;

public class Main {

	public static void main(String[] args) throws InterruptedException {
	try {
		Thread.sleep(10);
		
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
Runnable r=new Runnable1();
Thread t=new Thread(r);
t.start();
t.join();
Runnable r2=new Runnable2();
Thread t2=new Thread(r2);
t2.start();
t2.join();
	}

}
class Runnable1 implements Runnable{
	Scanner sc=new Scanner(System.in);
	public void run() {
		int n,avg=0;
		for(int i=0;i<10;i++) {
			n=sc.nextInt();
			avg+=n;
			}
		System.out.println("Average:"+(double)avg/10);
	}
}

class Runnable2 implements Runnable{
	public void run() {
		int arr[]={1,20,50,15,30};
        int arr2[]=new int[5];
        int square;
        for(int i=0;i<5;i++) {
        	square=arr[i]*arr[i];
        	
        }
        System.out.println("Square Value:-");
        for(int i=0;i<5;i++) {
        	System.out.println(arr2[i]+" ");
        }
	}
}