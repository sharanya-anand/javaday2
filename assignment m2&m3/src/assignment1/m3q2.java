package assignment1;

        class Animal {
    void eat() {
        System.out.println("Animal class");
    }
}

class m3q2 extends Animal {
    void bark() {
        System.out.println("Dog");
    }

    public static void main(String[] args) {
        m3q2 d = new m3q2();
        d.eat();   // inherited method
        d.bark();
    }
}
        
        
    
    

