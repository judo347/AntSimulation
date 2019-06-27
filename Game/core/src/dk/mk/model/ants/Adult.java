package dk.mk.model.ants;

public class Adult extends Ant {

    public enum AntSize {MINIMA, MINORANDMEDIA, MAJOR}

    private AntSize size;

    public Adult(AntSize size) {
        this.size = size;
    }
}
