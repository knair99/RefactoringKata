package gildedrose.items;

public class AgedBrieItem extends DefaultItem {

    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQualityForItems() {

        if (this.getQuality() < 50) {
            this.setQuality(this.getQuality() + 1);

            if (this.getSellIn() < 0) {
                this.setQuality(this.getQuality() + 1);
            }
        }

    }

}
