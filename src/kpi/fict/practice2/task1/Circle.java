package kpi.fict.practice2.task1;

public class Circle extends Shape{

    private double radius;

    Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("O");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                ", color of the shape: " + this.getShapeColor() +
                '}';
    }
}
