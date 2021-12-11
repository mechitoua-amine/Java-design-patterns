package design.mechitoua.patterns.creational.singleton;

// Creating a Singleton pattern using Bill Pugh's implementation (Thread safe)
public class SingletonBillPugh {
    private SingletonBillPugh() {
    }

    private static class SingletonHelper {
        private static final SingletonBillPugh instance = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return SingletonHelper.instance;
    }
}
