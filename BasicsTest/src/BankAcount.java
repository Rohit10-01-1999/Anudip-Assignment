
abstract class BankAcount {
int AccountNum=525896;
	int balance=253000;
    abstract void deposit();
	abstract void withdraw();
}
class CheckAccount extends BankAcount {
	@Override
void deposit() {
	// TODO Auto-generated method stub
	int AccountNum=525896;
	int Balance=5236;
	System.out.println(5236+ " is Deposit ammount");
}

@Override
void withdraw() {
	// TODO Auto-generated method stub
	int AccountNum=525896;
	int Balance=87456;
	System.out.println(87456+ " is withdraw ammount");
}

}  

