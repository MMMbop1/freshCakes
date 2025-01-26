package command;

import cakes.Cake;

public class AddHardWhippedCreamOnCake implements Command {

    @Override
    public void process(Cake cake) {
        cake.addHardWhippedCream("hardWhippedCream");
    }
}
