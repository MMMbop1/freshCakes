package cake;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public abstract class Cake {
    private String name;
    private int id;
    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    protected ArrayList<String> cakeBottoms = new ArrayList<>();
    protected ArrayList<String> vanillaCreams = new ArrayList<>();
    protected ArrayList<String> chocolateCakeBottoms = new ArrayList<>();
    protected ArrayList<String> raspberryMousse = new ArrayList<>();
    protected String raspBerryJam;
    protected String hardWhippedCream;
    protected String greenMarzipanLod;
    protected String pinkMarzipanLod;
    protected String marzipanRose;
    protected String icingSugar;
    protected String chocolateGanache;
    protected String chocolateButtercream;
    protected String raspberry;

    public Cake() {}

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.propertyChangeSupport.addPropertyChangeListener(listener);
    }

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

    public void addHardWhippedCream(String hardWhippedCream) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void addGreenMarzipanLod(String greenMarzipanLod) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void addMarzipanRose(String marzipanRose) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void addIcingSugar(String icingSugar) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void addPinkMarzipanLod(String pinkMarzipanLod) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void addChocolateButtercream(String chocolateButtercream) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void addChocolateGanache(String chocolateGanache) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void addRaspberry(String raspberry) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIcingSugar() {
        return icingSugar;
    }

    public void setIcingSugar(String icingSugar) {
        this.icingSugar = icingSugar;
        this.propertyChangeSupport.firePropertyChange("icingSugar", "", icingSugar);
    }

    public String getRaspberry() {
        return raspberry;
    }

    public void setRaspberry(String raspberry) {
        this.raspberry = raspberry;
        this.propertyChangeSupport.firePropertyChange("raspberry", "", raspberry);
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

    public ArrayList<String> getChocolateCakeBottoms() {
        return chocolateCakeBottoms;
    }

    public void setChocolateCakeBottoms(ArrayList<String> chocolateCakeBottoms) {
        this.chocolateCakeBottoms = chocolateCakeBottoms;
    }

    public ArrayList<String> getRaspberryMousse() {
        return raspberryMousse;
    }

    public void setRaspberryMousse(ArrayList<String> raspberryMousse) {
        this.raspberryMousse = raspberryMousse;
    }

    public String getRaspBerryJam() {
        return raspBerryJam;
    }

    public void setRaspBerryJam(String raspBerryJam) {
        this.raspBerryJam = raspBerryJam;
    }

    public String getHardWhippedCream() {
        return hardWhippedCream;
    }

    public void setHardWhippedCream(String hardWhippedCream) {
        this.hardWhippedCream = hardWhippedCream;
    }

    public String getGreenMarzipanLod() {
        return greenMarzipanLod;
    }

    public void setGreenMarzipanLod(String greenMarzipanLod) {
        this.greenMarzipanLod = greenMarzipanLod;
    }

    public String getPinkMarzipanLod() {
        return pinkMarzipanLod;
    }

    public void setPinkMarzipanLod(String pinkMarzipanLod) {
        this.pinkMarzipanLod = pinkMarzipanLod;
    }

    public String getMarzipanRose() {
        return marzipanRose;
    }

    public void setMarzipanRose(String marzipanRose) {
        this.marzipanRose = marzipanRose;
    }

    public String getChocolateGanache() {
        return chocolateGanache;
    }

    public void setChocolateGanache(String chocolateGanache) {
        this.chocolateGanache = chocolateGanache;
    }

    public String getChocolateButtercream() {
        return chocolateButtercream;
    }

    public void setChocolateButtercream(String chocolateButtercream) {
        this.chocolateButtercream = chocolateButtercream;
    }
}
