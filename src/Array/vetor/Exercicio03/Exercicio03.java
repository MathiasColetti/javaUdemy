package Array.vetor.Exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Insira quantas pessoas serao digitadas");
        n = scanner.nextInt();
        Pessoa[] listaPessoas = new Pessoa[n];
        for (int i = 0; i < n; i++) {
            int idade;
            String nome;
            double altura;
            scanner.nextLine();
            System.out.println("Insira o nome da " + (i + 1) + "ª pessoa");
            nome = scanner.nextLine();
            System.out.println("Insira a altura da " + (i + 1) + "ª pessoa");
            altura = scanner.nextDouble();
            System.out.println("Insira a idade da " + (i + 1) + "ª pessoa");
            idade = scanner.nextInt();
            listaPessoas[i] = new Pessoa(idade, nome, altura);
        }
        System.out.println("Pessoas com menos de 16");
        for (int i = 0; i < n; i++) {
            if (listaPessoas[i].getIdade() < 16) {
                System.out.println(listaPessoas[i].getNome());
            }

        }


    }
}
