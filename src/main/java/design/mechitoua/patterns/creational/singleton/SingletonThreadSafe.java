package design.mechitoua.patterns.creational.singleton;

// Singleton pattern with a thread safe implementation
public class SingletonThreadSafe {
    private static SingletonThreadSafe instance = null;

    private SingletonThreadSafe() {
    }

    public static SingletonThreadSafe getInstance() {
        if (instance == null) {
            synchronized (SingletonThreadSafe.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(1999);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new SingletonThreadSafe();
                }
            }
        }
        return instance;
    }
}
