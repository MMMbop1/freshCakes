import builder.Builder;
import builder.ChocolateCakeBuilder;
import builder.OperaCakeBuilder;
import builder.PrincessCakeBuilder;
import cake.Cake;
import cake.ChocolateCake;
import cake.OperaCake;
import cake.PrincessCake;
import command.*;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderReceiver {
    private ArrayList<Customer> orders = new ArrayList<>();
    private Ceo ceo = new Ceo();
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            message();
            choice = scanner.nextInt();
            userChoice(choice);
        } while (choice != 0);
    }

    private void userChoice(int choice) {
        switch (choice) {
            case 0 -> System.out.println("Goodbye");
            case 1 -> seeAllOrders();
            case 2 -> orderPrincessCake();
            case 3 -> orderOperaCake();
            case 4 -> orderChocolateCake();
            case 5 -> getOrderById();
        }
    }

    private void message() {
        String message = """
                
                Welcome to our shop. Here you have a list of options:
                
                0) Quit.
                1). See all orders.
                2). Order PrincessCake.
                3). Order OperaCake
                4). Order ChocolateCake.
                5). See order by id.
                """;

        System.out.println(message);
    }

    private void orderPrincessCake() {
        Customer customer = newCustomer();

        Builder princessBuilder = new PrincessCakeBuilder();

        PrincessCake princessCake = (PrincessCake) princessBuilder
                .addCakeBottom("Tårtbotten")
                .addVanillaCream("VaniljKräm")
                .addCakeBottom("TårtBotten")
                .addVanillaCream("VaniljKräm")
                .addCakeBottom("TårtBotten")
                .build();

        princessCake.setName("PrincessCake");
        princessCake.setId(customer.getId());
        princessCake.addPropertyChangeListener(ceo);

        CakePipeline pipeline = new CakePipeline();
        pipeline.addCommand(new AddHardWhippedCreamOnCake(princessCake));
        pipeline.addCommand(new AddGreenMarzipanLod(princessCake));
        pipeline.addCommand(new AddMarzipanRose(princessCake));
        pipeline.addCommand(new AddIcingSugar(princessCake));
        pipeline.execute();

        customer.setCake(princessCake);
        orders.add(customer);
    }

    private void orderOperaCake() {
        Customer customer = newCustomer();

        Builder operaCakeBuilder = new OperaCakeBuilder();

        OperaCake operaCake = (OperaCake) operaCakeBuilder
                .addCakeBottom("Tårtbotten")
                .addVanillaCream("VaniljKräm")
                .addCakeBottom("TårtBotten")
                .addRaspberryJam("HallonSylt")
                .addCakeBottom("TårtBotten")
                .build();

        operaCake.setName("OperaCake");
        operaCake.setId(customer.getId());
        operaCake.addPropertyChangeListener(ceo);

        CakePipeline pipeline = new CakePipeline();
        pipeline.addCommand(new AddHardWhippedCreamOnCake(operaCake));
        pipeline.addCommand(new AddPinkMarzipanLod(operaCake));
        pipeline.addCommand(new AddMarzipanRose(operaCake));
        pipeline.addCommand(new AddIcingSugar(operaCake));
        pipeline.execute();

        customer.setCake(operaCake);
        orders.add(customer);
    }

    private void orderChocolateCake() {
        Customer customer = newCustomer();
        Builder chocolateCakeBuilder = new ChocolateCakeBuilder();

        ChocolateCake chocolateCake = (ChocolateCake) chocolateCakeBuilder
                .addChocolateCakeBottom("ChocolateCakeBottom")
                .addRaspberryMousse("RaspberryMousse")
                .addChocolateCakeBottom("ChocolateCakeBottom")
                .addRaspberryMousse("RaspberryMousse")
                .addChocolateCakeBottom("ChocolateCakeBottom")
                .build();

        chocolateCake.setName("ChocolateCake");
        chocolateCake.setId(customer.getId());
        chocolateCake.addPropertyChangeListener(ceo);

        CakePipeline pipeline = new CakePipeline();
        pipeline.addCommand(new AddChocolateButterCream(chocolateCake));
        pipeline.addCommand(new AddChocolateGanache(chocolateCake));
        pipeline.addCommand(new AddRaspberry(chocolateCake));
        pipeline.execute();

        customer.setCake(chocolateCake);
        orders.add(customer);
    }

    private Customer newCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        Customer customer = new Customer(scanner.next());
        customer.addPropertyChangeListener(ceo);
        customer.setId(orders.size());
        return customer;
    }

    private void seeAllOrders() {
        for (Customer customer : orders) {
            System.out.println(customer.toString());
        }
    }

    private void getOrderById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the id of your order");
        int id = scanner.nextInt();
        System.out.println(orders.get(id));

    }
}
