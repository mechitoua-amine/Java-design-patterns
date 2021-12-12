package design.mechitoua.patterns.creational.singleton;

public class SingletonWithCloning implements Cloneable {
    private static SingletonWithCloning instance = null;

    private SingletonWithCloning() {
    }

    public static SingletonWithCloning getInstance() {
        if (instance == null) {
            instance = new SingletonWithCloning();
        }
        return instance;
    }

    @Override
    protected SingletonWithCloning clone() throws CloneNotSupportedException {
        // return (SingletonWithCloning) super.clone();
        // prevent cloning from breaking the singleton
        throw new CloneNotSupportedException("You can not create clone of SingeltonWithCloning");
    }
}
