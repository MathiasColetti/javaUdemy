package Herança.AbstractClass.aula02;

public abstract class Shape {
    Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public Double area() {
        return null;
    }
}
