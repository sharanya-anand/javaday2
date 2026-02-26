
package day.pkg2.java;

import java.util.Scanner;

public class automorphic {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();    
        int sq=n*n;
        int temp=n;
        while(temp>0){
            if(temp%10!=sq%10){
                System.out.println("Not automorphic");
                return;
            }
            temp/=10;
            sq/=10;
            
        }
        
          System.out.println("automorphic");
    }
    
}
