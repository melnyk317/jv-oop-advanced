package core.basesyntax;

public class Main {
    private static final int ARRAY_LENGTH = 6;
    private static final int FIRST_HALF = 3;
    private static final int SECOND_HALF = 3;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_LENGTH];

        for (int i = 0; i < FIRST_HALF; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = FIRST_HALF; i < FIRST_HALF + SECOND_HALF; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            figures[i].draw();
        }
    }
}
