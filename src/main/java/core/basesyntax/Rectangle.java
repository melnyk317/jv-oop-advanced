package core.basesyntax;

public class Rectangle extends Figure {
    public int firstSide;
    public int secondSide;
    
    public Rectangle(int firstSide, int secondSide, Color color, double area, String name) {
        super(color, area, name);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }
}
