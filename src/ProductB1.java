public class ProductB1 extends AbstractProductB{

    /*
    Ärver AbstractProductB. Här överskuggas metoden "product()".
     */

    public void product(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Delivering some concrete product called \"B1\"!");
    }

}
