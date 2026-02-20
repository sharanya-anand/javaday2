/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day.pkg2.java;

import java.util.Scanner;

/**
 *
 * @author Sharanya A
 */
public class neonno {
 boolean check(int n){
     int sq=n*n;
     int s=0;
        int temp=sq;
        while(temp!=0){
           // int d=sq%10;
            //s=s+d;
            //
            sq=sq/10;
            
            int d = temp % 10;
s = s + d;
temp = temp / 10;
        }
        if(s==n){
            return true;
            
        }
        else{
            return false;
        }
 }
 
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();    
       neonno obj=new neonno();
      if(obj.check(n)){
          System.out.println("Neon number");
            
        }
      else{
          System.out.println("Not neon number");
      }
       
    }
    
}




