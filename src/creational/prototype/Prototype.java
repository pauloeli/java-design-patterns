package creational.prototype;

public abstract class Prototype<T> implements Cloneable {

    public T copy() {
        try {
            return (T) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

}