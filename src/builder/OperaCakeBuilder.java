package builder;

import cakes.Cake;
import cakes.OperaCake;
import cakes.PrincessCake;

public class OperaCakeBuilder implements Builder {

    private Cake operaCake = new OperaCake();

    @Override
    public Builder addCakeBottom(String cakeBottom) {
        operaCake.addCakeBottom(cakeBottom);
        return this;
    }

    @Override
    public Builder addVanillaCream(String vanillaCream) {
        operaCake.addVanillaCream(vanillaCream);
        return this;
    }

    @Override
    public Builder addRaspberryJam(String raspberryJam) {
        operaCake.addRaspberryMousse(raspberryJam);
        return this;
    }

    @Override
    public Cake build() {
        Cake producedOperaCake = operaCake;
        operaCake = new OperaCake();
        return producedOperaCake;
    }
}
