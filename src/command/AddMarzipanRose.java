package command;

import cake.WhippedCreamCake;

public class AddMarzipanRose implements Command{

    private WhippedCreamCake whippedCreamCake;

    public AddMarzipanRose(WhippedCreamCake whippedCreamCake) {
        this.whippedCreamCake = whippedCreamCake;
    }

    @Override
    public void process() {
        whippedCreamCake.addMarzipanRose("marzipanRose");
        System.out.println("added:" + whippedCreamCake.getMarzipanRose());
    }
}
