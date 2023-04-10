/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.powersocketdriver;

/**
 *Driver Class - creates objects for APlug, EuroPowerSocket, and EuroPlug class implementation
 * @author cyril
 */
public class PowerSocketDriver {
    
    public static void main(String[] args) {
        
        APlug usaPlug = new AmericanAppliancePlug();
        
        EuroPowerSocket eSocket= new EuroPowerSocket();
        EuroPlug ePlug= new AmericanEuroPAdapter(usaPlug);
        
        eSocket.plugIn(ePlug);
    }
    
}