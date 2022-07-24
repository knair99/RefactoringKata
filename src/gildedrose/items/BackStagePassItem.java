package gildedrose.items;

public class BackStagePassItem extends Item {

    public BackStagePassItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQualityForItems(Item item) {
        if (itemQualityIsLessThan50(item)) {

            increaseItemQualityBy(item, 1);

            if (itemSellinIsLessThan(item, 0)) {
                item.setQuality(0);

            } else if (itemSellinIsLessThan(item, 6)) {
                increaseItemQualityBy(item, 2);

            } else if (itemSellinIsLessThan(item, 11)) {
                increaseItemQualityBy(item, 1);
            }
        }
    }
}
