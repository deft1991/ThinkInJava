package Generics.Holder;

/**
 * Created by deft on 11.10.2016.
 */
public class SimpleHolder {
    private Object obj;

    public static void main(String[] args) {
        SimpleHolder sh = new SimpleHolder();
        sh.setObj("Item");
        String s = (String) sh.getObj();
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}

class GenericHolder<T> {
    T obj;

    public static void main(String[] args) {
        GenericHolder<String> gh = new GenericHolder<>();
        gh.setObj("Item");
        // разница в том, что теперь компилятор сам приводит объект к нужному типу
        String s = gh.getObj();
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}