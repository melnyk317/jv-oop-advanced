package core.basesyntax;

public class Figure {
    private String name;
    private Color color;
    private double area;

    public Figure(Color color, double area, String name) {
        this.color = color;
        this.area = area;
        this.name = name;
    }

    public String getColor() {
        return color.toString();
    }

    public double getArea() {
        return area;
    }

    public String getName() {
        return name;
    }
}
