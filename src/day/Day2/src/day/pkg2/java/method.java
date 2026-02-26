/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day.pkg2.java;

/**
 *
 * @author Sharanya A
 */
public class method {

int add(int a,int b){
    //System.out.println(a+b);  method 1
    return a+b;
    
}

    public static void main(String[] args) {
        // TODO code application logic here
        method obj = new method();
        int res=obj.add(45,8);
        System.out.println(res);
        
        // System.out.println(obj.add(45,8));  method2
    }
    
}
