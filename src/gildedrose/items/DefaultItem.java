package gildedrose.items;

import static gildedrose.GildedItems.SULFURAS_HAND_OF_RAGNAROS;

public class DefaultItem implements Item {

    public String name;
    public int sellIn;
    public int quality;


    public DefaultItem(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void updateQualityForItems() {
        if (!SULFURAS_HAND_OF_RAGNAROS.equals(this.name) && this.getQuality() > 0 ) {
            this.setQuality(this.getQuality() - 1);

            if (this.getQuality() > 0 && this.getSellIn() < 0) {
                this.setQuality(this.getQuality() - 1);
            }
        }
    }

    public void updateSellInForItems() {
        if (!SULFURAS_HAND_OF_RAGNAROS.equals(this.name)) {
            this.setSellIn(this.getSellIn() - 1);
        }
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

}
