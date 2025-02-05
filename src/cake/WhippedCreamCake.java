package cake;

import java.util.ArrayList;

public abstract class WhippedCreamCake extends Cake {
    private ArrayList<String> cakeBottoms = new ArrayList<>();
    private ArrayList<String> vanillaCreams = new ArrayList<>();
    private String hardWhippedCream;
    private String icingSugar;

    private String marzipanRose;


    public void addCakeBottom(String cakeBottom) {
        cakeBottoms.add(cakeBottom);
    }

    public void addVanillaCream(String vanillaCream) {
        vanillaCreams.add(vanillaCream);
    }

    public void addHardWhippedCream(String hardWhippedCream) {
        this.hardWhippedCream = hardWhippedCream;
    }

    public void addMarzipanRose(String marzipanRose) {
        this.marzipanRose = marzipanRose;
    }

    public void addIcingSugar(String icingSugar) {
        this.icingSugar = icingSugar;
        this.propertyChangeSupport.firePropertyChange("icingSugar", "", icingSugar);
    }

    public ArrayList<String> getVanillaCreams() {
        return vanillaCreams;
    }

    public ArrayList<String> getCakeBottoms() {
        return cakeBottoms;
    }

    public void setCakeBottoms(ArrayList<String> cakeBottoms) {
        this.cakeBottoms = cakeBottoms;
    }

    public void setVanillaCreams(ArrayList<String> vanillaCreams) {
        this.vanillaCreams = vanillaCreams;
    }

    public String getHardWhippedCream() {
        return hardWhippedCream;
    }

    public void setHardWhippedCream(String hardWhippedCream) {
        this.hardWhippedCream = hardWhippedCream;
    }

    public String getIcingSugar() {
        return icingSugar;
    }

    public void setIcingSugar(String icingSugar) {
        this.icingSugar = icingSugar;
    }

    public String getMarzipanRose() {
        return marzipanRose;
    }

    public void setMarzipanRose(String marzipanRose) {
        this.marzipanRose = marzipanRose;
    }
}
