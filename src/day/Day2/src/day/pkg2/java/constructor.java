package day.pkg2.java;
public class constructor {
String name;
int age;

constructor(){
    System.out.println("default const");
}


constructor(String n,int a){
    this();
    this.name=name;
    this.age=age;
    
}

void display(){
    System.out.println(name+" "+age);
}
    public static void main(String[] args) {
        // TODO code application logic here
        
        constructor obj= new constructor("s",21);
        //obj.display();
        
        obj.name="aa";
        obj.age=18;
        
        System.out.println(obj.name+" "+obj.age);
        
        
    }
    
}
