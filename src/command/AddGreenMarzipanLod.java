package command;

import cake.Cake;

public class AddGreenMarzipanLod implements Command {

    @Override
    public void process(Cake cake) {
        cake.addGreenMarzipanLod("greenMarzipanLod");
        System.out.println("added:" + cake.getGreenMarzipanLod());
    }
}
