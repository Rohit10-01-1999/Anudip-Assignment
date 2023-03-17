
public class BankOverriding {
	
		int getRateOfInterest()
		{
			return 0;
			}  
		}  
		
		class SBI extends BankOverriding{
			
		int getRateOfInterest(){
			return 15;
			}  
		}  
		  
		class ICICI extends BankOverriding
		{  
		int getRateOfInterest()
		{
			return 12;
		}  
	}  
		class AXIS extends BankOverriding{  
			
		int getRateOfInterest(){
			
			return 9;
			
		}  
	}  
	
