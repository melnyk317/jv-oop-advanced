package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color, Math.pow(radius, 2) * Math.PI, "Circle");
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() 
            + " sq. units, radius: " + getRadius() + " units, color: " + getColor());
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
