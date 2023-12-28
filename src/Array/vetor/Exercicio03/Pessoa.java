package Array.vetor.Exercicio03;

public class Pessoa {

    int idade;
    String nome;
    double altura;

    public Pessoa(int idade, String nome, double altura) {
        this.idade = idade;
        this.nome = nome;
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
