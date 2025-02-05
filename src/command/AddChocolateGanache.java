package command;

import cake.ChocolateCake;

public class AddChocolateGanache implements Command {
    private ChocolateCake chocolateCake;

    public AddChocolateGanache(ChocolateCake chocolateCake) {
        this.chocolateCake = chocolateCake;
    }

    @Override
    public void process() {
        chocolateCake.addChocolateGanache("ChocolateGanache");
        System.out.println("added:" + chocolateCake.getChocolateGanache());
    }
}
