package command;

import cake.Cake;

public class AddIcingSugar implements Command {

    @Override
    public void process(Cake cake) {
        cake.addIcingSugar("Icing Sugar");
        System.out.println("added:" + cake.getIcingSugar());
    }
}
