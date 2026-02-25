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
public class m1q2 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        if(a>b && a>c)
            System.out.println(a+" is larger");
        else if(b>a && b>c)
            System.out.println(b+" is larger");
        else
            System.out.println(c+" is larger");
    }
    
}
