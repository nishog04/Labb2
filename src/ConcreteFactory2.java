public class ConcreteFactory2 extends AbstractFactory {

    public AbstractProductA CreateProductA() {

        AbstractProductA apa = new ProductA2();
        return apa.product();
    }

    public AbstractProductB CreateProductB() {

        AbstractProductB apb = new ProductB2();
        return apb.product();
    }
}
