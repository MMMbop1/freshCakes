package command;

import cakes.Cake;

public class AddRaspberry implements Command {


    @Override
    public void process(Cake cake) {
        cake.addRaspberry("raspberry");
    }
}
