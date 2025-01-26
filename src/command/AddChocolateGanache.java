package command;

import cakes.Cake;

public class AddChocolateGanache implements Command {

    @Override
    public void process(Cake cake) {
        cake.addChocolateGanache("ChocolateGanache");
    }
}
