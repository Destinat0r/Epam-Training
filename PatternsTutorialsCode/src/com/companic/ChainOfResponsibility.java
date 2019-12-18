package com.companic;

import java.util.Objects;

public class ChainOfResponsibility {

    public static void main(String[] args) {
        Logger logger0 = new SMSLogger(Level.ERROR);
        Logger logger1 = new FileLogger(Level.DEBUG);
        Logger logger2 = new EmailLogger(Level.INFO);

        logger0.setNext(logger1);
        logger1.setNext(logger2);

        logger0.writeMessage("All good", Level.INFO);
        logger0.writeMessage("Debug", Level.DEBUG);
        logger0.writeMessage("System down", Level.ERROR);
    }
}

class Level {

    public static final int ERROR = 1;
    public static final int DEBUG = 2;
    public static final int INFO = 3;
}

interface Logger {

    void writeMessage(String message, int level);

    void setNext(Logger next);
}

abstract class AbstractLogger implements Logger {

    int priority;
    Logger next;

    public AbstractLogger(int priority) {
        this.priority = priority;
    }

    public void setNext(Logger next) {
        this.next = Objects.requireNonNull(next, "next logger should not be null");
    }

    @Override public void writeMessage(String message, int level) {
        if (level <= priority) {
            write(message);
        }
        if (Objects.nonNull(next)) {
            next.writeMessage(message, level);
        }
    }

    abstract void write(String message);
}

class SMSLogger extends AbstractLogger {

    public SMSLogger(int priority) {
        super(priority);
    }

    @Override void write(String message) {
        System.out.println("SMS: " + message);
    }
}

class FileLogger extends AbstractLogger {

    public FileLogger(int priority) {
        super(priority);
    }

    @Override void write(String message) {
        System.out.println("File: " + message);
    }
}

class EmailLogger extends AbstractLogger {

    public EmailLogger(int priority) {
        super(priority);
    }

    @Override void write(String message) {
        System.out.println("SMS: " + message);
    }
}
