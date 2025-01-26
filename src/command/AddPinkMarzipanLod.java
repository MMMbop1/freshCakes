package command;

import cakes.Cake;

public class AddPinkMarzipanLod implements Command {


    @Override
    public void process(Cake cake) {
        cake.addPinkMarzipanLod("pinkMarzipanLod");
    }
}
