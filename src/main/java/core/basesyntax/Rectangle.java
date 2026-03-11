package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;
    
    public Rectangle(int firstSide, int secondSide, String color) {
        super(color, firstSide * secondSide, "Rectangle");
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() 
            + " sq. units, first side: " + getFirstSide() + " units, second side "  
            + getSecondSide() + " units, color: " + getColor());
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
