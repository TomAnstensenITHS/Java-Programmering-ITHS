package Ejercicios3;

public class Car {
    
    String make;
    String model;
    int year;
    String color;

    public Car (String make, String model, int year, String color) {
        this.make= make;
        this.model = model;
        this.year = year;
        this.color= color;
        
    }

    public Car(){
        make ="Desconocido";
        model = "Desconocido";
        year= 0;
        color = "Desconocido"; 

    }

    public void printDetails(){

        System.out.println("Marca= " + make + "Modelo = " + model + "Año = " + year + "Color= "+ color);
    }
}
