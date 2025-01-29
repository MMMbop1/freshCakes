package command;

import cake.Cake;

public class AddChocolateButterCream implements Command {

    @Override
    public void process(Cake cake) {
        cake.addChocolateButtercream("ChoclateButterCream");
        System.out.println("added:" + cake.getChocolateButtercream());
    }
}
