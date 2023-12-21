package POO.aplication;

public class Triangulo {
    private int ladoA;
    private int ladoB;
    private int ladoC;
    private double area;

    public Triangulo(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.setArea(ladoA, ladoB, ladoC);
    }

    public double getArea() {
        return area;
    }

    public void setArea(int A, int B, int C) {
        double semiperimetro = (A + B + C) / 2.0;
        double area = Math.sqrt(semiperimetro * (semiperimetro - A) * (semiperimetro - B) * (semiperimetro - C));
        this.area = area;
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
        this.setArea(ladoA, ladoB, ladoC);
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
        this.setArea(ladoA, ladoB, ladoC);
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
        this.setArea(ladoA, ladoB, ladoC);
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "ladoA=" + ladoA +
                ", ladoB=" + ladoB +
                ", ladoC=" + ladoC +
                ", area=" + area +
                '}';
    }
}