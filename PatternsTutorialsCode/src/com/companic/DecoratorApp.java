package com.companic;

public class DecoratorApp {

    public static void main(String[] args) {
        PrintInterface printer = new QuotesDecorator(new RightBracketsDecorator(new LeftBracketsDecorator(new Printer("Awesome!"))));
        printer.print();
    }
}

interface PrintInterface {
    void print();
}

class Printer implements PrintInterface {

    private String value;

    public Printer(String value) {
        this.value = value;
    }

    @Override public void print() {
        System.out.print(value);
    }
}

abstract class Decorator implements PrintInterface {
    private PrintInterface component;

    Decorator(PrintInterface component) {
        this.component = component;
    }

    public void print() {
        this.component.print();
    };
}

class QuotesDecorator extends Decorator {

    public QuotesDecorator(PrintInterface component) {
        super(component);
    }

    @Override public void print() {
        System.out.print("\"");
        super.print();
        System.out.print("\"");
    }
}

class LeftBracketsDecorator extends Decorator {

    public LeftBracketsDecorator(PrintInterface component) {
        super(component);
    }

    @Override public void print() {
        System.out.print("[");
        super.print();
    }
}

class RightBracketsDecorator extends Decorator {

    public RightBracketsDecorator(PrintInterface component) {
        super(component);
    }

    @Override public void print() {
        super.print();
        System.out.print("]");
    }
}

