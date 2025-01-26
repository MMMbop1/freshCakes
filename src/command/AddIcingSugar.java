package command;

import cakes.Cake;

public class AddIcingSugar implements Command {

    @Override
    public void process(Cake cake) {
        cake.addIcingSugar("Icing Sugar");
    }
}
