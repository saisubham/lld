package creational.factory;

public class ConcreteCreatorB implements Creator{
    @Override
    public void someOperation() {
        System.out.println("Concrete creator B did some operation");
    }

    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
