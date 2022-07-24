package gildedrose.items;

public class AgedBrieItem extends Item {

    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQualityForItems(Item item) {

        if (itemQualityIsLessThan50(item)) {
            increaseItemQualityBy(item, 1);

            if (itemSellinIsLessThan(item, 0)) {
                increaseItemQualityBy(item, 1);
            }
        }

    }

}
