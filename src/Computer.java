/**
 * Created by Pasha on 02.02.2016.
 */
public abstract class Computer {

    private String name;

    private static int COUNT;

    private static double SUM_PRICE;

    private int ram;

    private int hdd;

    private String processor;

    private double price;


    Computer(){

    }

    public Computer(String name, int ram, int hdd, String processor, double price) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.processor = processor;
        this.price = price;
        COUNT++;
        SUM_PRICE+=price;
    }

    static public double getAverage_sum(){
        return SUM_PRICE/COUNT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return " Название=" + name  +
                ", ОЗУ=" + ram +
                ", Объем накопителя(hdd)=" + hdd +
                ", Процесор=" + processor +
                ", Цена=" + price;
    }
}
