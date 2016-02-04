import java.sql.Connection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество товара: ");
        Container container = new Container(scanner.nextInt());

        while (container.getIndex()<container.computers.length){
            System.out.println("1)Добавить товар.");
            System.out.println("2)Добавить товар в ручную.");
            switch (scanner.nextInt()){
                case 1:
                    container.AddAuto();
                    break;
                case 2:
                    container.Add();
                    break;
                default:
                    System.out.println("Введено не верное число!");
            }
        }

        System.out.println("Список товаров:");
        container.print();

        container.sort();
        System.out.println("Список товаров:");

        container.print();


    }
}
