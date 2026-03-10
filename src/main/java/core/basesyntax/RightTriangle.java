package core.basesyntax;

public class RightTriangle extends Figure implements Drawable {
    private int side;

    public RightTriangle(int side, String color) {
        super(color, (Math.sqrt(3) / 4) * Math.pow(side, 2), "Right triangle");
        this.side = side;
    }

    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq. units, side: " + getSide() 
        + " units, color: " + getColor());
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
