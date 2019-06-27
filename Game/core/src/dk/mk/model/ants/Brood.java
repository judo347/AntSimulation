package dk.mk.model.ants;

import dk.mk.model.ModelSettings;

import static dk.mk.model.ants.Brood.BroodStages.*;

public class Brood extends Ant {

    public enum BroodStages {EGG, LARVAE, PUPAE}

    private BroodStages currentStage = EGG;

    /** Evaluates this broods stage and evolves if needed. */
    private void evaluateStage(){
        switch (currentStage){
            case EGG: if (getLifetime() >= ModelSettings.brood_lifetime_egg)
                        currentStage = LARVAE;
                break;
            case LARVAE: if (getLifetime() >= ModelSettings.brood_lifetime_larvae)
                        currentStage = PUPAE;
                break;
            case PUPAE: if (getLifetime() >= ModelSettings.brood_lifetime_pupae)
                        System.out.println("This pupae is now an adult!");
                        //TODO trigger manager
                break;
        }
    }

    @Override
    public void addDeltaTime(float delta) {
        super.addDeltaTime(delta);
        evaluateStage();
    }
}
