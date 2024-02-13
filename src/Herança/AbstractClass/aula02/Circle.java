package Herança.AbstractClass.aula02;

public class Circle extends Shape{
    Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public Double area() {
        return 2*Math.PI * Math.sqrt(this.radius) ;
    }
}
