package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    Random rd = new Random();

    public String getRandomColor() {
        return Color.values()[rd.nextInt(Color.values().length)].toString();
    }
}
