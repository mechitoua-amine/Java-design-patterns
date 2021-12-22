package design.mechitoua.patterns.structural.bridge.impl;

import design.mechitoua.patterns.structural.bridge.Color;

public class Red implements Color {
    @Override
    public String fill() {
        return "red";
    }
}
