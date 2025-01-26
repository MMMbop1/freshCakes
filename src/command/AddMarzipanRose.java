package command;

import cakes.Cake;

public class AddMarzipanRose implements Command{

    @Override
    public void process(Cake cake) {
        cake.addMarzipanRose("marzipanRose");
    }
}
