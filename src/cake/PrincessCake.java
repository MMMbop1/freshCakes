package cake;

public class PrincessCake extends WhippedCreamCake {

    public PrincessCake() {}

    @Override
    public void addGreenMarzipanLod(String greenMarzipanLod) {
        super.greenMarzipanLod = greenMarzipanLod;
    }

    @Override
    public String toString() {
        return "PrincessCake{" +
                "cakeBottoms=" + cakeBottoms +
                ", vanillaCreams=" + vanillaCreams +
                ", hardWhippedCream='" + hardWhippedCream + '\'' +
                ", greenMarzipanLod='" + greenMarzipanLod + '\'' +
                ", marzipanRose='" + marzipanRose + '\'' +
                ", icingSugar='" + icingSugar + '\'' +
                '}';
    }
}
