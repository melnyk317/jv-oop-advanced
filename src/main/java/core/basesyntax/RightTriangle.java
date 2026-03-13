package core.basesyntax;

public class RightTriangle extends Figure implements Drawable {
    private int legA;
    private int legB;

    public RightTriangle(int legA, int legB, Color color) {
        super(color, (legA * legB) / 2, "Right triangle");
        this.legA = legA;
        this.legB = legB;
    }

    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() 
            + " sq. units, leg A: " + getLegA() + " units, leg B: " + getLegB() 
            + " color: " + getColor());
    }

    public int getLegA() {
        return legA;
    }

    public int getLegB() {
        return legB;
    }

    @Override
    public double getArea() {
        return (legA * legB) / 2;
    }

    @Override
    public String getName() {
        return "Right triangle";
    }
}
