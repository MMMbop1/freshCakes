package command;

import cake.Cake;

public class AddHardWhippedCreamOnCake implements Command {

    @Override
    public void process(Cake cake) {
        cake.addHardWhippedCream("hardWhippedCream");
        System.out.println("added:" + cake.getHardWhippedCream());
    }
}
