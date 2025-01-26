package builder;

import cakes.Cake;
import cakes.ChocolateCake;
import cakes.OperaCake;

public class ChocolateCakeBuilder implements Builder {
    private Cake chocolateCake = new ChocolateCake();

    @Override
    public Builder addChocolateCakeBottom(String chocolateCakeBottom) {
        chocolateCake.addChocolateCakeBottom(chocolateCakeBottom);
        return this;
    }

    @Override
    public Builder addRaspberryMousse(String raspberryMousse) {
        chocolateCake.addRaspberryMousse(raspberryMousse);
        return this;
    }

    @Override
    public Cake build() {
        Cake producedChocolateCake = chocolateCake;
        chocolateCake = new ChocolateCake();
        return producedChocolateCake;
    }
}
