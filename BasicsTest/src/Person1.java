 interface Person1 {
    void speak();
}

 // Sir Student name already ek class bna rakhi h iss liye student ki jagah pe 
 //kisi or name se inherit kr rha hu
class Collage implements Person1 {
    public void speak() {
        System.out.println("I am a Java Learner.");
    }
}

class Teacher implements Person1 {
    public void speak() {
        System.out.println("I am taking Training from Anudip Foundation .");
    }

  public static void main(String[] args) {
      
    }
}