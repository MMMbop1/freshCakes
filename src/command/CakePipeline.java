package command;

import cakes.Cake;

import java.util.ArrayList;

public class CakePipeline {
    private ArrayList<Command> pipeLine = new ArrayList<>();

    public void addCommand(Command command) {
        pipeLine.add(command);
    }

    public void execute(Cake cake) {
        for (Command command : pipeLine) {
            command.process(cake);
        }
    }
}
