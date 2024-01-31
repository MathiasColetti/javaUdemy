package Enum.exercicios.exericio01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome do departamento");
        String nomeDoDepartamento = sc.nextLine();
        System.out.println("Insira os dados do trabalhador");
        System.out.println("Insira o nome: ");
        String nome = sc.nextLine();
        System.out.println("Level:");
        String workerLevel = sc.nextLine();
        System.out.println("Base Salary");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(nome, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(nomeDoDepartamento));

        System.out.println("How Many contraccts to this worker: ");
        int numberOfContracts = sc.nextInt();
        for (int i = 0; i < numberOfContracts; i++) {
            System.out.println("Enter contract #" + (i + 1) + " data: ");
            System.out.print("DATE (DD/MM/YYYY): ");
            Date date = sdf.parse(sc.next());
            System.out.print("Value per Hour");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            worker.addContract(new HourContract(date, valuePerHour, hours));
        }

        System.out.println("Enter month and year to calculate income (MM/YYYY)");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 1)); //Substring, serve para recortar a String passando um conjunto
        int year = Integer.parseInt(monthAndYear.substring(3, 6));

        System.out.print("Name = " + worker.getName());
        System.out.print("Department = " + worker.getDepartment().getName());
        System.out.println("Income for: " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));


        sc.close();
    }
}
