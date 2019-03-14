package kpi.fict.practice1.task4;

class Main {
    public static void main(String[] args) {
        Rotate rotator = new Rotate(4);
        Representation.show(rotator.initialize());
        Representation.show(rotator.rotate());
    }
}
