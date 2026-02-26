/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment1;

/**
 *
 * @author Sharanya A
 */
public class m3q4overloading {


        
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
         m3q4overloading obj = new  m3q4overloading();
        System.out.println(obj.add(2, 3));
        System.out.println(obj.add(2, 3, 4));
    }
}
    
    

