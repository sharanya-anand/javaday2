package day.pkg2.java;
import java.util.Scanner;
public class countof1 {
    static void binary(int n){
        int c=0;
        while(n!=0){
            if((n&1)==1)
            {
                c++;
            }
            n=n>>1;           
        }
        System.out.println(c);   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();      
       //countof1 obj = new countof1();
       //obj.binary(n);
        binary(n);           
        }    
    }
    

