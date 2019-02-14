package section2;

public class Rectangle extends Shape {
    private float width;
    private float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calArea() {
        area = width * height;
        return area;
    }

    @Override
    public double calEnv() {
        env = 2 * (width + height);
        return env;
    }
}
