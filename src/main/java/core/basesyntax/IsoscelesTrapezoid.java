package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    public int biggerBase;
    public int smallerBase;
    public int side;

    public IsoscelesTrapezoid(int biggerBase, int smallerBase, int side, Color color, double area, String name) {
        super(color, area, name);
        this.biggerBase = biggerBase;
        this.smallerBase = smallerBase;
        this.side = side;
    }

    public int getBiggerBase() {
        return biggerBase;
    }

    public int getSmallerBase() {
        return smallerBase;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return (biggerBase + smallerBase)/4 * Math.sqrt(4 * Math.pow(side, 2) - Math.pow(biggerBase - smallerBase, 2));
    }

    @Override
    public String getName() {
        return "Isosceles trapezoid";
    }
}
