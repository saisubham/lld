package creational.builder;

public class Director {
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void changeBuilder(Builder newBuilder) {
        this.builder = newBuilder;
    }

    public void make(Type type) {
        builder.reset();
        switch (type) {
            case COMPLEX:
                builder.buildStepA();
                builder.buildStepB();
                break;
            case SIMPLE:
            default:
                builder.buildStepA();
        }
    }
}
