package command;

import cake.WhippedCreamCake;

public class AddHardWhippedCreamOnCake implements Command {
    private WhippedCreamCake whippedCreamCake;

    public AddHardWhippedCreamOnCake(WhippedCreamCake whippedCreamCake) {
        this.whippedCreamCake = whippedCreamCake;
    }

    @Override
    public void process() {
        whippedCreamCake.addHardWhippedCream("hardWhippedCream");
        System.out.println("added:" + whippedCreamCake.getHardWhippedCream());
    }
}
