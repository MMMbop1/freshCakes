package cakes;

import java.util.ArrayList;

public class PrincessCake extends Cake {
    private ArrayList<String> cakeBottoms = new ArrayList<>();
    private ArrayList<String> vanillaCreams = new ArrayList<>();

    public void addCakeBottom(String cakeBottom) {
        cakeBottoms.add(cakeBottom);
    }

    public void addVanillaCream(String vanillaCream) {
        vanillaCreams.add(vanillaCream);
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
