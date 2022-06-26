package rotorCalculator.data.rotorModel;

import org.jetbrains.annotations.Nullable;
import rotorCalculator.data.constants.Environment;

import java.util.Objects;

// TODO: add javadoc
public class Preferences {
    public double gForce; // acceleration [g's]

    public Preferences(@Nullable Environment environment) {
        switch (Objects.requireNonNullElse(environment, Environment.ROUGH)) {
            case MOON : {
                gForce = 0.1654;
                break;
            }
            case SI_STANDARD, ROUGH :
            default : {
                gForce = 1.00;
            }
        }
    }
}