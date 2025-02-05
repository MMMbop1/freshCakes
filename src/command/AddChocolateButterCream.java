package command;

import cake.ChocolateCake;

public class AddChocolateButterCream implements Command {

    private ChocolateCake chocolateCake;

    public AddChocolateButterCream(ChocolateCake chocolateCake) {
        this.chocolateCake = chocolateCake;
    }

    @Override
    public void process() {
        chocolateCake.addChocolateButtercream("ChoclateButterCream");
        System.out.println("added:" + chocolateCake.getChocolateButtercream());
    }
}
