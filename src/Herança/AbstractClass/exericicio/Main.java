package Herança.AbstractClass.exericicio;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("Mathias",50000.00,2000.00);
        System.out.println(pessoaFisica.retornaImposto());
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Mathias",400000.00,25);
        System.out.println(pessoaJuridica.retornaImposto());

    }
}
