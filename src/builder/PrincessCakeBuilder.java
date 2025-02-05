package builder;

import cake.Cake;
import cake.ChocolateCake;
import cake.PrincessCake;

public class PrincessCakeBuilder implements Builder {
    private PrincessCake princessCake = new PrincessCake();

    @Override
    public Builder addCakeBottom(String cakeBottom) {
        princessCake.addCakeBottom(cakeBottom);
        System.out.println("added:" + princessCake.getCakeBottoms().getLast());
        return this;
    }

    @Override
    public Builder addVanillaCream(String vanillaCream) {
        princessCake.addVanillaCream(vanillaCream);
        System.out.println("added:" + princessCake.getVanillaCreams().getLast());
        return this;
    }

    @Override
    public Cake build() {
        Cake producedPrincessCake = princessCake;
        princessCake = new PrincessCake();
        return producedPrincessCake;
    }
}
