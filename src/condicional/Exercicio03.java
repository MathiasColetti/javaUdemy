package condicional;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        float num1, num2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o numero:");
        num1 = scanner.nextFloat();
        System.out.println("Insira o seu possivel multiplo: ");
        num2 = scanner.nextFloat();

        if (num2%num1 == 0){
            System.out.println("É multiplo");
        }else {
            System.out.println("Não é multiplo!");
        }

    }
}
