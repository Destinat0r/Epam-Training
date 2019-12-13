package com.companic;

public class AbstractFactoryApp {
    public static void main(String[] args) {
        DeviceFactory factory = getFactoryByCodeName("RU");
        factory.getKeyboard().print();

        DeviceFactory factory1 = getFactoryByCodeName("EN");
        factory1.getMouse().doubleClick();
    }

    private static DeviceFactory getFactoryByCodeName(String lang) {
        switch (lang) {
        case "RU":
            return new RuDeviceFactory();
        case "EN":
            return new EnDeviceFactory();
        default:
            throw new RuntimeException("Unsupported country code: " + lang);
        }
    }
}

class EnDeviceFactory implements DeviceFactory {

    @Override public Mouse getMouse() {
        return new EnMouse();
    }

    @Override public Keyboard getKeyboard() {
        return new EnKeyboard();
    }

    @Override public Touchpad getTouchpad() {
        return new EnTouchpad();
    }
}

class RuDeviceFactory implements DeviceFactory {

    @Override public Mouse getMouse() {
        return new RuMouse();
    }

    @Override public Keyboard getKeyboard() {
        return new RuKeyboard();
    }

    @Override public Touchpad getTouchpad() {
        return new RuTouchpad();
    }
}

interface Mouse {
    void click();
    void doubleClick();
    void scroll();
}

interface Keyboard {
    void print();
    void println();
}

interface Touchpad {
    void track();
}

interface DeviceFactory {
    Mouse getMouse();
    Keyboard getKeyboard();
    Touchpad getTouchpad();
}

class EnMouse implements Mouse {

    @Override public void click() {
        System.out.println("Click");
    }

    @Override public void doubleClick() {
        System.out.println("Double Click");
    }

    @Override public void scroll() {
        System.out.println("Scrolling");
    }
}

class RuMouse implements Mouse {

    @Override public void click() {
        System.out.println("Клик");
    }

    @Override public void doubleClick() {
        System.out.println("Двойной Клик");
    }

    @Override public void scroll() {
        System.out.println("Скролл");
    }
}

class EnKeyboard implements Keyboard {

    @Override public void print() {
        System.out.println("print string");
    }

    @Override public void println() {
        System.out.println("print string with line break");
    }
}

class RuKeyboard implements Keyboard {

    @Override public void print() {
        System.out.println("Печать строки");
    }

    @Override public void println() {
        System.out.println("Печать с переводом строки");
    }
}

class EnTouchpad implements Touchpad {

    @Override public void track() {
        System.out.println("Tracking");
    }
}

class RuTouchpad implements Touchpad {

    @Override public void track() {
        System.out.println("Отслеживаем нажатие");
    }
}


