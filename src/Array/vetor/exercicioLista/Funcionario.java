package Array.vetor.exercicioLista;

public class Funcionario {
    private String nome;
    private Integer id;
    private Double salario;

    public Funcionario(String nome, Integer idade, Double salario) {
        this.nome = nome;
        this.id = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return id;
    }

    public void setIdade(Integer idade) {
        this.id = idade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome='" + nome + '\'' + ", id=" + id + ", salario=" + salario + '}';
    }

    void aumentaSalario(double valor) {
        this.setSalario(this.getSalario() + this.getSalario() * valor / 100);
    }
}
