package section2;

public class Circle extends Shape {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double calArea() {
        area =  Math.PI * r * r;
        return area;
    }

    @Override
    public double calEnv() {
        env =  2 * Math.PI * r;
        return env;
    }
}
