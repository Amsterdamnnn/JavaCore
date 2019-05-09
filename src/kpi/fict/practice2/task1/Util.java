package kpi.fict.practice2.task1;

import java.util.Scanner;

class Util {

    private static Scanner scanner = new Scanner(System.in);

    static int inputIntValue(){
        return scanner.nextInt();
    }

    static String inputStringValue(){
        return scanner.next();
    }

    static double inputDoubleValue(){
        return scanner.nextDouble();
    }
}
