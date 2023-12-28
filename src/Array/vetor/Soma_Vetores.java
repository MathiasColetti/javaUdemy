package Array.vetor;

import java.util.Scanner;

public class Soma_Vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Quantos valores cada vetor vai ter:");
        n = scanner.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Insira o " + i + " ºvalor do vetor A : ");
            vetorA[i] = scanner.nextInt();
            System.out.println("Insira o " + i + " ºvalor do vetor B : ");
            vetorB[i] = scanner.nextInt();
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(vetorC[i]);
        }
    }
}
