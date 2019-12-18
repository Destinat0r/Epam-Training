package com.companic;

public class CommandApp {

    public static void main(String[] args) {
        Comp comp = new Comp();
        User user = new User(new StartCommand(comp), new StopCommand(comp), new ResetCommand(comp));

        user.startComp();
        user.resetComp();
        user.stopComp();
    }
}

interface Command {
    void execute();
}

//receiver
class Comp {
    void start() {
        System.out.println("Start");
    }

    void stop() {
        System.out.println("Stop");
    }

    void reset() {
        System.out.println("Reset");
    }
}

//Invoker
class User {
    Command start;
    Command stop;
    Command reset;

    public User(Command start, Command stop, Command reset) {
        this.start = start;
        this.stop = stop;
        this.reset = reset;
    }

    void startComp() {
        start.execute();
    }

    void stopComp() {
        stop.execute();
    }

    void resetComp() {
        reset.execute();
    }

}

abstract class CommandImpl implements Command {
    private Comp comp;

    public CommandImpl(Comp comp) {
        this.comp = comp;
    }

    public Comp getComp() {
        return comp;
    }
}

//concreteCommand
class StartCommand extends CommandImpl {

    public StartCommand(Comp comp) {
        super(comp);
    }

    @Override public void execute() {
        getComp().start();
    }
}

//concreteCommand
class StopCommand extends CommandImpl {

    public StopCommand(Comp comp) {
        super(comp);
    }

    @Override public void execute() {
        getComp().stop();
    }
}

//concreteCommand
class ResetCommand extends CommandImpl {

    public ResetCommand(Comp comp) {
        super(comp);
    }

    @Override public void execute() {
        getComp().reset();
    }
}



