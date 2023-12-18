package repetitiva.loopFor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exericicio02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int x;

        System.out.println("Insira quantos numeros tem em seu Array");
        x = scanner.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.println("Insira seu numero: ");
            int numero = scanner.nextInt();
            list.add(numero);
        }
        for (Integer inteiro :
                list) {
            if (inteiro >= 10 && inteiro <= 20) {
                System.out.println(inteiro + " in ");
            } else {
                System.out.println(inteiro + " out");
            }
        }
    }
}
