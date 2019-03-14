package kpi.fict.practice1.task2;

class Main {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        Computing computer = new Computing();
        computer.findPerfectNumbers(8500); //33_550_336

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Time: " + elapsedTime);
    }
}
