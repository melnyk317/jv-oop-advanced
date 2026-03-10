package core.basesyntax;

public class RightTriangle extends Figure {
    public int side;

    public RightTriangle(int side, Color color, double area, String name) {
        super(color, area, name);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * Math.pow(side, 2);
    }

    @Override
    public String getName() {
        return "Right triangle";
    }
}
