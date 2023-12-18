package repetitiva.dowhile;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        int x, y;
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("Insira a coordenada de x");
            x = scanner.nextInt();
            System.out.println("Insira a coordenada de y:");
            y = scanner.nextInt();

            if (x >= 0 && y>=0){
                System.out.println("Primeiro");
            } else if (x <= 0 && y>=0) {
                System.out.println("Segundo");
            }else if (x <= 0 && y<= 0){
                System.out.println("Terceiro");
            }else if (x >= 0 && y <= 0){
                System.out.println("Quarto");
            }

        }while ((x != 0) && (y != 0));

        System.out.println("Fim programa");
    }
}
