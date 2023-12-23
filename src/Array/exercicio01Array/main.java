package Array.exercicio01Array;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int numeroProdutos;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira quantos produtos deseja colocar: ");
        numeroProdutos = scanner.nextInt();
        Product[] listProduct = new Product[numeroProdutos];

        for (int i = 0; i < listProduct.length; i++) {

            System.out.println("Insira o nome do " + (i + 1) + "º produto: ");
            String nome = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Insira o preco do " + (i + 1) + "º produto: ");
            double preco = scanner.nextDouble();
            listProduct[i] = new Product(preco, nome);
        }
        double soma =0;
        for (int i = 0; i < listProduct.length; i++) {
            System.out.println(listProduct[i].toString());
            soma += listProduct[i].getPreco();
        }
        System.out.println("Soma: " + soma);
    }
}
