package Ejercicios3;

public class Student {
    
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age= age;
        this.grade= grade;

    }

    public void printDetails(){

        System.out.println("Nombre = "+ name + "Edad= " + age + "Grado= " + grade);
    }

}
