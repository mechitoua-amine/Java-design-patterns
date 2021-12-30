package design.mechitoua.patterns.behavioural.interpreter.engine;

import design.mechitoua.patterns.behavioural.interpreter.expression.AdditionExpression;
import design.mechitoua.patterns.behavioural.interpreter.expression.Expression;
import design.mechitoua.patterns.behavioural.interpreter.expression.SubtractionExpression;

public class InterpreterClient {
    private InterpreterEngine interpreterEngine;

    public InterpreterClient(InterpreterEngine interpreterEngine) {
        this.interpreterEngine = interpreterEngine;
    }

    public int interpret(String inputData) {
        Expression expression = null;

        if (inputData.contains("add")) {
            expression = new AdditionExpression(inputData);
        } else if (inputData.contains("subtract")) {
            expression = new SubtractionExpression(inputData);
        } else {
            throw new IllegalArgumentException(
                    inputData + "Is not a valid Expression");
        }

        int result = expression.interpret(interpreterEngine);
        System.out.println(inputData);

        return result;
    }
}
