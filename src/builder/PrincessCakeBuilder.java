package builder;

import cakes.Cake;
import cakes.PrincessCake;

public class PrincessCakeBuilder implements Builder {

    private PrincessCake princessCake = new PrincessCake();

    public PrincessCakeBuilder addCakeBottom(String cakeBottom) {
        princessCake.addCakeBottom(cakeBottom);
        return this;
    }

    public PrincessCakeBuilder addVanillaCream(String vanillaCream) {
        princessCake.addVanillaCream(vanillaCream);
        return this;
    }

    @Override
    public PrincessCake build() {
        PrincessCake producedPrincessCake = princessCake;
        princessCake = new PrincessCake();
        return producedPrincessCake;
    }
}
