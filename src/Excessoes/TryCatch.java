package Excessoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

        //Esse Programa pode gerar algumas mensagens de erro dependendo da forma como for executado,
        //String[] vect = scanner.nextLine().split(" ");
        // int position = scanner.nextInt();//Se aqui colocar uma letra ele trás um erro de , e se o numero  que for colocado for maior que a quantidade de
        //Espaços o erro já é outro
        method2();


    }

    public static void method() {
        System.out.println("Metodo Start");
        Scanner scanner = new Scanner(System.in);
        try {

            String[] vect = scanner.nextLine().split(" ");
            int position = scanner.nextInt();
            System.out.println(vect[position]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição invalida");
            e.printStackTrace();
            scanner.next();
        } catch (InputMismatchException e) {
            System.out.println("Tipo de posição colocada não é um numero!");
            e.printStackTrace(); // Nada mais é do que um Tracert  da Excessão
        } finally {
            scanner.close();
            System.out.println("Metodo Fim");
            System.out.println("Fim do programa!");

        }


    }

    public static void method2() {
        System.out.println("Inicio metodo 2");
        method();
        System.out.println("Fim metodo 2");
    }
}
