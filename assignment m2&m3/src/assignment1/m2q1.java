package assignment1;

import java.util.Scanner;

public class m2q1 {
      static int fact(int n) {
        if (n == 0 || n == 1) {   
            return 1;
        } else {                  
            return n * fact(n - 1);
        }
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int res = fact(num);        
        System.out.println("Factorial of " + num + " is: " + res);
    }
    
}
