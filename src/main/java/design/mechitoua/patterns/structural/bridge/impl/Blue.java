package design.mechitoua.patterns.structural.bridge.impl;

import design.mechitoua.patterns.structural.bridge.Color;

public class Blue implements Color {
    @Override
    public String fill() {
        return "blue";
    }
}
