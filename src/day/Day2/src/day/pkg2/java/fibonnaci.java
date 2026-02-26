package day.pkg2.java;
import java.util.Scanner;
public class fibonnaci {

public static void f(int n){
    int a=0;
    int b=1;
    for(int i=1;i<=n;i++){
        System.out.print(a+" ");
        int c=a+b;
        a=b;
        b=c;
}
}
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
       f(n);
      //fibonnaci ob = new fibonnaci();
      //ob.f(n);
        
    }
    
}
