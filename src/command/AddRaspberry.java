package command;

import cake.Cake;

public class AddRaspberry implements Command {

    @Override
    public void process(Cake cake) {
        cake.addRaspberry("raspberry");
        System.out.println("added:" + cake.getRaspberry());
    }
}
