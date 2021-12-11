package design.mechitoua.patterns.creational.singleton;

import java.io.Serializable;

public class SingletonSerializable implements Serializable {
    private static final long serialVersionUID = 1L;

    private static SingletonSerializable instance = new SingletonSerializable();

    private SingletonSerializable() {
    }

    public static SingletonSerializable getInstance() {
        if (instance == null) {
            instance = new SingletonSerializable();
        }
        return instance;
    }

    private Object readResolve() {
        return getInstance();
    }
}
