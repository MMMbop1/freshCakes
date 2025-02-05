package command;

import cake.OperaCake;

public class AddPinkMarzipanLod implements Command {

    private OperaCake operaCake;

    public AddPinkMarzipanLod(OperaCake operaCake) {
        this.operaCake = operaCake;
    }

    @Override
    public void process() {
        operaCake.addPinkMarzipanLod("pinkMarzipanLod");
        System.out.println("added:" + operaCake.getPinkMarzipanLod());
    }
}
