package Sueltosdepruebas;

java.util.Random;

public class Vattenfordon extends Fordon{
    protected double longitud;
    protected double latitud; 

       public void go() {
        // Mover aleatoriamente
        double deltaLat = (random.nextDouble() - 0.5) * 0.01;
        double deltaLon = (random.nextDouble() - 0.5) * 0.01;

        latitud += deltaLat;
        longitud += deltaLon;

        System.out.printf("El barco se ha movido a nueva posición: (%.5f, %.5f)%n", latitud, longitud);
    }
}
    

