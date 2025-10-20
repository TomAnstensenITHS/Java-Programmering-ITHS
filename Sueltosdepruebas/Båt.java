package Sueltosdepruebas;

public class Båt extends Vattenfordon {

    protected String gpsPosition = "Initial Location";

    public Vattenfordon(double weight, double price) {
        super(weight, price);
    }

    public void go() {
       
        System.out.println("Water vehicle moving. GPS position changing randomly...");
       
    }
}

    

