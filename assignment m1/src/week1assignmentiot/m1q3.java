/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week1assignmentiot;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class m1q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        
        int grade=n/10; 
        switch(grade){
            case 10:
            case 9:    
                System.out.println("A");
                break;
            case 8:
            case 7:
                System.out.println("B");
                break;
            case 6:
            case 5:
                System.out.println("C");
                break;
            case 4:
            case 3:    
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                
        }
        
    }
    
}
