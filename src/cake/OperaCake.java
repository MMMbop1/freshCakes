package cake;

public class OperaCake extends WhippedCreamCake {
    @Override
    public void addRaspberryMousse(String raspberryMousse) {
        super.raspBerryJam = raspberryMousse;
    }

    @Override
    public void addPinkMarzipanLod(String pinkMarzipanLod) {
        super.pinkMarzipanLod = pinkMarzipanLod;
    }

    @Override
    public String toString() {
        return "OperaCake{" +
                "cakeBottoms=" + cakeBottoms +
                ", vanillaCreams=" + vanillaCreams +
                ", raspBerryJam='" + raspBerryJam + '\'' +
                ", hardWhippedCream='" + hardWhippedCream + '\'' +
                ", pinkMarzipanLod='" + pinkMarzipanLod + '\'' +
                ", marzipanRose='" + marzipanRose + '\'' +
                ", icingSugar='" + icingSugar + '\'' +
                '}';
    }
}
