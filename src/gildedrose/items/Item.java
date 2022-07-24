package gildedrose.items;

public interface Item {

    public abstract void updateQualityForItems();

    public abstract void updateSellInForItems();

    int getQuality();

    int getSellIn();
}
