package kpi.fict.practice2.task1;

import java.util.Comparator;

class AreaComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape shape1, Shape shape2) {
        return (int) (shape1.calcArea() - shape2.calcArea());
    }
}
