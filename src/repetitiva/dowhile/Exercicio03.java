package repetitiva.dowhile;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int tipo, qtalcool = 0, qtgasolina = 0, qtDiesel = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Tipo de Combustivel");
            System.out.println("###################");
            System.out.println("1-Alcool");
            System.out.println("2-Gasolina");
            System.out.println("3-Diesel");
            System.out.println("4-fim");
            System.out.println();
            System.out.println("Insira o seu combustivel: ");
            tipo = scanner.nextInt();

            switch (tipo) {
                case 1:
                    qtalcool += 1;
                    break;
                case 2:
                    qtgasolina+=1;
                    break;
                case 3:
                    qtDiesel+=1;
                    break;
                default:
                    break;
            }
        } while (tipo != 4);
        System.out.println("Muito Obrigado!");
        System.out.println("Alcool =" + qtalcool);
        System.out.println("Gasolina =" + qtgasolina);
        System.out.println("Diesel =" + qtDiesel);
    }
}
