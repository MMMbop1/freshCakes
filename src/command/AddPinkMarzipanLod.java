package command;

import cake.Cake;

public class AddPinkMarzipanLod implements Command {

    @Override
    public void process(Cake cake) {
        cake.addPinkMarzipanLod("pinkMarzipanLod");
        System.out.println("added:" + cake.getPinkMarzipanLod());
    }
}
