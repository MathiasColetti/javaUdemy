package Array.vetor;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Integer m, n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o a quantidade de linhas: ");
        m = scanner.nextInt();
        System.out.println("Insira a quantidade de colunas: ");
        n = scanner.nextInt();

        Integer[][] matriz = new Integer[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Insira o numero da linha: " + (i + 1) + " da coluna" + (j + 1));
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Insira um possivel digito da matriz: ");
        int possivelNumero = scanner.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == possivelNumero) {
                    if (i > 0) {
                        System.out.println(matriz[i - 1][j]);
                    }
                    if (j > 0) {
                        System.out.println(matriz[i][j - 1]);
                    }
                    if (j < matriz[i].length){
                        System.out.println(matriz[i][j + 1]);
                    }
                    if (i < matriz[j].length){
                        System.out.println(matriz[i + 1][j]);
                    }
                    System.out.printf("\n");
                }

            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
