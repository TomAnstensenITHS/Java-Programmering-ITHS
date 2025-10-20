package Sueltosdepruebas;

public class Bil extends Landfordon  {
    protected int kmCounter = 0;

    public Landfordon(double weight, int price){

        super(weight,price);

    public void drive(int km){

        this. kmCounter += km;
    }
    
    }

}
