public class ProductA1 extends AbstractProductA{

    /*
    Ärver AbstractProductA. Här överskuggas metoden "product()".
     */

    public void product(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Delivering some concrete product called \"A1\"!");
    }

}
