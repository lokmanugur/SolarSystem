package milkyway.solarsystem;

/**
 *
 * @author Lokman Ugur <lokman.ugur@hotmail.com>
 * 
 */
public class Earth extends AbstractPlanetWeightCalculator implements CalculateWeightStrategy{

    private final double GRAVITY = PlanetsGravityRatio.valueOf("EARTH").getRatio();

    
    @Override
    public double calculate(double weight) {
        return calculateWeight(weight, GRAVITY);
    }
    
}
