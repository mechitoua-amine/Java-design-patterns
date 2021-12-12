package design.mechitoua.patterns.creational.singleton;

public class DestroySingletonWithCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        SingletonWithCloning singleton1 = SingletonWithCloning.getInstance();
        // SingletonWithCloning singleton2 = SingletonWithCloning.getInstance();
        // cloning the singleton1 object
        SingletonWithCloning singleton2 = singleton1.clone();

        // same hashcode fot both instances
        // when cloning is used, the hashcode is different
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
