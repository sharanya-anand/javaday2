
package assignment1;


   
      class Parent {
    void show() {
        System.out.println("Parent method");
    }
}

class m3q4overriding extends Parent {
    void show() {
        System.out.println("Child method");
    }

    public static void main(String[] args) {
        Parent obj = new m3q4overriding();
        obj.show();
    }
}
   
    
