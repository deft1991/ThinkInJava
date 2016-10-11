package Generics.ErasureMystery;

/**
 * Created by deft on 11.10.2016.
 */
public class Manipulator<T> {
    private T obj;

    public Manipulator(T x) {
        obj = x;
    }

    // не удается найти символическое имя:  метод f()
    public void manipulate() {
//        obj.f()
    }
}

class Manipulator2<T extends HasF> {
    private T obj;

    public Manipulator2(T obj) {
        this.obj = obj;
    }

    public void manipulate() {
        obj.f();
    }
}

class Manipulation {
    public static void main(String[] args) {
        HasF hf = new HasF();
        Manipulator<HasF> manipulator = new Manipulator<HasF>(hf);
        manipulator.manipulate();
        Manipulator2<HasF> manipualator2 = new Manipulator2<>(hf);
        manipualator2.manipulate();
    }
}
