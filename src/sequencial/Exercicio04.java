package sequencial;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        float horasTrabalhadas, valorHora, numeroFuncionario, salary;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira Seu numero: ");
        numeroFuncionario = scanner.nextFloat();
        System.out.println("Insira o valor de sua hora: ");
        valorHora = scanner.nextFloat();
        System.out.println("Insira as horas trabalhadas: ");
        horasTrabalhadas = scanner.nextFloat();

        salary = valorHora * horasTrabalhadas;

        System.out.printf("O valor do funcionario de numero: %.0f ee %.2f ",numeroFuncionario,salary);

    }
}
