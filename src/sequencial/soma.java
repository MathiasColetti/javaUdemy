package sequencial;

import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        int num1, num2, soma;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro numero");
        num1 = sc.nextInt();
        System.out.println("Insira o segundo numero");
        num2 = sc.nextInt();

        soma = num2 + num1;
        System.out.println("A soma de " + num1 + "+" + num2 + "="+ soma);
    }
}
