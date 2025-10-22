package Sueltosdepruebas;

public class Motorcykel extends Landfordon {
    protected int kmCounter = 0;

    public Landfordon(double weight, int price){

        super(weight,price);

    public void drive(int km){

        this. kmCounter += km;
    }
    }
   
}