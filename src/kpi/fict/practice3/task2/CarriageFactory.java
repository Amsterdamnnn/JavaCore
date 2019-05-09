package kpi.fict.practice3.task2;
import static kpi.fict.practice3.task2.Util.*;
class CarriageFactory {

    static RailwayCarriage createCarriage(String carriage){

        switch (Carriages.valueOf(carriage)){
            case COUPE -> {
                System.out.println("Input capacity and luggage sockets' amount!");
                return new Coupe(getIntValue(),getIntValue());
            }
            case RESERVED_SEAT -> {
                System.out.println("Input capacity and luggage sockets amount!");
                return new ReservedSeat(getIntValue(), getIntValue());
            }
            default -> {
                return null;
            }
        }
    }
}
