package design.mechitoua.patterns.structural.bridge.impl;

import design.mechitoua.patterns.structural.bridge.Color;
import design.mechitoua.patterns.structural.bridge.Shape;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Square filled with " + color.fill();
    }
}
