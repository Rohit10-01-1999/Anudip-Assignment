
abstract class Vaccine {
 
 public void firstDose(String nationality, int age) {
     if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
         System.out.println("successfully");
         System.out.println("Amount- 250.");
     } else {
         System.out.println(" Not eligible for first dose.");
     }
 }
  public void secondDose(boolean isFirstDoseCompleted) {
     if (isFirstDoseCompleted) {
         System.out.println("Second dose  successfully.");
     } else {
         System.out.println(" complete your first dose .");
     }
 }
  public abstract void boosterDose();
}
class VaccinationSuccessful extends Vaccine {
 public void boosterDose() {
     System.out.println("Booster dose successfully.");
 }
}



