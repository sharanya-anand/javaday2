/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day.pkg2.java;
import java.util.Scanner;

public class strongno {

    int factorial(int d){
        int fact=1;
        for(int i=1;i<=d;i++){
            fact=fact*i;
        }
        return fact;
    }
    
  boolean isStrong(int n){
      int temp=n;
      int s=0;
      while(n!=0){
          int d=n%10;
          s=s+factorial(d);
          n=n/10;
      }
      if(s==temp){
          return true;
      }
      else{
          return false;
      }
             
  }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter the number:");
        int n=sc.nextInt();
      
        strongno obj=new strongno();
         
        if(obj.isStrong(n)){
            System.out.println("Strong Number");
        }
        else{
              System.out.println("not Strong Number");
        }
    }
    
    
}
