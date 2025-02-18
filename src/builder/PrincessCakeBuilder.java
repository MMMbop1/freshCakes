package builder;

import cake.Cake;
import cake.PrincessCake;

public class PrincessCakeBuilder implements Builder {
    private PrincessCake princessCake = new PrincessCake();

    public PrincessCakeBuilder addCakeBottom(String cakeBottom) {
        princessCake.addCakeBottom(cakeBottom);
        System.out.println("added:" + princessCake.getCakeBottoms().getLast());
        return this;
    }

    public PrincessCakeBuilder addVanillaCream(String vanillaCream) {
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
