public class ConcreteFactory2 extends AbstractFactory {

    /*
    Denna klass ärver AbstractFactory. Här finns överskuggas den abstrakta klassens metoder
     */

    @Override
    public void CreateProductA() {
        System.out.println("Creating product A from factory 2");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Shipping...");
    }

    @Override
    public void CreateProductB() {
        System.out.println("Creating product B from factory 2");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Shipping...");
    }
}
