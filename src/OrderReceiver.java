import builder.Builder;
import builder.ChocolateCakeBuilder;
import builder.OperaCakeBuilder;
import builder.PrincessCakeBuilder;
import cake.Cake;
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

        Cake princessCake = princessBuilder
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
        pipeline.addCommand(new AddHardWhippedCreamOnCake());
        pipeline.addCommand(new AddGreenMarzipanLod());
        pipeline.addCommand(new AddMarzipanRose());
        pipeline.addCommand(new AddIcingSugar());
        pipeline.execute(princessCake);

        customer.setCake(princessCake);
        orders.add(customer);
    }

    private void orderOperaCake() {
        Customer customer = newCustomer();

        Builder operaCakeBuilder = new OperaCakeBuilder();

        Cake operaCake = operaCakeBuilder
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
        pipeline.addCommand(new AddHardWhippedCreamOnCake());
        pipeline.addCommand(new AddPinkMarzipanLod());
        pipeline.addCommand(new AddMarzipanRose());
        pipeline.addCommand(new AddIcingSugar());
        pipeline.execute(operaCake);

        customer.setCake(operaCake);
        orders.add(customer);
    }

    private void orderChocolateCake() {
        Customer customer = newCustomer();
        Builder chocolateCakeBuilder = new ChocolateCakeBuilder();

        Cake chocolateCake = chocolateCakeBuilder
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
        pipeline.addCommand(new AddChocolateButterCream());
        pipeline.addCommand(new AddChocolateGanache());
        pipeline.addCommand(new AddRaspberry());
        pipeline.execute(chocolateCake);

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
