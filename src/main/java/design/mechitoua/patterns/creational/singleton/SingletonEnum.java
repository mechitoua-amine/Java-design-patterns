package design.mechitoua.patterns.creational.singleton;

// creating a Singleton pattern using enum implementaion (Eager initialization)
public class SingletonEnum {
    public static void main(String[] args) {
        EnumSingleton singleton1 = EnumSingleton.GETINSTANCE;
        EnumSingleton singleton2 = EnumSingleton.GETINSTANCE;

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

        String welcome = singleton1.welcome();
        System.out.println(welcome);
    }
}
