package kpi.fict.practice2.task1;

public class Rectangle extends Shape {

    private double side;

    Rectangle(String shapeColor, double side) {
        super(shapeColor);
        this.side = side;
    }
    

    @Override
    double calcArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("□");
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side = " + side +
                ", color of the shape: " + this.getShapeColor() +
                '}';
    }
}
