/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.ProductTracking.Truck;

/**
 *
 * @author jayanti
 */
public class LogisticsManager {
 
    public Truck scheduleTruck(){
        Truck truck = new Truck();
        truck.setDriver();
        truck.setDestination();
        truck.setStartingLocation();
        return truck;
    }
}
