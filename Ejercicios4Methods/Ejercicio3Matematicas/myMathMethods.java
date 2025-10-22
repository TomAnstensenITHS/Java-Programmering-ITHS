package Ejercicios4Methods.Ejercicio3Matematicas;

import java.util.Scanner;

public class myMathMethods {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número entero: ");
    int numeroUsuario = sc.nextInt();

    myMathMethods math =new myMathMethods();
    int resultado = math.calculateFactorial(numeroUsuario);

    System.out.print(resultado);

    }

    public int calculateFactorial (int nummer){
        int summa= 0;
        for (int i =nummer; i>0; i--){
            summa=summa + i;
            
        }

        return summa;

    }

    

}
