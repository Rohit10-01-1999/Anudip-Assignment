
public class MaximumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] a= {25,54,28,41};
		
		
		int max = a[0];
		for (int i=0;i<a.length;i++) {
			if (max<a[i]) {
				max=max=a[i];
			}
			
		}
		System.out.println("Maximum element is   "+ max);
	}

}
