package command;

import cake.Cake;

public class AddMarzipanRose implements Command{

    @Override
    public void process(Cake cake) {
        cake.addMarzipanRose("marzipanRose");
        System.out.println("added:" + cake.getMarzipanRose());
    }
}
