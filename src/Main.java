import builder.Builder;
import builder.ChocolateCakeBuilder;
import builder.OperaCakeBuilder;
import builder.PrincessCakeBuilder;
import cakes.Cake;
import command.*;


public class Main {
    public static void main(String[] args) {
        Builder princessBuilder = new PrincessCakeBuilder();
        Cake princessCake = princessBuilder
                .addCakeBottom("TårtBotten")
                .addVanillaCream("Vaniljkräm")
                .build();

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


        CakePipeline pipeline = new CakePipeline();
        pipeline.addCommand(new AddHardWhippedCreamOnCake());
        pipeline.addCommand(new AddGreenMarzipanLod());
        pipeline.addCommand(new AddMarzipanRose());
        pipeline.addCommand(new AddIcingSugar());

        pipeline.execute(princessCake);

        CakePipeline pipeline1 = new CakePipeline();
        pipeline1.addCommand(new AddHardWhippedCreamOnCake());
        pipeline1.addCommand(new AddPinkMarzipanLod());
        pipeline1.addCommand(new AddMarzipanRose());
        pipeline1.addCommand(new AddIcingSugar());
        pipeline1.execute(operaCake);

        CakePipeline pipeline2 = new CakePipeline();
        pipeline2.addCommand(new AddChocolateButterCream());
        pipeline2.addCommand(new AddChocolateGanache());
        pipeline2.addCommand(new AddRaspberry());
        pipeline2.execute(chocolateCake);

    }
}