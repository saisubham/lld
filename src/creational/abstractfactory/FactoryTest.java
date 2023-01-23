package creational.abstractfactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactoryTest {

    @Test
    public void shouldMakeProductAFromFactory1() {
        Factory factory1 = new ConcreteFactory1();
        ProductA productA = factory1.createProductA();
        Assertions.assertEquals(productA.doStuffA(), "Concrete Product A1 did stuff");
    }

    @Test
    public void shouldMakeProductAFromFactory2() {
        Factory factory2 = new ConcreteFactory2();
        ProductA productA = factory2.createProductA();
        Assertions.assertEquals(productA.doStuffA(), "Concrete Product A2 did stuff");
    }
}
