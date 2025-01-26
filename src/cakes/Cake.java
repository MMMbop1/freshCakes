package cakes;

import java.util.ArrayList;

public abstract class Cake {
    private String name;
    private String id;
    protected ArrayList<String> cakeBottoms = new ArrayList<>();
    protected ArrayList<String> vanillaCreams = new ArrayList<>();
    protected ArrayList<String> chocolateCakeBottoms = new ArrayList<>();
    protected ArrayList<String> raspberryMousse = new ArrayList<>();
    protected String raspBerryJam;
    private String greenMarzipanLod;
    private String pinkMarzipanLod;
    private String marzipanRose;
    private String icingSugar;
    private String chocolateGanache;

    public void addCakeBottom(String cakeBottom) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void addVanillaCream(String vanillaCream) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void addChocolateCakeBottom(String chocolateCakeBottom) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void addRaspberryMousse(String raspberryMousse) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public ArrayList<String> getCakeBottoms() {
        return cakeBottoms;
    }

    public void setCakeBottoms(ArrayList<String> cakeBottoms) {
        this.cakeBottoms = cakeBottoms;
    }

    public ArrayList<String> getVanillaCreams() {
        return vanillaCreams;
    }

    public void setVanillaCreams(ArrayList<String> vanillaCreams) {
        this.vanillaCreams = vanillaCreams;
    }
}
