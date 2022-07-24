package gildedrose.items;

import static gildedrose.GildedItems.SULFURAS_HAND_OF_RAGNAROS;

public class Item {
    public String name;
    public int sellIn;
    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.setName(name);
        this.setSellIn(sellIn);
        this.setQuality(quality);
    }

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

    private void decreaseItemSellIn(Item item) {
        item.setSellIn(item.getSellIn() - 1);
    }

    protected void decreaseItemQualityBy(Item item, int quantity) {
        item.setQuality(item.getQuality() - quantity);
    }

    protected boolean itemQualityIsGreaterThan(Item item, int quantity) {
        return item.getQuality() > quantity;
    }

    protected boolean itemSellinIsLessThan(Item item, int quantity) {
        return item.getSellIn() < quantity;
    }

    protected void increaseItemQualityBy(Item item, int quantity) {
        item.setQuality(item.getQuality() + quantity);
    }

    protected boolean itemQualityIsLessThan50(Item item) {
        return item.getQuality() < 50;
    }

    public void updateQualityForItems(Item item) {
    }

    public void updateSellInForItems(Item item) {
        if (!SULFURAS_HAND_OF_RAGNAROS.equals(item.getName())) {
            decreaseItemSellIn(item);
        }
    }
}
