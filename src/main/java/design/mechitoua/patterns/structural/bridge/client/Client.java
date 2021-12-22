package design.mechitoua.patterns.structural.bridge.client;

import design.mechitoua.patterns.structural.bridge.Shape;
import design.mechitoua.patterns.structural.bridge.impl.Blue;
import design.mechitoua.patterns.structural.bridge.impl.Rectangle;
import design.mechitoua.patterns.structural.bridge.impl.Red;
import design.mechitoua.patterns.structural.bridge.impl.Square;

public class Client {
    public static void main(String[] args) {
        Shape square = new Square(new Blue());
        String blueSquare = square.draw();
        System.out.println(blueSquare);

        System.out.println("============================");
        Rectangle rectangle = new Rectangle(new Red());
        String redRectangle = rectangle.draw();
        System.out.println(redRectangle);
    }
}
