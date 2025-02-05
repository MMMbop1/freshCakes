package cake;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public abstract class Cake {
    private String name;
    private int id;
    protected final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    public Cake() {}

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.propertyChangeSupport.addPropertyChangeListener(listener);
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
}
