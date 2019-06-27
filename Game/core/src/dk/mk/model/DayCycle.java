package dk.mk.model;

/** This class has the responsebility for keeping track of the day/night cycle. */
public class DayCycle {

    private double worldLifetime = 0;

    public void addDeltaTime(float delta){
        worldLifetime+=delta;
    }
}
