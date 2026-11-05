package labsheet10.question06;

import java.util.ArrayList;

public class Question06ShapeArrayList {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Circle(7));
        shapes.add(new Circle(10));

        int number = 1;
        for (Shape shape : shapes) {
            System.out.println("Circle " + number + " area: " + shape.area());
            number++;
        }
    }
}
