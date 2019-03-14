package kpi.fict.practice1.task4;

class Representation {

    static void show(int [][] array){
        System.out.println();
        for (int[] x : array) {
            for (int y : x) {
                if (y < 10 && y >= 0)
                    System.out.print(" " + y + "  ");
                if (y > 9)
                    System.out.print(" " + y + " ");
                if (y > -10 && y < 0)
                    System.out.print(y + "  ");
                if (y < -10)
                    System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
