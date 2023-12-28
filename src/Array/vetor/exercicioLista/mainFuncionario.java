package Array.vetor.exercicioLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class mainFuncionario {
    public static void main(String[] args) {
        List<Funcionario> funcionarioList = new ArrayList<>();
        int numeroFuncionarios;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira quantos funcionarios você tem");
        numeroFuncionarios = scanner.nextInt();

        for (int i = 0; i < numeroFuncionarios; i++) {

            int id;
            String nome;
            double salario;

            do {
                System.out.println("Insira o id");
                id = scanner.nextInt();
            } while (hasId(funcionarioList, id));

            System.out.println("Insira o nome: ");
            nome = scanner.nextLine();
            scanner.nextLine();


            System.out.println("Insira o salario");
            salario = scanner.nextDouble();

            Funcionario funcionario = new Funcionario("nome", id, salario);

            funcionarioList.add(funcionario);
        }

        System.out.println("Insira o id do seu funcionario que vai receber um aumento: ");
        int idsalary = scanner.nextInt();
        Funcionario funcionariosalario = funcionarioList.stream().filter(x -> x.getIdade() == idsalary).findFirst().orElse(null);

        if (funcionariosalario == null) {
            System.out.println("Não existe");
        } else {
            System.out.println("Entre com a porcentagem");
            double porcentagem = scanner.nextDouble();
            funcionariosalario.aumentaSalario(porcentagem);
        }
        for (Funcionario funcionario : funcionarioList) {
            System.out.println(funcionario.toString());
        }
    }

    public static boolean hasId(List<Funcionario> funcionarioList, int id) {
        Funcionario funcionario = funcionarioList.stream().filter(x -> x.getIdade() == id).findFirst().orElse(null);
        return funcionario != null;
    }
}
