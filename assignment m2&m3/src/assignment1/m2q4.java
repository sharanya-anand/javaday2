package assignment1;
public class m2q4 {
    

    String name;
    int age;

    // Default Constructor
    m2q4() {
        name = "ram";
        age = 34;
    }

    // Parameterized Constructor
    m2q4(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {

        // Using Default Constructor
        m2q4 s1 = new m2q4();
        s1.display();

        // Using Parameterized Constructor
        m2q4 s2 = new m2q4("Sita", 20);
        s2.display();
    }
}
        
    
