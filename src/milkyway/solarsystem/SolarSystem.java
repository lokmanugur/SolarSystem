
package milkyway.solarsystem;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Lokman Ugur <lokman.ugur@hotmail.com>
 * 
 *In this project used a Strategy, strategy is a behavioral design pattern let es you define a algorithm
 * into separate class and make objects interchangeable 
 * 
 */
public class SolarSystem {
    
    private Map<String,CalculateWeightStrategy> planets;
    private double weightOnEarth;
    
    /**
     * This method take one parameter that is class name in String and then calculate
     * return weight of class
     * 
     * @param planetName
     * @return double value
     * 
     */
    public double calculateWeight(String planetName){
        return getPlanets(planetName).calculate(weightOnEarth) ;
    }
    
    /**
     * This method take two parameter; planetName and weightOnEarth then 
     * calculate specific value according to planetName and return double value specific weight
     *
     * @param planetName
     * @param weightOnEarth
     * @return 
     */
    public double calculateWeight(String planetName,double weightOnEarth){
        return getPlanets(planetName).calculate(weightOnEarth) ;
    }
    
    /**
     *This method return values inside mapper if the is no exist value in the mapper
     * than create them and return name according to key value
     * @param planet
     * @return 
     */
    
    private CalculateWeightStrategy getPlanets(String planet){ 
        if(planetsIsNull()){
            createPlanets();
            addPlanetEntries();
        }
        return planets.get(planet);
    }
    
    private void addPlanetEntries(){
        planets.put("Mercury", new Mercury());
        planets.put("Venus", new Venus());
        planets.put("Earth", new Earth());
        planets.put("Moon", new Moon());
        planets.put("Mars", new Mars());
        planets.put("Jupiter", new Jupiter());
        planets.put("Saturn", new Saturn());
        planets.put("Uranus", new Uranus());
        planets.put("Neptune", new Neptune());
        planets.put("Pluto", new Pluto());
    }
    
    /**
     * The method create new instance of HashMap object
     */
    private void createPlanets(){
        planets = new HashMap<>();
    }
    /**
     * the method return boolean value according to created instance object
     * if there is no created object return false
     * @return 
     */
    
    private boolean planetsIsNull(){
        return planets==null;
    }
    /**
     * Set value to weightOnEart variable, this value using by all of subclass of AbstractPlanetWeightCalculator  
     * @param weightOnEarth 
     */
    public void setWeightOnEarth(double weightOnEarth) {
        this.weightOnEarth = weightOnEarth;
    }
    
    
}
