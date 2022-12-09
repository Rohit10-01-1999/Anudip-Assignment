package projecttest;
		 public class Operation {
				void Calculator() {
					int a=10,b=30,result;
					char Operator='+';
					switch(Operator)
					{
					case '+':
						result=a+b;
						System.out.println("the sum is "+result);
						break;
					case '-':
						result=a-b;
						System.out.println("the Substraction is "+result);
						break;
					case '*':
					    result=a*b;
					    System.out.println("the multiply   is "+result);
					    break;
					case '/':
						result=a/b;
					    System.out.println("the devide   is "+result);
					    break;
					case '%':
						result=a%b;
					    System.out.println("the Reminder   is "+result);
					    break;
					default:
						System.out.println("inavlid input");
					}
					}
					
					public static void main(String []args)
					{
						Operation ob1=new Operation();
						ob1.Calculator();
					}
					    	
					}
			 
		 
				  


