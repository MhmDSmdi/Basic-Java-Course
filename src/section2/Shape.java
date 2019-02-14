package section2;

public abstract class Shape {

    protected double area;
    protected double env;

    // abstract methods for implementation in other formation
    public abstract double calArea();

    public abstract double calEnv();

    @Override
    public String toString() {
        return "Shape class";
    }
}
