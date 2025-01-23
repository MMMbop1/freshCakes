import builder.OperaCakeBuilder;
import builder.PrincessCakeBuilder;
import cakes.OperaCake;
import cakes.PrincessCake;

public class Main {
    public static void main(String[] args) {
        PrincessCakeBuilder princessBuilder = new PrincessCakeBuilder();
        PrincessCake princessCake = princessBuilder
                .addCakeBottom("TårtBotten")
                .addVanillaCream("Vaniljkräm")
                .build();

        OperaCakeBuilder operaCakeBuilder = new OperaCakeBuilder();
        OperaCake operaCake = operaCakeBuilder
                .addCakeBottom("TårtBotten")
                .addVanillaCream("VaniljKräm")
                .addCakeBottom("TårtBotten")
                .addRaspberryJam("hallonsylt")
                .build();

    }


}