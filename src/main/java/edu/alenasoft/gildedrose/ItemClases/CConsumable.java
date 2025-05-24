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
public class CConsumable extends Item implements IItem {// AGED BRIE ITEM

    public CConsumable(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    public CConsumable(CConsumable consumableObject) {
        super(consumableObject);
    }

    @Override
    public void updateQuality() {
        if (!this.isQualityNegative()) {//El quality no puede ser negativo!
            if(this.getQuality() <= 50){
                this.setQuality(this.getQuality() + 1);
            }else{
                this.setQuality(50);
            }
            this.setSellIn(this.getSellIn() - 1);
        }
    }

}
