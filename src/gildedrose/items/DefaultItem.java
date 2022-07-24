package gildedrose.items;

import static gildedrose.GildedItems.SULFURAS_HAND_OF_RAGNAROS;

public class DefaultItem extends Item {
    public DefaultItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQualityForItems(Item item) {
        if (!SULFURAS_HAND_OF_RAGNAROS.equals(item.getName()) && itemQualityIsGreaterThan(item, 0)) {
            decreaseItemQualityBy(item, 1);

            if (itemQualityIsGreaterThan(item, 0) && itemSellinIsLessThan(item, 0)) {
                decreaseItemQualityBy(item, 1);
            }
        }
    }
}
