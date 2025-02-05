package cake;

public class PrincessCake extends WhippedCreamCake {

    private String greenMarzipanLod;

    public PrincessCake() {}

    public void addGreenMarzipanLod(String greenMarzipanLod) {
        this.greenMarzipanLod = greenMarzipanLod;
    }

    public String getGreenMarzipanLod() {
        return greenMarzipanLod;
    }

    public void setGreenMarzipanLod(String greenMarzipanLod) {
        this.greenMarzipanLod = greenMarzipanLod;
    }

    @Override
    public String toString() {
        return "PrincessCake{" +
                "cakeBottoms=" + getCakeBottoms() +
                ", vanillaCreams=" + getVanillaCreams() +
                ", hardWhippedCream='" + getHardWhippedCream() + '\'' +
                ", greenMarzipanLod='" + greenMarzipanLod + '\'' +
                ", marzipanRose='" + getMarzipanRose() + '\'' +
                ", icingSugar='" + getIcingSugar() + '\'' +
                '}';
    }
}
