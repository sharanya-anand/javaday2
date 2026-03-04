package assignment2;

        final class FinalClass {
    final int x = 100;

    final void display() {
        System.out.println("Final Method Value: " + x);
    }
}

public class m4q5 {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
    }
}
        
   