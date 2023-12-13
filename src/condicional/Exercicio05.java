package condicional;

import java.util.Scanner;


public class Exercicio05 {
    public static void main(String[] args) {
        int quantidade, codigo;
        float preco = 0,precoFinal = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("###############");
        System.out.println("Tabela de preços");
        System.out.println("###############");

        System.out.println("CODIGO-ITEM-PRECO");
        System.out.println("1-CACHORRO QUENTE-4,00");
        System.out.println("2-X SALADA- 4,50");
        System.out.println("3-X BACON-5,00");
        System.out.println("4-TORRADA SIMPLES-2,00");
        System.out.println("5-REFRIGERANTE-1,50");

        System.out.println("Escolha o item do menu: ");
        codigo = scanner.nextInt();

        switch (codigo) {
            case 1:
                preco += 4;

                break;
            case 2:
                preco+= 4.50;
                break;
            case 3:
                preco += 5.00;
                break;
            case 4:
                preco += 2.00;
                break;
            case 5:
                preco += 1.50;
            default:
                System.out.println("Não temos essa opção, boa sorte!");
        }
        System.out.println("Insira a Quantidade;");
        quantidade = scanner.nextInt();

        precoFinal += preco * quantidade;

        System.out.printf("Deu %.2f reais.", precoFinal);
    }
}
