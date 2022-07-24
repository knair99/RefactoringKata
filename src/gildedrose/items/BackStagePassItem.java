package gildedrose.items;

public class BackStagePassItem extends DefaultItem {

    public BackStagePassItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQualityForItems() {
        if (this.getQuality() < 50) {

            this.setQuality(this.getQuality() + 1);

            if (this.getSellIn() < 0) {
                this.setQuality(0);

            } else if (this.getSellIn() < 6) {
                this.setQuality(this.getQuality() + 2);

            } else if (this.getSellIn() < 11) {
                this.setQuality(this.getQuality() + 1);
            }
        }
    }
}
