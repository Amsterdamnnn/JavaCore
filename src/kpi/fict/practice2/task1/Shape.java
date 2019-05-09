package kpi.fict.practice2.task1;

abstract class Shape implements Drawable, Comparable<Shape> {

    private String shapeColor;

    Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    String getShapeColor() {
        return shapeColor;
    }

    abstract double calcArea();

    @Override
    public int compareTo(Shape o) {
        return this.shapeColor.compareTo(o.shapeColor);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
