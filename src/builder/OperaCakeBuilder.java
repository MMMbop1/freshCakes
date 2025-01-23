package builder;

import cakes.Cake;
import cakes.OperaCake;

public class OperaCakeBuilder implements Builder {

    private OperaCake operaCake = new OperaCake();

    public OperaCakeBuilder addCakeBottom(String cakeBottom) {
        operaCake.addCakeBottom(cakeBottom);
        return this;
    }

    public OperaCakeBuilder addVanillaCream(String vanillaCream) {
        operaCake.addVanillaCream(vanillaCream);
        return this;
    }

    public OperaCakeBuilder addRaspberryJam(String raspberryJam) {
        operaCake.setRaspBerryJam(raspberryJam);
        return this;
    }

    @Override
    public OperaCake build() {
        return null;
    }
}
