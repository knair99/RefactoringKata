package gildedrose.items;

import gildedrose.GildedItems;

public class ItemFactory {

    public static Item createItem(String itemName, int sellin, int quality) {

        if (GildedItems.BACKSTAGE_PASSES_TO_CONCERT.equals(itemName)) {

            return new BackStagePassItem(itemName, sellin, quality);

        } else if (GildedItems.AGED_BRIE.equals(itemName)) {

            return new AgedBrieItem(itemName, sellin, quality);

        } else {

            return new DefaultItem(itemName, sellin, quality);
        }
    }
}
