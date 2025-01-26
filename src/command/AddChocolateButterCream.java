package command;

import cakes.Cake;

public class AddChocolateButterCream implements Command {

    @Override
    public void process(Cake cake) {
        cake.addChocolateButtercream("ChoclateButterCream");
    }
}
