package command;

import cake.WhippedCreamCake;

public class AddIcingSugar implements Command {

    private WhippedCreamCake whippedCreamCake;

    public AddIcingSugar(WhippedCreamCake whippedCreamCake) {
        this.whippedCreamCake = whippedCreamCake;
    }

    @Override
    public void process() {
        whippedCreamCake.addIcingSugar("Icing Sugar");
        System.out.println("added:" + whippedCreamCake.getIcingSugar());
    }
}
