package design.mechitoua.patterns.structural.bridge.impl;

import design.mechitoua.patterns.structural.bridge.Color;
import design.mechitoua.patterns.structural.bridge.Shape;

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Rectangle filled with " + color.fill();
    }
}
