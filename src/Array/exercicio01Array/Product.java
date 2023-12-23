package Array.exercicio01Array;

public class Product {
    double preco;
    String nome;

    public Product(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Product{" +
                "preco=" + preco +
                ", nome='" + nome + '\'' +
                '}';
    }
}
