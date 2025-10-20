import java.util.Scanner;

public class LearningMethods {
   
    public static String name;
    public static int age;
    public static boolean indoorPerson = false;
    public static boolean outdoorPerson = false;
    public static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) {
        
        LearningMethods.welkomeMethod();
        LearningMethods.ageMethod();
        LearningMethods.inOchOutMethod();


    sc.close();
    }    
    
    public static void welkomeMethod(){
        
        System.out.println("Hello! I want to show you how to use methods!");
        System.out.println("First off, what is your name?");
        name = sc.nextLine();
        System.out.println("Nice to meet you " + name + "!");
    
    }


    public static void ageMethod(){
        System.out.println("What is your age?");
        age = sc.nextInt();
        System.out.println("That means you where born in " + (2025 - age) + "!");

    }

    public static void inOchOutMethod(){
        
        System.out.println("Are you an indoor or outdoor person?");
        sc.nextLine();
        String answer = sc.nextLine();

        if(answer.matches("indoor")|| answer.matches("Indoor")) {
            indoorPerson = true;
        }
        else if(answer.matches("outdoor") || answer.matches("Outdoor")){
            outdoorPerson = true;
        }
        else{
            System.out.println("That was an unexpected answer! O.o");
        }
        if(indoorPerson == true){
            System.out.println("Awesome! What is it that you do indoors?");
        }else if (outdoorPerson == true) {
            System.out.println("Wow cool! Thats unusual nowadays. What is it you like about the great outdoors?");
        }else{
            System.out.println("Lets start over!");
        }

        
    }


    
}
