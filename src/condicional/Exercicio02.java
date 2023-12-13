package condicional;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        float num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o numero: ");
        num = scanner.nextFloat();

        if (num%2 == 0){
            System.out.println("É par");
        }else {
            System.out.println("É impar");
        }
    }
}
