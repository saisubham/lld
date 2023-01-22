package creational.builder;

public class BuilderMain {
    public static void main(String[] args) {
        ConcreteBuilderA builder = new ConcreteBuilderA();
        Director director = new Director(builder);
        director.make(Type.SIMPLE);
        ProductA product = builder.getResult();
        product.doStuff();
    }
}
