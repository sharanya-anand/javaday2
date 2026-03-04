package assignment2;
public class m5q2 {

    public static void main(String[] args) {
     
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("this is Finally block ");
        }
    }
}
    