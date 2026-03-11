package core.basesyntax;

public class Main {
    final static int arrayLength = 6;
    final static int firstHalf = 3;
    final static int secondHalf = 3;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[arrayLength];

        for (int i = 0; i < firstHalf; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = firstHalf; i < firstHalf + secondHalf; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (int i = 0; i < arrayLength; i++) {
            figures[i].draw();
        }
    }
}
