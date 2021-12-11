package design.mechitoua.patterns.creational.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2= Singleton.getInstance();

        // same hashcode -> same instance
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
