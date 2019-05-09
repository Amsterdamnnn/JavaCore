package kpi.fict.practice2.task1;

import java.util.Arrays;

class Model {

    private Shape[] array;

    private int capacity;

    int getCapacity() {
        return capacity;
    }

    void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    Shape[] getArray() {
        return array;
    }

    void createArray() {
        array = new Shape[capacity];
    }

    void addElementToArray(Shape shape){
        for (int i = 0; i < capacity; i++) {
            if (array[i] == null) {
                array[i] = shape;
                break;
            }
        }
    }

    double calcArea() {
        var sum = 0.0;
        for (Shape x : array) {
            sum += x.calcArea();
        }
        return sum;
    }

    double calcSpecificArea(String shape) {
        var sum = 0.0;
                switch (shape){
                    case "Rectangle" -> {
                        for (Shape x : array) {
                            if (x instanceof Rectangle)
                                sum += x.calcArea();
                        }
                }
                    case "Triangle" -> {
                        for (Shape x : array) {
                            if (x instanceof Triangle)
                                sum += x.calcArea();
                        }
                    }
                    case "Circle" -> {
                        for (Shape x : array) {
                            if (x instanceof Circle)
                                sum += x.calcArea();
                        }
                    }
        }
        return sum;
    }

    void sortByArea() {
        Arrays.sort(array, new AreaComparator());
    }

    void sortByColor(){
        Arrays.sort(array);
    }
}
