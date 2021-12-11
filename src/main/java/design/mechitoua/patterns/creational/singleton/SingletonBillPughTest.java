package design.mechitoua.patterns.creational.singleton;

public class SingletonBillPughTest {
    public static void main(String[] args) {
        SingletonBillPugh singletonBillPugh1 = SingletonBillPugh.getInstance();
        SingletonBillPugh singletonBillPugh2 = SingletonBillPugh.getInstance();

        System.out.println(singletonBillPugh1.hashCode());
        System.out.println(singletonBillPugh2.hashCode());
    }
}
