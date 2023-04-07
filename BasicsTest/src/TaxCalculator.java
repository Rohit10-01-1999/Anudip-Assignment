
class CountryNotValidException extends Exception {
    public CountryNotValidException(String message) {
        super(message);
    }
}

class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String message) {
        super(message);
    }
}

class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String message) {
        super(message);
    }
}

class TaxCalculator {
    public static double calculateTax(String empName, boolean isIndian, double empSal) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
        if (!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
        }
        if (empName == null || empName.isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty");
        }
        double taxAmount = 0.0;
        if (empSal > 100000 && isIndian) {
            taxAmount = empSal * 8 / 100;
        } else if (empSal > 50000 && empSal <= 100000 && isIndian) {
            taxAmount = empSal * 6 / 100;
        } else if (empSal > 30000 && empSal <= 50000 && isIndian) {
            taxAmount = empSal * 5 / 100;
        } else if (empSal > 10000 && empSal <= 30000 && isIndian) {
            taxAmount = empSal * 4 / 100;
        } else {
            throw new TaxNotEligibleException("The employee does not need to pay tax");
        }
        return taxAmount;
    }



    }
