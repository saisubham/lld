package creational.builder;

public class ConcreteBuilderB implements Builder {
    private ProductB productB;

    @Override
    public void reset() {
        productB = new ProductB();
    }

    @Override
    public void buildStepA() {
        productB.setFeature1("b-foo");
    }

    @Override
    public void buildStepB() {
        productB.setFeature2("b-bar");
    }

    public ProductB getResult() {
        return this.productB;
    }
}
