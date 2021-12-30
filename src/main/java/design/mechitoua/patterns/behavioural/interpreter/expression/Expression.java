package design.mechitoua.patterns.behavioural.interpreter.expression;

import design.mechitoua.patterns.behavioural.interpreter.engine.InterpreterEngine;

public interface Expression {
    public abstract int interpret(InterpreterEngine interpreterEngine);
}
