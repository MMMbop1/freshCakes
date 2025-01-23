package cakes;

import java.util.ArrayList;

public class OperaCake extends Cake {
    private ArrayList<String> cakeBottoms = new ArrayList<>();
    private ArrayList<String> vanillaCreams = new ArrayList<>();

    private String raspBerryJam;

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

    public String getRaspBerryJam() {
        return raspBerryJam;
    }

    public void setRaspBerryJam(String raspBerryJam) {
        this.raspBerryJam = raspBerryJam;
    }
}
