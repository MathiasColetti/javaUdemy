package repetitiva.loopFor;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;

        System.out.println("Insira um numero: ");
        x = scanner.nextInt();

        for (int i = 0; i <= x; i++) {
            if (i % 2 != 0){
                System.out.println(i);
            }
        }

    }
}
