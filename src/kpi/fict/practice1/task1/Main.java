package kpi.fict.practice1.task1;

class Main {
     public static void main(String[] args) {
        Transformation transformation = new Transformation();
        System.out.println(transformation.transformIntoBase2System(159) + " "
                + transformation.transformIntoBase8System(61) + " "
                + transformation.transformIntoBase16System(61));

    }
}
