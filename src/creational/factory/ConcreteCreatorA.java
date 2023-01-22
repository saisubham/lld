package creational.factory;

public class ConcreteCreatorA implements Creator{
    @Override
    public void someOperation() {
        System.out.println("Concrete creator A did some operation");
    }

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
