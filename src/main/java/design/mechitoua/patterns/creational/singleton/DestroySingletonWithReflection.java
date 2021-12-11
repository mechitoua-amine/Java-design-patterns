package design.mechitoua.patterns.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DestroySingletonWithReflection {
    public static void main(String[] args)
            throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = null;

        Constructor<?>[] constructors = Singleton.class.getDeclaredConstructors();

        for (Constructor<?> ctr : constructors) {
            ctr.setAccessible(true);
            Object object = ctr.newInstance();
            singleton2 = (Singleton) object;
        }

        // different hashcode fot singleton1 and singleton2
        // we break the singleton pattern here using reflection
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
