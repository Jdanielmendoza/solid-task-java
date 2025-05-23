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

    @Override
    public void updateQuality() {
        if (!this.isQualityNegative()) {//El quality no puede ser negativo!
            this.setSellIn(this.getSellIn() - 1);
            int aux = +1;
            if(this.getSellIn()> 5 && this.getSellIn()<= 10) aux = +2; 
            if(this.getSellIn()> 0 && this.getSellIn()<= 5) aux = +3; 
            if(this.getQuality() <= 50){
                this.setQuality(this.getQuality() + aux);
            }else{
                this.setQuality(50);
            }
        }
    }

}
