package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        float A, B, C, D, diferenca;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro numero:");
        A = sc.nextFloat();
        System.out.println("Insira o segundo numero: ");
        B = sc.nextFloat();
        System.out.println("Insira o terceiro numero: ");
        C = sc.nextFloat();
        System.out.println("Agora o quarto numero: ");
        D = sc.nextFloat();
        diferenca = (A * B - C * D);
        System.out.println("A diferença entre o produto é : " + diferenca);
    }
}
