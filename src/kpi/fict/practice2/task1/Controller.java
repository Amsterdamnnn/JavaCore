package kpi.fict.practice2.task1;
import static kpi.fict.practice2.task1.Util.*;

class Controller {
    private Model model = new Model();
    private View view = new View();

    void execute(){
        model.setCapacity(inputIntValue());
        var capacity = model.getCapacity();
        model.createArray();
        for (var i = 0; i < capacity; i++) {
            view.printMessage(view.STRING3);
            view.printMessage(view.STRING9);
            switch (inputStringValue()){
                case "Rectangle" -> {
                    view.printMessage(view.STRING4);
                    model.addElementToArray(new Rectangle(inputStringValue(), inputDoubleValue()));
                }
                case "Triangle" -> {
                    view.printMessage(view.STRING5);
                    model.addElementToArray(new Triangle(inputStringValue(),inputDoubleValue(),inputDoubleValue()));
                }
                case  "Circle" -> {
                    view.printMessage(view.STRING6);
                    model.addElementToArray(new Circle(inputStringValue(),inputDoubleValue()));
                }
                default -> {
                    System.out.println("Wrong input! Try again");
                    --i;
                }
            }
        }
        view.drawAllShapes(model.getArray());
        view.printMessage(view.STRING7);
        label: while (true){
            switch (inputIntValue()){
                case 1 -> view.printResult(model.calcArea());
                case 2 -> {
                    view.printMessage(view.STRING9);
                    view.printResult(model.calcSpecificArea(inputStringValue()));
                }
                case 3 -> {
                    model.sortByArea();
                    view.drawAllShapes(model.getArray());
                }
                case 4 -> {
                    model.sortByColor();
                    view.drawAllShapes(model.getArray());
                }
                case 0 -> {
                    view.printMessage(view.STRING10);
                    break label;
                }
                default -> view.printMessage(view.STRING11);
            }
        }
    }
}
