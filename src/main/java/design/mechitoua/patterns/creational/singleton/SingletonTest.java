package design.mechitoua.patterns.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // same hashcode -> same instance
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

        // testing the thread safe Singleton
        ExecutorService executorService = null;
        ThreadExmp myThread = new ThreadExmp();

        try {
            // always return the same hashcode for the same instance every time
            // even if we increase the thread pool size
            executorService = Executors.newFixedThreadPool(1);
            executorService.execute(myThread);
            executorService.execute(myThread);
            executorService.execute(myThread);
            executorService.execute(myThread);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (executorService != null)
                executorService.shutdown();
        }
    }
}
