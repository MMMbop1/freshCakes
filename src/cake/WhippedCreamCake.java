package cake;

public abstract class WhippedCreamCake extends Cake {

    @Override
    public void addCakeBottom(String cakeBottom) {
        super.cakeBottoms.add(cakeBottom);
    }

    @Override
    public void addVanillaCream(String vanillaCream) {
        super.vanillaCreams.add(vanillaCream);
    }

    @Override
    public void addHardWhippedCream(String hardWhippedCream) {
        super.hardWhippedCream = hardWhippedCream;
    }

    @Override
    public void addMarzipanRose(String marzipanRose) {
        super.marzipanRose = marzipanRose;
    }

    @Override
    public void addIcingSugar(String icingSugar) {
        super.setIcingSugar(icingSugar);
    }

}
