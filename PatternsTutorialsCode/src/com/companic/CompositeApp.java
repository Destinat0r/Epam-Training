package com.companic;

import java.util.ArrayList;
import java.util.List;

public class CompositeApp {

    public static void main(String[] args) {
        Shape square1 = new Square1();
        Shape square2 = new Square1();
        Shape square3 = new Square1();

        Shape triangle1 = new Triangle1();
        Shape triangle2 = new Triangle1();
        Shape triangle3 = new Triangle1();

        Shape circle1 = new Circle1();
        Shape circle2 = new Circle1();
        Shape circle3 = new Circle1();

        Composite composite1 = new Composite();
        Composite composite2 = new Composite();
        Composite composite3 = new Composite();

        composite1.addComponent(square1);
        composite1.addComponent(square2);
        composite1.addComponent(square3);

        composite1.addComponent(triangle1);
        composite1.addComponent(triangle2);
        composite1.addComponent(triangle3);

        composite2.addComponent(circle1);
        composite2.addComponent(circle2);
        composite2.addComponent(circle3);

        composite3.addComponent(composite1);
        composite3.addComponent(composite2);

        composite3.draw();
    }
}

class Composite implements Shape {

    private List<Shape> components = new ArrayList<>();

    void addComponent(Shape component) {
        components.add(component);
    }

    void removeComponent(Shape component) {
        components.remove(component);
    }

    @Override public void draw() {
        components.forEach(Shape::draw);
    }
}

interface Shape {
    void draw();
}

class Square1 implements Shape {

    @Override public void draw() {
        System.out.println("drawing square");
    }
}

class Triangle1 implements Shape {

    @Override public void draw() {
        System.out.println("drawing triangle");
    }
}

class Circle1 implements Shape {

    @Override public void draw() {
        System.out.println("drawing Circle");
    }
}
