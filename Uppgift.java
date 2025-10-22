import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Uppgift {
    public static void main(String[] args) {
        System.out.println("Skriva 10 nummer melan 1-20");
        Scanner scanner = new Scanner(System.in);
        
        int[] nummers = new int[10];

        for (int i=0; i<10; i++){
            System.out.println ("Skriv ett nummer ");
            nummers[i] = scanner.nextInt();
        }
        
        Random random = new Random();
        int[] randArray = new int[10];
        
        for (int i=0; i<10; i++) {
            randArray[i] = random.nextInt(20)+1;
            
        }

        boolean[] used = new boolean[10];
        int aciertos = 0;

        for (int i=0; i<10; i++) {
            int tuNumero = nummers[i];
             for (int j=0; j<10; j++) {
                 if (!used[j] && tuNumero == randArray[j]) {
                used[j] = true;
                System.out.println("Acierto: tu número " + tuNumero + " coincide con número aleatorio en posición " + j);
                aciertos++;
                break;
                }
             }
        
        }
    System.out.println("La lista de tus numeros es ");
    System.out.println(Arrays.toString(nummers));
    System.out.println(Arrays.toString(randArray));

    scanner.close();
    
    }



    


}


