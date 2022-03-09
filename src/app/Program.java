package app;

import entiti.Employee;
import entiti.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employee");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i <= n; i++){
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y / n)? ");
            char key = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.println("Hours: ");
            int hours = sc.nextInt();
            System.out.println("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if(key == 'y'){
                System.out.println("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(emp);
            }

            if(key == 'n'){
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }

        }

        sc.close();
    }
}
