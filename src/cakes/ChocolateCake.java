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
}
