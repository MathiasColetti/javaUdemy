package POO.Product;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int escolha, quantidade, qtInicial;
        double preco;
        Scanner scanner = new Scanner(System.in);
        String nomeProduto;

        System.out.println("Insira o nome do produto para controle: ");
        nomeProduto = scanner.nextLine();

        System.out.println("Insira o valor do produto: ");
        preco = scanner.nextDouble();

        System.out.println("Insira a quantidade inicial de seu produto");
        qtInicial = scanner.nextInt();
        Product product = new Product(nomeProduto, preco, qtInicial);


        do {
            product.fichaTecnica();
            System.out.println("Ações Permitidas");
            System.out.println("1-Adicionar Produto");
            System.out.println("2-Remover produto");
            System.out.println("0-Sair do Programa");
            System.out.println("Escolha sua opção");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Insira a quantidade que deseja adicionar.");
                    quantidade = scanner.nextInt();
                    product.addProducts(quantidade);
                    break;
                case 2:
                    System.out.println("Insira a quantidade que deseja remover: ");
                    quantidade = scanner.nextInt();
                    product.removeProducts(quantidade);
                default:
                    break;
            }

        } while (escolha != 0);
        scanner.close();
    }
}
