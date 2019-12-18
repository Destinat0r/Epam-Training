package com.companic;

public class FacadeApp {

    public static void main(String[] args) {
        Computer computer = new Computer(new Power(), new DVDRom(), new HDD());
        computer.copy();
    }
}

class Computer {
    Power power;
    DVDRom dvd;
    HDD hdd;

    public Computer(Power power, DVDRom dvd, HDD hdd) {
        this.power = power;
        this.dvd = dvd;
        this.hdd = hdd;
    }

    void copy() {
        power.on();
        dvd.load();
        hdd.copyFromDVD(dvd);
    }
}

class Power {
    void on() {
        System.out.println("Power is On");
    }

    void off() {
        System.out.println("Power is Off");
    }

}

class DVDRom {
    private boolean isData;

    public boolean isData() {
        return isData;
    }

    void load() {
        isData = true;
    }

    void unload() {
        isData = false;
    }

}

class HDD {
    void copyFromDVD(DVDRom dvd) {
        if (dvd.isData()) {
            System.out.println("Copying from disk");
        } else {
            System.out.println("Insert disk");
        }
    }
}