package kpi.fict.practice3.task2;

import java.util.Scanner;

class Util {

    private static Scanner scanner = new Scanner(System.in);

    static int getIntValue(){
        return scanner.nextInt();
    }

    static String getStringValue(){
        return scanner.next();
    }
}
