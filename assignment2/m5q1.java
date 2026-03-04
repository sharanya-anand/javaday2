package assignment2;
 import java.io.*;
public class m5q1 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: " + e);
        }
        try {
            FileReader fr = new FileReader("test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception: " + e);
        }
    }
}
    