package design.mechitoua.patterns.creational.singleton;

public class ThreadExmp implements Runnable {
    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ": " + singleton.hashCode());
    }
}
