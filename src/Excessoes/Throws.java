package Excessoes;

import java.util.Scanner;

public class Throws {
    public static void main(String[] args) {
        System.out.println("Entre com um numero Decimal");
        try {
            double num = leNumero();
            System.out.println("Você digitou: " + num);
        } catch (Exception e) {
            System.out.println("Entrada invalida");
            e.printStackTrace();
        }
    }

    public static double leNumero() throws Exception {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        return num;
    }
}
