package Herança.AbstractClass.aula01;

public abstract class Animal {
    Double peso;
    String nome;



    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void fazSom(){
        System.out.println("ABUDABI");
    }
}
