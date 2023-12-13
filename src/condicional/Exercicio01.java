package condicional;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        float num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um numero: ");
        num = scanner.nextFloat();

        if (num >= 0){
            System.out.println("É não negativo");
        }else{
            System.out.println("Negativo");
        }
    }
}
