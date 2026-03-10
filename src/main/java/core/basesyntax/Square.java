package core.basesyntax;

public class Square extends Figure /*implements Drawable*/ {
    private int side;

    private Square(int side, Color color, double area, String name) {
        super(color, area, name);
        this.side = side;
    }

    /*private void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq. units, side: " + getSide() 
        + " units, color: " + getColor());
    }*/

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getName() {
        return "Square";
    }
}
