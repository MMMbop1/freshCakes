package cake;

public class OperaCake extends WhippedCreamCake {

    private String raspBerryJam;

    private String pinkMarzipanLod;

    public void addRaspberryMousse(String raspberryMousse) {
        raspBerryJam = raspberryMousse;
    }

    public void addPinkMarzipanLod(String pinkMarzipanLod) {
        this.pinkMarzipanLod = pinkMarzipanLod;
    }

    public String getPinkMarzipanLod() {
        return pinkMarzipanLod;
    }

    public void setPinkMarzipanLod(String pinkMarzipanLod) {
        this.pinkMarzipanLod = pinkMarzipanLod;
    }

    @Override
    public String toString() {
        return "OperaCake{" +
                "cakeBottoms=" + getCakeBottoms() +
                ", vanillaCreams=" + getVanillaCreams() +
                ", raspBerryJam='" + raspBerryJam + '\'' +
                ", hardWhippedCream='" + getHardWhippedCream() + '\'' +
                ", pinkMarzipanLod='" + pinkMarzipanLod + '\'' +
                ", marzipanRose='" + getMarzipanRose() + '\'' +
                ", icingSugar='" + getIcingSugar() + '\'' +
                '}';
    }

    public String getRaspBerryJam() {
        return raspBerryJam;
    }

    public void setRaspBerryJam(String raspBerryJam) {
        this.raspBerryJam = raspBerryJam;
    }
}
