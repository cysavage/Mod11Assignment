/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package garment;
import garment.*;

/**
 *
 * @author cyril
 */
public class Mod10GarmentFactory {
    public static void client(GarmentFactory factory) {
        Top top = factory.createTop();
        Pants pants = factory.createPants();
        Shoes shoes = factory.createShoes();

        // Do something with the garments
        top.print();
        pants.print();
        shoes.print();
    }

    public void run() {
        // Create garments for the professional variant
        GarmentFactory factory1 = new ProfessionalGarmentFactory();
        client(factory1);

        // Create garments for the casual variant
        GarmentFactory factory2 = new CasualGarmentFactory();
        client(factory2);

        // Create garments for the party variant
        GarmentFactory factory3 = new PartyGarmentFactory();
        client(factory3);
    }
 
}

