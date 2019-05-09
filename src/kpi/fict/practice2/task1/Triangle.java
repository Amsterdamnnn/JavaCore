package kpi.fict.practice2.task1;

public class Triangle extends Shape{

    private double base;
    private double height;

    Triangle(String shapeColor, double base, double height) {
        super(shapeColor);
        this.base = base;
        this.height = height;
    }

    @Override
    double calcArea() {
        return 0.5 * base * height;
    }

    @Override
    public void draw() {
        System.out.println("/\\");
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base = " + base +
                ", height = " + height +
                ", color of the shape: " + this.getShapeColor() +
                '}';
    }
}
