package core.basesyntax;

public class Square extends Figure implements Drawable {
    private int side;

    public Square(int side, String color) {
        super(color, Math.pow(side, 2), "Square");
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
        return Math.pow(side, 2);
    }

    @Override
    public String getName() {
        return "Square";
    }
}
