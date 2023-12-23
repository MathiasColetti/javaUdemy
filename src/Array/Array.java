package Array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDePessoas;


        System.out.println("Insira a quantidade de pessoas que quer ler de altura: ");
        numeroDePessoas = scanner.nextInt();
        double[] n = new double[numeroDePessoas];

        for (int i = 0; i < numeroDePessoas; i++) {
            System.out.println("Insira o nome da " + (i+1) + "ª pessoa");
            n[i] = scanner.nextDouble();

        }

        for (int i = 0; i < numeroDePessoas; i++) {
            System.out.println("A altura da " + (i+1) +"ª pessoa é: " + n[i]);
        }


    }

}
