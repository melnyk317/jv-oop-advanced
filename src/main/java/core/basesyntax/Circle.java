package core.basesyntax;

public class Circle extends Figure {
    public int radius;

    public Circle(int radius, Color color, double area, String name) {
        super(color, area, name);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
