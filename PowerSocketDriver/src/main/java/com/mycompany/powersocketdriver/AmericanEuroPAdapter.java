/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.powersocketdriver;

/**
 *American to European Power Plug Adapter Class that implements EuroPlug Class
 * @author cyril
 */
public class AmericanEuroPAdapter implements EuroPlug{
    
    private APlug plug;

    public AmericanEuroPAdapter(APlug plug){
        this.plug= plug;
        
    }
 
    @Override
    public void Power() {
            plug.Power();

    }
    
    
}