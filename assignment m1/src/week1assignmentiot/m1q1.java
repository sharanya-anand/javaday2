/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week1assignmentiot;
import java.util.Scanner;
public class m1q1 {

 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if(n>0)
            System.out.println("Positive");
        else if(n<0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
    
}
