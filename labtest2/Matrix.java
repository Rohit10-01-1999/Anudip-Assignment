package labtest2;

public class Matrix {
	public static void main(String...args) {
		int a[][]= {{10,20,30},{40,50,60},{60,70,80}};
		int b[][]= {{1,2,3,},{4,5,6},{7,8,9}};
		// creating another matrix to add two matrix
		int c[][]=new int[3][3];
		//adding and printing addition of matrix
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"");
			}
			System.out.println();
		}
		
	}

}
