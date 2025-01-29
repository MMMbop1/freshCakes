import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Ceo implements PropertyChangeListener {
    private String name;
    private int id;

    public Ceo() {}

    public Ceo(String name, int id) {
        this.name = name;
        this.id = id;
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

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("id")) {
            System.out.println("New cake order id: " + evt.getNewValue());
        }

        if (evt.getPropertyName().equals("icingSugar")) {
            System.out.println("Cake order is complete and ready for delivery with Last step: " + evt.getNewValue());
        }

        if (evt.getPropertyName().equals("raspberry")) {
            System.out.println("Cake order is complete and ready for delivery with Last step: " + evt.getNewValue());
        }
    }
}
