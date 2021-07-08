package hidden;

// hidden class
// abstract class has no object
// it has hidden methods or non hidden method

abstract class A {

    abstract void a();

    abstract void b();

    abstract void c();

    void data() {
        System.out.println("I am not Hidden");
        System.out.println(getClass().toString());
    }
}

abstract class B extends A {

    @Override
    void a() {
        System.out.println("B " + getClass().toString());
    }
}

abstract class C extends B {

    @Override
    void a() {
        super.a();
        System.out.println("C " + getClass().toString());
    }

    @Override
    void b() {
        System.out.println(getClass().toString());
    }
}

public class AbstractedClass extends C {

    @Override
    void c() {
        System.out.println(getClass().toString());
    }

    public static void main(String[] args) {
        A a = new AbstractedClass();
        a.data();
        a.a();
        a.b();
        a.c();
    }
}
