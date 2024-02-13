package Herança.aula02;

public class Animal {
    public String nome;
    public Double peso;
    public Double altura;

    public Animal() {

    }

    public Animal(String nome, Double peso, Double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void fazSom(){
        System.out.println("KKKKKKKKKK");
    }
}
