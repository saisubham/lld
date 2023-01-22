package creational.factory;

public class FactoryMain {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreatorA();
        Product product = creator.createProduct();
        creator.someOperation();
        product.doStuff();
    }
}
