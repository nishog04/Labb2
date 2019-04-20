import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        String choice = null;

        AbstractFactory af;
        AbstractProductA apa;
        AbstractProductB apb;

        while (choice != "5") {

            System.out.println("\nWHAT WOULD YOU LIKE TO ORDER?");
            System.out.println("\nPRODUCT:\n" +
                    "[1] A1\n" +
                    "[2] B1\n" +
                    "[3] A2\n" +
                    "[4] B2\n" +
                    "[5] EXIT");

            Scanner scanner = new Scanner(System.in);
            choice = scanner.next();

            switch (choice) {
                case "1":
                    af = new ConcreteFactory1();
                    apa = af.CreateProductA();
                    apa.product();
                    break;
                case "2":
                    af = new ConcreteFactory1();
                    apb = af.CreateProductB();
                    apb.product();
                    break;
                case "3":
                    af = new ConcreteFactory2();
                    apa = af.CreateProductA();
                    apa.product();
                    break;
                case "4":
                    af = new ConcreteFactory2();
                    apb = af.CreateProductB();
                    apb.product();
                    break;
                case "5":
                    System.exit(0);
                default:
                    System.out.println("OOPS! ENTER A NUMBER BETWEEN [1] AND [5]...");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
