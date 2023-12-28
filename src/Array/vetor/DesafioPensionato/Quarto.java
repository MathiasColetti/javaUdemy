package Array.vetor.DesafioPensionato;

public class Quarto {
    int numero;
    boolean ocupado;
    Estudante estudante = new Estudante();

    public Quarto(int numero, Estudante estudante) {
        this.numero = numero;
        this.ocupado = true;
        this.estudante = estudante;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "numero=" + numero +
                ", ocupado=" + ocupado +
                ", estudante=" + estudante +
                '}';
    }
}
