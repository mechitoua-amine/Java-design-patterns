package design.mechitoua.patterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

// implements Serializable Singleton pattern for distributed systems
public class SingletonSerializableClient {
    public static void main(String[] args) {
        SingletonSerializable singleton1 = SingletonSerializable.getInstance();
        SingletonSerializable singleton2 = SingletonSerializable.getInstance();

        try (ObjectOutput objectOutput = new ObjectOutputStream(
                new FileOutputStream("./src/main/resources/serialized"));) {

            objectOutput.writeObject(singleton1);
            objectOutput.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Serialization complete");
        }

        try (ObjectInput objectInput = new ObjectInputStream(
                new FileInputStream("./src/main/resources/serialized"));) {

            Object readObject = objectInput.readObject();
            singleton2 = (SingletonSerializable) readObject;

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Deserialization complete");
        }

        // check if singleton1 and singleton2 are the same
        // the hashcode of SingletonSerializable objects is the same, so the
        // Singleton pattern is working fine.
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
