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
public class Test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem();
        solarSystem.setWeightOnEarth(200);

        System.out.println(solarSystem.calculateWeight("Mercury"));
        System.out.println(solarSystem.calculateWeight("Venus"));
        System.out.println(solarSystem.calculateWeight("Earth"));
        System.out.println(solarSystem.calculateWeight("Moon",70));
        System.out.println(solarSystem.calculateWeight("Mars"));
        System.out.println(solarSystem.calculateWeight("Jupiter"));
        System.out.println(solarSystem.calculateWeight("Saturn"));
        System.out.println(solarSystem.calculateWeight("Uranus",50));
        System.out.println(solarSystem.calculateWeight("Neptune",500));
        System.out.println(solarSystem.calculateWeight("Pluto",100));
    }
    
}
