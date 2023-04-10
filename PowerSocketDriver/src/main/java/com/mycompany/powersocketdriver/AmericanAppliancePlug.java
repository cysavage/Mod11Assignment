/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.powersocketdriver;

/**
 *AmericanAppliancePlug implements AmericanPlug class
 * @author cyril
 */

public class AmericanAppliancePlug implements APlug{

 
    public void Power() {
        System.out.println("This is a 220 volt appliance plug not the standard.");
    }
    
}
