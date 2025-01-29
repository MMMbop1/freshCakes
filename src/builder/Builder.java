package builder;

import cake.Cake;

public interface Builder {
    public Cake build();

    default Builder addCakeBottom(String cakeBottom) {
        throw new UnsupportedOperationException("addCakeBottom is not valid for builder");
    }

    default Builder addVanillaCream(String vanillaCream) {
        throw new UnsupportedOperationException("addVanillaCream is not valid for builder");
    }

    default Builder addRaspberryMousse(String raspberryMousse) {
        throw new UnsupportedOperationException("addRaspberryMousse is not valid for builder");
    }

    default Builder addChocolateCakeBottom(String chocolateCakeBottom) {
        throw new UnsupportedOperationException("addChocolateBottom is not valid for builder");
    }

    default Builder addRaspberryJam(String raspberryJam) {
        throw new UnsupportedOperationException("addChocolateBottom is not valid for builder");
    }
}
