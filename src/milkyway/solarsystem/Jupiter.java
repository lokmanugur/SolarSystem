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
public class Jupiter extends AbstractPlanetWeightCalculator implements CalculateWeightStrategy{
    
    private final double GRAVITY = 2.36;

    @Override
    public double calculate(double weight) {
        return calculateWeight(weight, GRAVITY);
    }
    
}
