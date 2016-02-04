import java.util.Scanner;

/**
 * Created by Pasha on 03.02.2016.
 */
public class Container {

    Scanner scanner = new Scanner(System.in);

    Computer computers[];

    private int index;

    public Container() {
    }

    public Container(int n) {
        computers = new Computer[n];
    }

    public void Add() {
        if (index < computers.length) {
            System.out.print("\nДобавить:\n1)Ноутбук\n2)Настольный компьютер\nВведите номер:");

                switch (scanner.nextInt()) {
                    case 1:
                        Laptop laptop = new Laptop();
                        System.out.print("Введите имя:");
                        laptop.setName(scanner.next());
                        System.out.print("Введите Объем накопителя(hdd):");
                        laptop.setHdd(scanner.nextInt());
                        System.out.print("Введите процессор:");
                        laptop.setProcessor(scanner.next());
                        System.out.print("Введите ОЗУ:");
                        laptop.setRam(scanner.nextInt());
                        System.out.print("Введите цену:");
                        laptop.setPrice(scanner.nextDouble());
                        System.out.println("Введите вес");
                        laptop.setWeight(scanner.nextDouble());
                        computers[index++]=laptop;
                        break;
                    case 2:
                        Desktop desktop = new Desktop();
                        System.out.print("Введите имя:");
                        desktop.setName(scanner.next());
                        System.out.print("Введите Объем накопителя(hdd):");
                        desktop.setHdd(scanner.nextInt());
                        System.out.print("Введите процессор:");
                        desktop.setProcessor(scanner.next());
                        System.out.print("Введите ОЗУ:");
                        desktop.setRam(scanner.nextInt());
                        System.out.print("Введите цену:");
                        desktop.setPrice(scanner.nextInt());
                        System.out.print("Введите высоту:");
                        desktop.setHeight(scanner.nextInt());
                        System.out.print("Введите ширину:");
                        desktop.setWidth(scanner.nextInt());
                        break;
                    default:
                        System.out.println("Введено неверное число!");
                }
        }
        System.out.println();
    }

    public void AddAuto() {

        if (index < computers.length) {
            System.out.print("\nДобавить:\n1)Ноутбук\n2)Настольный компьютер\nВведите номер:");


            switch (scanner.nextInt()) {
                case 1:
                    computers[index++] = new Laptop("Lenovo", 8, 1000, "Intel", 21000, 2.7);
                    break;
                case 2:
                    computers[index++] = new Desktop("A17", 16, 1500, "AMD", 45000, 45, 120);
                    break;
                default:
                    System.out.println("Введено неверное число!");
            }
        }
        System.out.println();
    }

    public void sort(){

        for (int i =0; i<computers.length;i++){
            for (int j=i+1; j<computers.length;j++){
                if (computers[i].getPrice()<computers[j].getPrice()){
                    Computer tmp = computers[i];
                    computers[i]=computers[j];
                    computers[j]=tmp;
                }
            }
        }

    }

    /// Count возвращает количество компьютеров
    public int Count(){
        return index;
    }

    public int getIndex() {
        return index;
    }

    public Computer getComputer(int index){
        return computers[index];
    }

    public void print(){
        for (Computer computer : computers) {
            System.out.println(computer.toString());
        }
        System.out.println();
    }




}
