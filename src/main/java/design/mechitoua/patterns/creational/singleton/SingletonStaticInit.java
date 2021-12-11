package design.mechitoua.patterns.creational.singleton;

// Implementing Singleton patterin using static initialization (static block)
public class SingletonStaticInit {
    private static SingletonStaticInit instance = new SingletonStaticInit();

    private SingletonStaticInit() {
    }

    static {
        try {
            if (instance == null)
                instance = new SingletonStaticInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SingletonStaticInit getInstance() {
        return instance;
    }
}
