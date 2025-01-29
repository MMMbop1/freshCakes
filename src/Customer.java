import cake.Cake;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Customer {
    private String name;
    private int id;
    private Cake cake;
    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    public Customer(String name) {
        this.name = name;
    }
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public Cake getCake() {
        return cake;
    }

    public void setCake(Cake cake) {
        this.cake = cake;
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
        this.propertyChangeSupport.firePropertyChange("id", "", id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", cake=" + cake.toString() +
                '}';
    }
}
