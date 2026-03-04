package assignment2;
public class m4q6 {
    static int count = 0;

    m4q6() {
        count++;
    }

    static void showCount() {
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
       m4q6 obj= new m4q6();
        obj.showCount();
    }
}
    
    

