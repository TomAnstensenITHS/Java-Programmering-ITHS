package Ejercicios3;

public class Superheroe {
    String name = "Batman";
    double height = 1.8;
    int age = 35;

    public Superheroe(String name, double height, int age) {
    this.name = name;
    this.height = height;
    this.age = age;
    
    }
    
    public void printDetails(){
        System.out.println("Name = " + name + " Height= " + height + " Age= " + age);

    }
}
