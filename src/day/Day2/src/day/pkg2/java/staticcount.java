package day.pkg2.java;
public class staticcount {
  static int count=0;
   int id;  
   staticcount(){
       count++;
       id=count;
       System.out.println("Object ID:"+ id);
   }
    public static void main(String[] args) {
    
        staticcount c1 = new staticcount();
        staticcount c2 = new staticcount();
        staticcount c3 = new staticcount();
    
        System.out.println("Total Objects Created:"+count);
    }
    
}
