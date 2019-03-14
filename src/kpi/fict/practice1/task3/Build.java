package kpi.fict.practice1.task3;

class Build {

    private int[][] matrix;

    void buildThePyramid(int base){

        matrix = new int[base][base * 2 - 1];

        for (int i = 0; i < base; i++) {
            matrix[i][base - 1] = i + 1;
        }

        for (int i = 1; i < base; i++) {

            for (int j = 0, k = i; j < i; j++, k--) {
                matrix[i][base - 1 + (j + 1)] = k;
                matrix[i][base - 1 - (j + 1)] = k;
            }
        }
    }

    void show(){
        for (int[] x : matrix) {
            for (int y : x) {
                if (y == 0)
                    System.out.print("  ");
                else
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
