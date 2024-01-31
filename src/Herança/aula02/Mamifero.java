package Herança.aula02;

public class Mamifero extends Animal{
    public Boolean mama;

    public Mamifero() {
    }

    public Mamifero(String nome, Double peso, Double altura, Boolean mama) {
        super(nome, peso, altura);
        this.mama = mama;
    }

    public Boolean getMama() {
        return mama;
    }

    public void setMama(Boolean mama) {
        this.mama = mama;
    }

    @Override
    public void fazSom() {
        super.fazSom();
        System.out.println("UUUUUUUUUUU");
    }
}
