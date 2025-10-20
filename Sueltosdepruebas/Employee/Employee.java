package Sueltosdepruebas.Employee;


public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age){
        this.name= name;
        this.age= age;
    }

     public void displayDetails(){ 
        System.out.println("---Employeer registrated---");
        System.out.println("Name" + this.name);
        System.out.println("Age" + this.age);

    }
 

}
