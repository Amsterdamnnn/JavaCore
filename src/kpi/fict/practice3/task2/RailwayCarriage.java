package kpi.fict.practice3.task2;

abstract class RailwayCarriage {

    private int capacity;
    private int unitsForLuggage;

    RailwayCarriage(int capacity, int unitsForLuggage) {
        this.capacity = capacity;
        this.unitsForLuggage = unitsForLuggage;
    }

    RailwayCarriage(int capacity) {
        this.capacity = capacity;
    }

    void setUnitsForLuggage(int unitsForLuggage) {
        this.unitsForLuggage = unitsForLuggage;
    }
}
