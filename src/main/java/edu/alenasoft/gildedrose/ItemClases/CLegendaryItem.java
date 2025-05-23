/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.alenasoft.gildedrose.ItemClases;

import Interfaces.IItem;
import edu.alenasoft.gildedrose.Item;

/**
 *
 * @author jdani
 */
public class CLegendaryItem extends Item {

    public CLegendaryItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    //se elimino el metodo updateQuality por que es un item legendario que nunca cambia su valor "Quality"
}
