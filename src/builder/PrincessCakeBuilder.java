package builder;

import cakes.Cake;
import cakes.PrincessCake;

public class PrincessCakeBuilder implements Builder {

    private Cake princessCake = new PrincessCake();

    @Override
    public Builder addCakeBottom(String cakeBottom) {
        princessCake.addCakeBottom(cakeBottom);
        return this;
    }

    @Override
    public Builder addVanillaCream(String vanillaCream) {
        princessCake.addVanillaCream(vanillaCream);
        return this;
    }

    @Override
    public Cake build() {
        Cake producedPrincessCake = princessCake;
        princessCake = new PrincessCake();
        return producedPrincessCake;
    }
}
