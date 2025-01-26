import builder.Builder;
import builder.ChocolateCakeBuilder;
import builder.OperaCakeBuilder;
import builder.PrincessCakeBuilder;
import cakes.Cake;
import cakes.OperaCake;
import cakes.PrincessCake;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Builder princessBuilder = new PrincessCakeBuilder();
        Cake princessCake = princessBuilder
                .addCakeBottom("TårtBotten")
                .addVanillaCream("Vaniljkräm")
                .build();

        princessCake.getCakeBottoms().forEach(System.out::println);

        Builder operaCakeBuilder = new OperaCakeBuilder();
        Cake operaCake = operaCakeBuilder
                .addCakeBottom("TårtBotten")
                .addVanillaCream("VaniljKräm")
                .addCakeBottom("TårtBotten")
                .addRaspberryJam("hallonsylt")
                .build();

        Builder chocolateBuilder = new ChocolateCakeBuilder();
        Cake chocolateCake = chocolateBuilder
                .addChocolateCakeBottom("chokladBotten")
                .addRaspberryMousse("hallonMousse")
                .build();

    }
}