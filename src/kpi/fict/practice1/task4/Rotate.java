package kpi.fict.practice1.task4;

class Rotate {

    private int[][] matrix;
    private int dimension;

    Rotate(int dimension) {
        this.dimension = dimension;
    }

    int[][] initialize(){
        matrix = new int[dimension][dimension];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 199 - 99);
            }
        }
        return matrix;
    }

    int[][] rotate(){

        int[][] result = new int[dimension][dimension];

        for (int i = dimension - 1, k = 0; i >= 0; i--, k++) {
            for (int j = 0; j < dimension; j++) {
                result[k][j] = matrix[j][i];
            }
        }

        return result;
    }
}
