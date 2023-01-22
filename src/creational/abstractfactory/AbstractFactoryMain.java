package creational.abstractfactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        Factory factory1 = new ConcreteFactory1();
        ProductA productA = factory1.createProductA();
        productA.doStuffA();

        Factory factory2 = new ConcreteFactory2();
        productA = factory2.createProductA();
        productA.doStuffA();
    }
}
