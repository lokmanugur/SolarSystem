/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milkyway.solarsystem;

/**
 *
 * @author Lokman Ugur <lokman.ugur@hotmail.com>
 */
public enum PlanetsGravityRatio {
    MERCURY (0.378),
    VENUS   (0.91),
    EARTH   (1),
    MOON    (0.166),
    MARS    (0.377),
    JUPITER (2.36),
    SATURN  (0.916),
    URANUS  (0.889),
    NEPTUNE (1.12),
    PLUTO   (0.071);

    private double ratio;
    
    
    private PlanetsGravityRatio(double ratio) {
        this.ratio = ratio;
    }
    
    public double getRatio(){
        return ratio;
    }
    
}
