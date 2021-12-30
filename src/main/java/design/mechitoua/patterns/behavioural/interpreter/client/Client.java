package design.mechitoua.patterns.behavioural.interpreter.client;

import design.mechitoua.patterns.behavioural.interpreter.engine.InterpreterClient;
import design.mechitoua.patterns.behavioural.interpreter.engine.InterpreterEngine;

public class Client {
    public static void main(String[] args) {
        InterpreterEngine interpreterEngine = new InterpreterEngine();
        InterpreterClient interpreterClient = new InterpreterClient(interpreterEngine);

        System.out.println(
                "Addition of Numbers: " +
                        interpreterClient.interpret("add 10 and 20"));

        System.out.println("----------------------------------");

        System.out.println(
                "Subtraction of Numbers: " +
                        interpreterClient.interpret("subtract 20 from 50"));
    }
}
