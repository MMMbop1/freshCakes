package command;

import cake.PrincessCake;

public class AddGreenMarzipanLod implements Command {

    private PrincessCake princessCake;

    public AddGreenMarzipanLod(PrincessCake princessCake) {
        this.princessCake = princessCake;
    }

    @Override
    public void process() {
        princessCake.addGreenMarzipanLod("greenMarzipanLod");
        System.out.println("added:" + princessCake.getGreenMarzipanLod());
    }
}
