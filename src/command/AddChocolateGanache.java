package command;

import cake.Cake;

public class AddChocolateGanache implements Command {

    @Override
    public void process(Cake cake) {
        cake.addChocolateGanache("ChocolateGanache");
        System.out.println("added:" + cake.getChocolateGanache());
    }
}
