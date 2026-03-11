package core.basesyntax;

public class Figure implements Drawable {
    private String name;
    private String color;
    private double area;

    public Figure(String color, double area, String name) {
        this.color = color;
        this.area = area;
        this.name = name;
    }

    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq. units, color: " + getColor());
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }

    public String getName() {
        return name;
    }
}
