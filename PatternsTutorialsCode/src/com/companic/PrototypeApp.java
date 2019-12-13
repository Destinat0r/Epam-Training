package com.companic;

public class PrototypeApp {

    public static void main(String[] args) {
        Android nikki = new Android(21, "Nikki");
        System.out.println(nikki);

        Android copy = nikki.copy();
        System.out.println(copy);

        AndroidFactory factory = new AndroidFactory(nikki);
        Android andy = factory.makeCopy();

        System.out.println(andy);

        factory.setPrototype(new Android(2, "R2D2"));
        Android r2d2 = factory.makeCopy();

        System.out.println(r2d2);
    }
}

interface Copyable {
    Object copy();
}

class Android implements Copyable {
    private int age;
    private String name;

    public Android(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override public Android copy() {
        return new Android(age, name);
    }

    @Override public String toString() {
        return "Android{" + "age=" + age + ", name='" + name + '\'' + '}';
    }
}

class AndroidFactory {
    Android android;

    public AndroidFactory(Android android) {
        setPrototype(android);
    }

    public void setPrototype(Android android) {
        this.android = android;
    }

    public Android makeCopy() {
        return android.copy();
    }
}