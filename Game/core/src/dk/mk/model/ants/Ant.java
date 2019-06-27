package dk.mk.model.ants;

public abstract class Ant {

    private double lifetime = 0;

    /** Updates the ants lifetime based on the time passed. */
    public void addDeltaTime(float delta) {
        lifetime = lifetime + delta;
    }

    public double getLifetime() {
        return lifetime;
    }
}
