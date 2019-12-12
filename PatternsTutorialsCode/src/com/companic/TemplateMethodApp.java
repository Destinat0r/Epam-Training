package com.companic;

public class TemplateMethodApp {
    public static void main(String[] args) {
        A a = new A();
        a.templateMethod();

        System.out.println();

        B b = new B();
        b.templateMethod();

    }
}

abstract class C {
    void templateMethod() {
        System.out.print(1);
        differ();
        System.out.print(3);
        differ2();
    }

    abstract void differ2();

    abstract void differ();
}

class A  extends C {

    @Override void differ2() {
        System.out.print(5);
    }

    @Override void differ() {
        System.out.print(2);
    }
}

class B extends C {

    @Override void differ2() {

    }

    @Override void differ() {
        System.out.print(4);
    }
}
