package kpi.fict.practice2.task1;

class View implements IView{
    View() {
        printMessage(STRING1 + "\n" + STRING2);
    }

    void printMessage(String string){

        System.out.println(string);
    }

    void printResult(double value){
        System.out.println(value);
    }

    void drawAllShapes(Shape[] shapes){
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println(shape);
        }
    }
}
