package POO.pessoa;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(18, "Mathias");
        pessoa1.fazerAniversario();

        System.out.println(pessoa1.toString());
    }
}
