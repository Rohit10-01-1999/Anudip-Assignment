
public class Main1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(10);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		Runnable r=new Runnable3();
		Thread t=new Thread(r);
		t.start();
		t.join();
		Runnable r1=new Runnable4();
		Thread t1=new Thread(r1);
		t1.start();
		t1.join();
	}

}
class Runnable3 implements Runnable{
	public void run() {
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				System.out.println(i+" ");
			}
		}
	}
}
	class Runnable4 implements Runnable{
		public void run() {
			for(int i=0;i<=100;i++) {
				if(i%2==1) {
					System.out.println(i+" ");
				}
}
		}
	}
	

