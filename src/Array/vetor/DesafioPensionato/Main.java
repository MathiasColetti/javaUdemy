package Array.vetor.DesafioPensionato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quarto[] quartos = new Quarto[9];
        Scanner scanner = new Scanner(System.in);
        int numeroDeEstudantes;

        System.out.println("Insira quantos estudantes entrarão: ");
        numeroDeEstudantes = scanner.nextInt();

        for (int i = 0; i < numeroDeEstudantes; i++) {
            scanner.nextLine();
            System.out.println("Insira o nome do estudante");
            String nome = scanner.nextLine();
            System.out.println("Insira o email do estudante");
            String email = scanner.next();
            System.out.println("Insira o numero do quarto");
            int numeroQuarto = scanner.nextInt();
            Estudante estudante = new Estudante(nome, email);
            quartos[i] = new Quarto(numeroQuarto, estudante);
        }
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(quartos[i].toString());
            }
        }

    }
}
