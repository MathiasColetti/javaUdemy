package repetitiva.dowhile;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senhacerta = 2002, entrada;

        System.out.println("Insira a senha:");
        entrada = scanner.nextInt();

        do {
            System.out.println("Errado");
            System.out.println("Insira a senha:");
            entrada = scanner.nextInt();
        } while (entrada != senhacerta);
        System.out.println("Senha Certa!");
    }
}
