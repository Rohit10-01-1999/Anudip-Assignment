interface BankAccountByInterface {
	
	void deposit();
	void withdraw();
	
	class CheckAccount implements BankAccountByInterface{

		@Override
		public void deposit() {
			// TODO Auto-generated method stub
			System.out.println(20000 +" Deposit amount");         
	 	}

		@Override
		public void withdraw() {
			// TODO Auto-generated method stub
			System.out.println(10000 +" withdraw amount");  
		}
		
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckAccount Ac=new CheckAccount();
		Ac.deposit();
		Ac.withdraw();
		
	}

}
