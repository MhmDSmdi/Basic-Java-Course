package section1;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double minis(double a, double b) {
        return a - b;
    }

    public double multiple(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public double sin(float theta) {
        theta = (float) (theta * 180 / Math.PI);
        return Math.sin(theta);
    }

    public double cos(float theta) {
        theta = (float) (theta * 180 / Math.PI);
        return Math.cos(theta);
    }

    public double tan(float theta) {
        theta = (float) (theta * 180 / Math.PI);
        return Math.tan(theta);
    }

    public double cot(float theta) {
        theta = (float) (theta * 180 / Math.PI);
        return  1 / tan(theta);
    }
}
