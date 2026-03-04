package assignment2;
public class m4q7 {
    protected void finalize() {
        System.out.println("Object destroyed");
    }
    public static void main(String[] args) {
        m4q7 obj1 = new m4q7();
        obj1 = null;
        System.gc();
        System.out.println("Garbage Collector Called");
    }
}
    

