package gildedrose;

import gildedrose.items.Item;

import java.util.List;

public class GildedRose {

    private List<Item> items;

    public GildedRose(List<Item> items) {
        this.items = items;
    }

    public void adjustQualityAndSellinForItems() {

        for (Item item : items) {
            item.updateSellInForItems(item);
            item.updateQualityForItems(item);
        }

    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
