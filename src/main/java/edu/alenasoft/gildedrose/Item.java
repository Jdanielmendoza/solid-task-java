package edu.alenasoft.gildedrose;

public class Item {

    private String name;
    private int sellIn;
    private int quality;

    public Item(String name, int sellIn, int quality) {
        if (quality < 0) {
            throw new Error("El quality no puede ser negativo!");
        } else {
            this.setQuality(quality);
        }
        this.setName(name);
        this.setSellIn(sellIn);
        
    }
    public Item(Item newItem) {
        if (newItem.getQuality() < 0) {
            throw new Error("El quality no puede ser negativo!");
        } else {
            this.setQuality(newItem.getQuality());
        }
        this.setName(newItem.getName());
        this.setSellIn(newItem.getSellIn());
        
    }

    /* Generated getter and setter code */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public boolean isQualityNegative() {  //El Quality de un ítem nunca es un número negativo.
        return this.quality < 0;
    }

    @Override
    public String toString() {
        return "Item{" + "name='" + name + '\'' + ", sellIn=" + sellIn + ", quality=" + quality + '}' + "\n";
    }
}
