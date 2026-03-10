package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    Random rd = new Random();
    int maxSize = 20;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int[] number = {1, 2, 3, 4, 5};
        switch (number[rd.nextInt(number.length)]) {
    case 1:
        return new Circle(rd.nextInt(1, maxSize + 1), colorSupplier.getRandomColor());
    case 2:
        int smallerBase = rd.nextInt(1, maxSize + 1);
        int biggerBase = rd.nextInt(smallerBase + 1, maxSize + 1);
        return new IsoscelesTrapezoid(biggerBase, smallerBase, rd.nextInt(1, maxSize + 1), colorSupplier.getRandomColor());
    case 3:
        return new Rectangle(rd.nextInt(1, maxSize + 1), rd.nextInt(1, maxSize + 1), colorSupplier.getRandomColor());
    case 4:
        return new RightTriangle(rd.nextInt(1, maxSize + 1), colorSupplier.getRandomColor());
    case 5:
        return new Square(rd.nextInt(1, maxSize + 1), colorSupplier.getRandomColor());
    default:
        return new Circle(rd.nextInt(1, maxSize + 1), colorSupplier.getRandomColor());
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }
}
