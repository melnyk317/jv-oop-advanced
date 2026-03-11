package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int biggerBase;
    private int smallerBase;
    private int side;

    public IsoscelesTrapezoid(int biggerBase, int smallerBase, int side, String color) {
        super(color, (biggerBase + smallerBase)/4.0 * Math.sqrt(4 * Math.pow(side, 2) - Math.pow(biggerBase 
            - smallerBase, 2)), "Isosceles trapezoid");
        this.biggerBase = biggerBase;
        this.smallerBase = smallerBase;
        this.side = side;
    }

    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() 
            + " sq. units, side: " + getSide() + " units, bigger base: " 
            + getBiggerBase() + ", smaller base " + getSmallerBase() + ", color: " + getColor());
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
        return (biggerBase + smallerBase)/4.0 * Math.sqrt(4 * Math.pow(side, 2) - Math.pow(biggerBase - smallerBase, 2));
    }

    @Override
    public String getName() {
        return "Isosceles trapezoid";
    }
}
