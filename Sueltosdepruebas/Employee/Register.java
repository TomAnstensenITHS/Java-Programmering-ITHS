package Sueltosdepruebas.Employee;

import java.util.Scanner;

public class Register {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter de employee´s name:");
        String employeeName = scanner.nextLine();
        System.out.println("Please enter the employee´s age:");
        int employeeAge = scanner.nextInt();
        Employee newEmployee = new Employee(employeeName, employeeAge);

        newEmployee.displayDetails();

        scanner.close();
        
    }
} 



