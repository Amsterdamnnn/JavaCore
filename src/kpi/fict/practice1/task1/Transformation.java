package kpi.fict.practice1.task1;

import java.util.Arrays;

class Transformation {

    private final int BASE_2_SYSTEM = 2;
    private final int BASE_8_SYSTEM = 8;
    private final int BASE_16_SYSTEM = 16;

    int transformIntoBase2System(int number){

        int[] bits = new int[32];
        int result = 0b0;
        int label = 31;
        int buf = label;
        if (number == 0)
            for (int x : bits) {
                System.out.print(x);
            }
        else{
            do {
                bits[label--] = number % BASE_2_SYSTEM;
                number /= BASE_2_SYSTEM;
            } while (number != 0);

            for (int x : bits) {
                result += x * (int)Math.pow(BASE_2_SYSTEM, buf--);
                System.out.print(x);
            }
            System.out.println();
        }

        return result;
    }

    int transformIntoBase8System(int number) {

        int[] bits = new int[11];
        int result = 000;
        int label = 10;
        int buf = label;
        if (number == 0)
            for (int x : bits) {
                System.out.print(x);
            }
        else {
            do {
                bits[label--] = number % BASE_8_SYSTEM;
                number /= BASE_8_SYSTEM;
            } while (number != 0);

            for (int x : bits) {
                result += x * (int) Math.pow(BASE_8_SYSTEM, buf--);
                System.out.print(x);
            }
            System.out.println();
        }
        return result;
    }

        int transformIntoBase16System(int number){

        String[] bits = new String[8];
            Arrays.fill(bits, "0");
        int result = 0x0;
        int label = 7;
        int buf = label;
        if (number == 0)
            for (String x : bits) {
                System.out.print(x);
            }
        else{
            do {
                if (number % BASE_16_SYSTEM < 10)
                bits[label--] = "" + number % BASE_16_SYSTEM;
                else
                    switch (number % BASE_16_SYSTEM){
                        case 10:
                            bits[label--] = "A";
                            break;
                        case 11:
                            bits[label--] = "B";
                            break;
                        case 12:
                            bits[label--] = "C";
                            break;
                        case 13:
                            bits[label--] = "D";
                            break;
                        case 14:
                            bits[label--] = "E";
                            break;
                        case 15:
                            bits[label--] = "F";
                            break;
                    }
                number /= BASE_16_SYSTEM;
            } while (number != 0);

            for (String x : bits) {
                System.out.print(x);
                switch (x){
                    case "A":
                        x = "10";
                        break;
                    case "B":
                        x = "11";
                        break;
                    case "C":
                        x = "12";
                        break;
                    case "D":
                        x = "13";
                        break;
                    case "E":
                        x = "14";
                        break;
                    case "F":
                        x = "15";
                        break;
                }
                result += Integer.parseInt(x) * (int)Math.pow(BASE_16_SYSTEM, buf--);
            }
            System.out.println();
        }
        return result;

    }
}
