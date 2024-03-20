package Excessoes;

public class NaoInteiroException extends Exception{
    protected int num;
    protected int denom;

    public NaoInteiroException(int num, int denom) {
        this.num = num;
        this.denom = denom;
    }

    @Override
    public String toString() {
        return "Nao";

    }
}
