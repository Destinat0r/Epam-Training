package com.companic;

public class DelegateApp {

    public static void main(String[] args) {
        Painter painter = new Painter();
        painter.setGraphics(new Triangle());
        painter.draw();
    }
}

interface Graphics {
    void draw();
}

class Triangle implements Graphics {

    @Override public void draw() {
        System.out.println("Triangle");
    }
}

class Square implements Graphics {

    @Override public void draw() {
        System.out.println("Square");
    }
}

class Circle implements Graphics {

    @Override public void draw() {
        System.out.println("Circle");
    }
}

class Painter {
    Graphics graphics;
    void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    void draw() {
        graphics.draw();
    }
}
