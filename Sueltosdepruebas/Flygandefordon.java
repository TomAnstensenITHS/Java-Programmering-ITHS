package Sueltosdepruebas;

public class Flygandefordon extends Fordon {
   protected double altitude = 0.0; 

    public AirVehicle(double weight, double price) {
        super(weight, price);
    }

    public void fly(boolean isFlying) {
       
        if (isFlying) {
           
            this.altitude += 100.0;
            System.out.println("Air vehicle ascending. Current altitude: " + this.altitude);
        } else {
           
            this.altitude = 0.0;
            System.out.println("Air vehicle landing. Altitude reset to 0.0.");
        }
    }
}


