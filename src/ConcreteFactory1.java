public class ConcreteFactory1 extends AbstractFactory {

    public AbstractProductA CreateProductA() {

        AbstractProductA apa = new ProductA1();
        return apa.product();
    }

    public AbstractProductB CreateProductB() {

        AbstractProductB apb = new ProductB1();
        return apb.product();
    }
}
