package design.mechitoua.patterns.creational.singleton;
// implementing Singleton pattern using lazy initialization

// not thread safe

public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (instance == null)
            instance = new SingletonLazy();

        return instance;
    }
}
