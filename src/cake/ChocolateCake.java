package cake;

import java.util.ArrayList;

public class ChocolateCake extends Cake {

    private ArrayList<String> chocolateCakeBottoms = new ArrayList<>();
    private ArrayList<String> raspberryMousse = new ArrayList<>();
    private String raspberry;
    private String chocolateGanache;
    private String chocolateButtercream;

    public void addChocolateCakeBottom(String chocolateCakeBottom) {
        chocolateCakeBottoms.add(chocolateCakeBottom);
    }
    public void addRaspberryMousse(String raspberryMousse) {
        this.raspberryMousse.add(raspberryMousse);
    }

    public void addChocolateButtercream(String chocolateButtercream) {
        this.chocolateButtercream = chocolateButtercream;
    }

    public void addChocolateGanache(String chocolateGanache) {
        this.chocolateGanache = chocolateGanache;
    }

    public void addRaspberry(String raspberry) {
        this.raspberry = raspberry;
        this.propertyChangeSupport.firePropertyChange("raspberry", "", raspberry);
    }

    public ArrayList<String> getChocolateCakeBottoms() {
        return chocolateCakeBottoms;
    }

    public ArrayList<String> getRaspberryMousse() {
        return raspberryMousse;
    }

    public void setRaspberryMousse(ArrayList<String> raspberryMousse) {
        this.raspberryMousse = raspberryMousse;
    }

    public void setChocolateCakeBottoms(ArrayList<String> chocolateCakeBottoms) {
        this.chocolateCakeBottoms = chocolateCakeBottoms;
    }

    public String getRaspberry() {
        return raspberry;
    }

    public void setRaspberry(String raspberry) {
        this.raspberry = raspberry;
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

    @Override
    public String toString() {
        return "ChocolateCake{" +
                "chocolateCakeBottoms=" + chocolateCakeBottoms +
                ", raspberryMousse=" + raspberryMousse +
                ", chocolateGanache='" + chocolateGanache + '\'' +
                ", chocolateButtercream='" + chocolateButtercream + '\'' +
                ", raspberry='" + raspberry + '\'' +
                '}';
    }
}
