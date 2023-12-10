package sequencial;

import java.util.Scanner;

public class raio {
    public static void main(String[] args) {
        double raio, comprimento;
        Scanner sc= new Scanner(System.in);

        System.out.println("Insira seu raio");
        raio = sc.nextDouble();

        comprimento = 2 * Math.PI * Math.pow(raio,2);

        System.out.println("A saida dos dados é: " + comprimento);
    }

}
