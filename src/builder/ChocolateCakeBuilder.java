package builder;

import cake.Cake;
import cake.ChocolateCake;

public class ChocolateCakeBuilder implements Builder {
    private ChocolateCake chocolateCake = new ChocolateCake();

    public ChocolateCakeBuilder() {}

    public ChocolateCakeBuilder addChocolateCakeBottom(String chocolateCakeBottom) {
        chocolateCake.addChocolateCakeBottom(chocolateCakeBottom);
        System.out.println("added:" + chocolateCake.getChocolateCakeBottoms().getLast());
        return this;
    }

    public ChocolateCakeBuilder addRaspberryMousse(String raspberryMousse) {
        chocolateCake.addRaspberryMousse(raspberryMousse);
        System.out.println("added:" + chocolateCake.getRaspberryMousse().getLast());
        return this;
    }

    @Override
    public Cake build() {
        Cake producedChocolateCake = chocolateCake;
        chocolateCake = new ChocolateCake();
        return producedChocolateCake;
    }
}
