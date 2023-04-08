/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package garment;

/**
 * Main Interface for Garment Factory
 * @author cyril
 */
public interface GarmentFactory {
    Top createTop();
    Pants createPants();
    Shoes createShoes();
}
