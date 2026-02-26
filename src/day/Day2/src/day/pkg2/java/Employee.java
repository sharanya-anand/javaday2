package day.pkg2.java;
public class Employee {
    int id;
    String name;
    double salary;
    
    Employee(int id,String name,double salary){
this.id=id;
this.name=name;
this.salary=salary;
    }
           void display(){
    System.out.println(id+" "+name+" "+salary);
}
    public static void main(String[] args) {
       Employee obj1=new Employee(03,"abc",5000);
        Employee obj2=new Employee(04,"def",7000);
        obj1.display();
        obj2.display();
    }
    
}
