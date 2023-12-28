package Array.vetor;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, soma = 0;
        float media = 0;



        System.out.println("Quantos numeros vai inserir:");
        n = scanner.nextInt();
        int[] vetor = new int[n];
        if (n > 10) {
            System.out.println("Não foi possivel fazer o programa numero maior que 10");
        } else {
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Insira o " + i + " numero");
                vetor[i] = scanner.nextInt();
                soma += vetor[i];
                media = (media + vetor[i])/2;
            }
            for (int i = 0; i < vetor.length; i++) {
                System.out.println(vetor[i]);
            }
            System.out.println(soma);
            System.out.println(media);

        }
    }
}
