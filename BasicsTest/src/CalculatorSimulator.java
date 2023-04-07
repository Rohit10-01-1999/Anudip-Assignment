
public class CalculatorSimulator {
	
	    public static void main(String[] args) {
	        try {
	            double taxAmount = TaxCalculator.calculateTax("Lovely", true, 220000.0);
	            System.out.println("Tax amount is " + taxAmount);
	        } catch (CountryNotValidException e) {
	            System.out.println("Country not valid: " + e.getMessage());
	            e.printStackTrace();
	        } catch (EmployeeNameInvalidException e) {
	            System.out.println("Employee name not valid: " + e.getMessage());
	            e.printStackTrace();
	        } catch (TaxNotEligibleException e) {
	            System.out.println("Not eligible for Tax calculation: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }
}
