package creational.builder;

public class ConcreteBuilderA implements Builder {
    private ProductA productA;

    @Override
    public void reset() {
        productA = new ProductA();
    }

    @Override
    public void buildStepA() {
        productA.setFeature1("a-foo");
    }

    @Override
    public void buildStepB() {
        productA.setFeature2("a-bar");
    }

    public ProductA getResult() {
        return this.productA;
    }
}
