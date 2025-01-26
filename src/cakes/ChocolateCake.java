package cakes;

public class ChocolateCake extends Cake {

    @Override
    public void addChocolateCakeBottom(String chocolateCakeBottom) {
        super.chocolateCakeBottoms.add(chocolateCakeBottom);
    }

    @Override
    public void addRaspberryMousse(String raspberryMousse) {
        super.raspberryMousse.add(raspberryMousse);
    }

    @Override
    public void addChocolateButtercream(String chocolateButtercream) {
        super.chocolateButtercream = chocolateButtercream;
    }

    @Override
    public void addChocolateGanache(String chocolateGanache) {
        super.chocolateGanache = chocolateGanache;
    }

    @Override
    public void addRaspberry(String raspberry) {
        super.raspberry = raspberry;
    }
}
