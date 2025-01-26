package cakes;

public abstract class WhippedCreamCake extends Cake {

    @Override
    public void addCakeBottom(String cakeBottom) {
        super.cakeBottoms.add(cakeBottom);
    }

    @Override
    public void addVanillaCream(String vanillaCream) {
        super.vanillaCreams.add(vanillaCream);
    }
}
