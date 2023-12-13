package condicional;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        float horainicial, horafinal, duracao = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a hora inicial");
        horainicial = scanner.nextFloat();
        System.out.println("Insira a hora final");
        horafinal = scanner.nextFloat();


        if (horainicial > horafinal) {
            duracao = 24 - horainicial + horafinal;
        } else if (horainicial == horafinal) {
            duracao = 24;
        }else {
            duracao = horafinal - horainicial;
        }
        System.out.printf("O jogo durou %.0f horas", duracao);
    }
}
