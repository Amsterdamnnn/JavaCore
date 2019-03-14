package kpi.fict.practice1.task2;

class Computing {

    void findPerfectNumbers(int number) {

        int[] array = new int[100];
        int buf = 0;
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0)
                    buf += j;
            }
            if (buf == i){
                array[counter++] = i;
            }
            buf = 0;
        }

        for (int x : array) {
            if (x != 0)
            System.out.println(x);
        }
    }
}
