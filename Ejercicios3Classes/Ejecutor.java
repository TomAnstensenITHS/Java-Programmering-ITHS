package Ejercicios3;

public class Ejecutor {
    public static void main(String[] args) {
        Container superBuenos = new Container();

        superBuenos.heroe1.printDetails();
        superBuenos.heroe2.printDetails();

        

        System.out.println("Despues de modificar heroe1: ");
        superBuenos.heroe1.printDetails();
        superBuenos.heroe2.printDetails();

        Superheroe heroe3 = new Superheroe("Wonder Woman", 1.730, 30);
        heroe3.printDetails();

        Superheroe heroe4 = superBuenos.heroe1;
        heroe4.printDetails();

        System.out.println(superBuenos.heroe1);
        System.out.println(superBuenos.heroe2);
        System.out.println(heroe3);
        System.err.println(heroe4);


        


        superBuenos.heroe1.printDetails();
        superBuenos.heroe2.printDetails();
        heroe3.printDetails();
        heroe4.printDetails();



    
    }
}
