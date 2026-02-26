package day.pkg2.java;
public class m2 {
void print(){
    System.out.println("Hello");
    return;
    //System.out.println("Hello");  it is unreachable
}
    public static void main(String[] args) {
      m2 obj = new m2();
      obj.print();
    }
    
}
