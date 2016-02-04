/**
 * Created by Pasha on 02.02.2016.
 */
public class Desktop extends Computer {

    private int width;

    private int height;

    public Desktop(String name, int ram, int hdd, String processor, int price, int width, int height) {
        super(name, ram, hdd, processor, price);
        this.width = width;
        this.height = height;
    }

    public Desktop() {
    }



    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public String toString() {
        return "Настольный компьютер --- " + super.toString() +
                ", Ширина =" + width +
                ", Высота=" + height;
    }
}
