/**
 * Created by Pasha on 02.02.2016.
 */
public class Laptop extends Computer {

    private double weight;

    public Laptop() {
    }

    public Laptop(String name, int ram, int hdd, String processor, int price, double weight) {
        super(name, ram, hdd, processor, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Ноутбук --- " + super.toString() +
                ", Вес=" + weight;
    }
}
