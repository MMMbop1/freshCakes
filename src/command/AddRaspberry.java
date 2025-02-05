package command;

import cake.ChocolateCake;

public class AddRaspberry implements Command {

    private ChocolateCake chocolateCake;

    public AddRaspberry(ChocolateCake chocolateCake) {
        this.chocolateCake = chocolateCake;
    }

    @Override
    public void process() {
        chocolateCake.addRaspberry("raspberry");
        System.out.println("added:" + chocolateCake.getRaspberry());
    }
}
