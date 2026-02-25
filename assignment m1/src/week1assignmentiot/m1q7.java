/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week1assignmentiot;
import java.util.Scanner;
public class m1q7 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
                for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print("*");
    }

        
                
        System.out.println();
    }
        
    }
    
}
