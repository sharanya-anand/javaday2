package assignment2;
public class m5q4 {
    
    static void checkAge(int age) {
        if (age < 18)
            throw new ArithmeticException("Age less than 18");
        else
            System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        checkAge(16);
    }
}
   
