
public class Exception4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			int a=10;//// Agar try m exception nhi h to dirct finaaly block excute hoga 
			           /// agar try m exception hoga to catch and finally dono excut honge
			int b=2;
			int result=a/b;
			System.out.println(result);
			}
		catch(Exception e) {
				System.out.println(e);
			}
		finally {
				System.out.println("Im in block");
			}
	}

}
