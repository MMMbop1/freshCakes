package builder;

import cake.Cake;
import cake.OperaCake;

public class OperaCakeBuilder implements Builder {

    private Cake operaCake = new OperaCake();

    @Override
    public Builder addCakeBottom(String cakeBottom) {
        operaCake.addCakeBottom(cakeBottom);
        System.out.println("added:" + operaCake.getCakeBottoms().getLast());
        return this;
    }

    @Override
    public Builder addVanillaCream(String vanillaCream) {
        operaCake.addVanillaCream(vanillaCream);
        System.out.println("added:" + operaCake.getVanillaCreams().getLast());
        return this;
    }

    @Override
    public Builder addRaspberryJam(String raspberryJam) {
        operaCake.addRaspberryMousse(raspberryJam);
        System.out.println("added:" + operaCake.getRaspBerryJam());
        return this;
    }

    @Override
    public Cake build() {
        Cake producedOperaCake = operaCake;
        operaCake = new OperaCake();
        return producedOperaCake;
    }
}
