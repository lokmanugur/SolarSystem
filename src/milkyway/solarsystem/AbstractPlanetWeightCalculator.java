
package milkyway.solarsystem;

/**
 * @author Lokman Ugur <lokman.ugur@hotmail.com>
 * 
 * This super class creates to calculate weight according to planet(subclasses) 
 */
public abstract class AbstractPlanetWeightCalculator {

    /**
     * Gravity values taken from following website
     * https://nssdc.gsfc.nasa.gov/planetary/factsheet/planet_table_ratio.html
     * @param weight
     * @param gravity
     * 
     * This methods multiply parameters
     * 
     * @return  double value
     */
    protected double calculateWeight(double weight,double gravity){
        return weight*gravity;
    }
}
