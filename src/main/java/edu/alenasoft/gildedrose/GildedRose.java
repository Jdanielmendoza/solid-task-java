package edu.alenasoft.gildedrose;

import edu.alenasoft.gildedrose.ItemClases.CConjuredItem;
import edu.alenasoft.gildedrose.ItemClases.CConsumable;
import edu.alenasoft.gildedrose.ItemClases.CEquipment;
import edu.alenasoft.gildedrose.ItemClases.CLegendaryItem;
import edu.alenasoft.gildedrose.ItemClases.CTicket;
import java.util.ArrayList;
import java.util.List;

public class GildedRose {

    public static List<Item> items = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        CEquipment equipment = new CEquipment("+5 Dexterity Vest", 10, 20); 
        CConsumable consumableElixir = new CConsumable("Elixir of the Mongoose", 5, 7);
        CConsumable consumableAgedBrie = new CConsumable("Aged Brie", 2, 0);
        CLegendaryItem legendaryItem = new CLegendaryItem("Sulfuras, Hand of Ragnaros", 0, 80);
        CTicket ticket = new CTicket("Backstage passes to a TAFKAL80ETC concert", 15, 20); 
        CConjuredItem conjuredItem = new CConjuredItem("Conjured Mana Cake", 3, 6);
        
        items.add(equipment);
        items.add(consumableElixir);
        items.add(consumableAgedBrie);
        items.add(legendaryItem);
        items.add(ticket);
        items.add(conjuredItem);

        updateQuality();

        System.out.println(items);
    }

    public static void updateQuality() {
        for (int i = 0; i < items.size(); i++) {
            if ((!"Aged Brie".equals(items.get(i).getName()))
                    && !"Backstage passes to a TAFKAL80ETC concert".equals(items.get(i).getName())) {
                if (items.get(i).getQuality() > 0) {
                    if (!"Sulfuras, Hand of Ragnaros".equals(items.get(i).getName())) {
                        items.get(i).setQuality(items.get(i).getQuality() - 1);
                    }
                }
            } else {
                if (items.get(i).getQuality() < 50) {
                    items.get(i).setQuality(items.get(i).getQuality() + 1);

                    if ("Backstage passes to a TAFKAL80ETC concert".equals(items.get(i).getName())) {
                        if (items.get(i).getSellIn() < 11) {
                            if (items.get(i).getQuality() < 50) {
                                items.get(i).setQuality(items.get(i).getQuality() + 1);
                            }
                        }

                        if (items.get(i).getSellIn() < 6) {
                            if (items.get(i).getQuality() < 50) {
                                items.get(i).setQuality(items.get(i).getQuality() + 1);
                            }
                        }
                    }
                }
            }

            if (!"Sulfuras, Hand of Ragnaros".equals(items.get(i).getName())) {
                items.get(i).setSellIn(items.get(i).getSellIn() - 1);
            }

            if (items.get(i).getSellIn() < 0) {
                if (!"Aged Brie".equals(items.get(i).getName())) {
                    if (!"Backstage passes to a TAFKAL80ETC concert".equals(items.get(i).getName())) {
                        if (items.get(i).getQuality() > 0) {
                            if (!"Sulfuras, Hand of Ragnaros".equals(items.get(i).getName())) {
                                items.get(i).setQuality(items.get(i).getQuality() - 1);
                            }
                        }
                    } else {
                        items.get(i).setQuality(items.get(i).getQuality() - items.get(i).getQuality());
                    }
                } else {
                    if (items.get(i).getQuality() < 50) {
                        items.get(i).setQuality(items.get(i).getQuality() + 1);
                    }
                }
            }
        }
    }
}
