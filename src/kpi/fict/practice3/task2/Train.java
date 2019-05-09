package kpi.fict.practice3.task2;

import java.util.ArrayList;

class Train<T extends RailwayCarriage> {

    private ArrayList<T> train;
    private T[] train1;

    Train() {
        train = new ArrayList<>();
    }

    void addCarriage(T carriage){
        System.out.println("Carriage type:");
        for (Carriages c : Carriages.values()) {
            System.out.println(c);
        }
        train.add(carriage);
    }
}