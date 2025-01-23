package cakes;

import java.util.ArrayList;

public abstract class Cake {
    private String name;
    private String id;
    protected ArrayList<String> chocolateCakeBottoms = new ArrayList<>();
    private ArrayList<String> raspberryMousse = new ArrayList<>();
    private String whippedCream;
    private String greenMarzipanLod;
    private String pinkMarzipanLod;
    private String marzipanRose;
    private String icingSugar;
    private String raspBerryJam;
    private String chocolateGanache;


    public void addChocolateCakeBottom(String chocolateCakeBottom) {
        chocolateCakeBottoms.add(chocolateCakeBottom);
    }

    public void addRaspBerryMousse(String raspBerryMousse) {
        raspberryMousse.add(raspBerryMousse);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
