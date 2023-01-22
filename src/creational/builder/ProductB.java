package creational.builder;

public class ProductB {
    private String feature1;
    private String feature2;

    public String getFeature1() {
        return feature1;
    }

    public void setFeature1(String feature1) {
        this.feature1 = feature1;
    }

    public String getFeature2() {
        return feature2;
    }

    public void setFeature2(String feature2) {
        this.feature2 = feature2;
    }

    void doStuff() {
        System.out.println("Product B did stuff");
        System.out.println("feature 1 = " + this.getFeature1());
        System.out.println("feature 2 = " + this.getFeature2());
    }
}
