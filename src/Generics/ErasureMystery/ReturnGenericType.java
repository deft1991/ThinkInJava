package Generics.ErasureMystery;

/**
 * Created by deft on 11.10.2016.
 */
public class ReturnGenericType<T extends HasF> {
    private T obj;

    public ReturnGenericType(T x) {
        obj = x;
    }

    public T get() {
        return obj;
    }
}
