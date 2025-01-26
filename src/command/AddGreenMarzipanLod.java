package command;

import cakes.Cake;

public class AddGreenMarzipanLod implements Command {

    @Override
    public void process(Cake cake) {
        cake.addGreenMarzipanLod("greenMarzipanLod");
    }
}
