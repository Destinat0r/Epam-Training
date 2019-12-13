package com.companic;

import java.util.Date;

public class FactoryMethodApp {

    public static void main(String[] args) {
        WatchMaker maker = getMakerByName("Roman");
        Watch watch = maker.createWatch();
        watch.showTime();
    }

    public static WatchMaker getMakerByName(String maker) {
        if (maker.equals("Digital")) {
            return new DigitalWatchMaker();
        } else if (maker.equals("Roman")) {
            return new RomanWatchMaker();
        }
        throw new RuntimeException("Maker is not supported " + maker);
    }
}

interface Watch {
    void showTime();
}

class DigitalWatch implements Watch {

    @Override public void showTime() {
        System.out.println(new Date());
    }
}

class RomanWatch implements Watch {

    @Override public void showTime() {
        System.out.println("VII-XX");
    }
}

interface WatchMaker {
    Watch createWatch();
}

class DigitalWatchMaker implements WatchMaker {

    @Override public Watch createWatch() {
        return new DigitalWatch();
    }
}

class RomanWatchMaker implements WatchMaker {

    @Override public Watch createWatch() {
        return new RomanWatch();
    }
}
