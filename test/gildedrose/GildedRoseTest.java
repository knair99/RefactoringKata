package gildedrose;

import gildedrose.items.Item;
import gildedrose.items.ItemFactory;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {
    public final String randomItemName = "Random item 1";
    public final int randomSellin = 5;
    public final int randomQuality = 49;
    GildedRose gildedRose;
    List<Item> items;
    String message = "TESTING: ";

    @Before
    public void setUp() {
        items = new ArrayList<Item>();
        gildedRose = new GildedRose(items);
    }

    @Test
    public void testQualityUpdateOnRandomItem() {
        Item item = getNewItem(randomItemName, randomSellin, randomQuality);
        items.add(item);
        gildedRose.adjustQualityAndSellinForItems();

        assertEquals(message + " Quality ", randomQuality - 1, item.getQuality());
        assertEquals(message + " SellIn", randomSellin - 1, item.getSellIn());
    }


    @Test
    public void testAgedBrieItemWithLowQuality() {
        String itemName = GildedItems.AGED_BRIE;
        int quality = 10;
        int sellin = 10;

        Item item = getNewItem(itemName, sellin, quality);
        gildedRose.setItems(new ArrayList<>(Collections.singleton(item)));
        gildedRose.adjustQualityAndSellinForItems();

        assertEquals(message + " Quality ", quality + 1, item.getQuality());
        assertEquals(message + " SellIn", sellin - 1, item.getSellIn());
    }


    @Test
    public void testAgedBrieItemWithHighQuality() {
        String itemName = GildedItems.AGED_BRIE;
        int quality = 60;
        int sellin = 10;

        Item item = getNewItem(itemName, sellin, quality);
        gildedRose.setItems(new ArrayList<>(Collections.singleton(item)));
        gildedRose.adjustQualityAndSellinForItems();

        assertEquals(message + " Quality ", quality, item.getQuality());
        assertEquals(message + " SellIn", sellin - 1, item.getSellIn());
    }

    @Test
    public void testBackStagePassItemWithLowQualityAndHighSellIn() {
        String itemName = GildedItems.BACKSTAGE_PASSES_TO_CONCERT;
        int quality = 10;
        int sellin = 7;

        Item item = getNewItem(itemName, sellin, quality);
        gildedRose.setItems(new ArrayList<>(Collections.singleton(item)));
        gildedRose.adjustQualityAndSellinForItems();

        assertEquals(message + " Quality ", quality + 2, item.getQuality());
        assertEquals(message + " SellIn", sellin - 1, item.getSellIn());
    }

    @Test
    public void testBackStagePassItemWithLowQualityAndLowSellIn() {
        String itemName = GildedItems.BACKSTAGE_PASSES_TO_CONCERT;
        int quality = 10;
        int sellin = 4;

        Item item = getNewItem(itemName, sellin, quality);
        gildedRose.setItems(new ArrayList<>(Collections.singleton(item)));
        gildedRose.adjustQualityAndSellinForItems();

        assertEquals(message + " Quality ", quality + 3, item.getQuality());
        assertEquals(message + " SellIn", sellin - 1, item.getSellIn());
    }


    @Test
    public void testBackStagePassItemWithHighQualityAndHighSellIn() {
        String itemName = GildedItems.BACKSTAGE_PASSES_TO_CONCERT;
        int quality = 10;
        int sellin = 10;

        Item item = getNewItem(itemName, sellin, quality);
        gildedRose.setItems(new ArrayList<>(Collections.singleton(item)));
        gildedRose.adjustQualityAndSellinForItems();

        assertEquals(message + " Quality ", quality + 2, item.getQuality());
        assertEquals(message + " SellIn", sellin - 1, item.getSellIn());
    }

    @Test
    public void testBackStagePassItemWithHighQualityAndLowSellIn() {
        String itemName = GildedItems.BACKSTAGE_PASSES_TO_CONCERT;
        int quality = 10;
        int sellin = 4;

        Item item = getNewItem(itemName, sellin, quality);
        gildedRose.setItems(new ArrayList<>(Collections.singleton(item)));
        gildedRose.adjustQualityAndSellinForItems();

        assertEquals(message + " Quality ", quality + 3, item.getQuality());
        assertEquals(message + " SellIn", sellin - 1, item.getSellIn());
    }


    @Test
    public void testBackStagePassItemWithHighQualityAndHighestSellIn() {
        String itemName = GildedItems.BACKSTAGE_PASSES_TO_CONCERT;
        int quality = 10;
        int sellin = 12;

        Item item = getNewItem(itemName, sellin, quality);
        gildedRose.setItems(new ArrayList<>(Collections.singleton(item)));
        gildedRose.adjustQualityAndSellinForItems();

        assertEquals(message + " Quality ", quality + 1, item.getQuality());
        assertEquals(message + " SellIn", sellin - 1, item.getSellIn());
    }


    @Test
    public void testBackStagePassItemWithHighestQualityAndHighestSellIn() {
        String itemName = GildedItems.BACKSTAGE_PASSES_TO_CONCERT;
        int quality = 60;
        int sellin = 12;

        Item item = getNewItem(itemName, sellin, quality);
        gildedRose.setItems(new ArrayList<>(Collections.singleton(item)));
        gildedRose.adjustQualityAndSellinForItems();

        assertEquals(message + " Quality ", quality, item.getQuality());
        assertEquals(message + " SellIn", sellin - 1, item.getSellIn());
    }

    @Test
    public void testBackStagePassItemWithHighestQualityAndLowSellIn() {
        String itemName = GildedItems.BACKSTAGE_PASSES_TO_CONCERT;
        int quality = 60;
        int sellin = 10;

        Item item = getNewItem(itemName, sellin, quality);
        gildedRose.setItems(new ArrayList<>(Collections.singleton(item)));
        gildedRose.adjustQualityAndSellinForItems();

        assertEquals(message + " Quality ", quality, item.getQuality());
        assertEquals(message + " SellIn", sellin - 1, item.getSellIn());
    }

    @Test
    public void testBackStagePassItemWithHighestQualityAndLowestSellIn() {
        String itemName = GildedItems.BACKSTAGE_PASSES_TO_CONCERT;
        int quality = 60;
        int sellin = 4;

        Item item = getNewItem(itemName, sellin, quality);
        gildedRose.setItems(new ArrayList<>(Collections.singleton(item)));
        gildedRose.adjustQualityAndSellinForItems();

        assertEquals(message + " Quality ", quality, item.getQuality());
        assertEquals(message + " SellIn", sellin - 1, item.getSellIn());
    }


    @Test
    public void testRandomItemWithHighQuality() {
        String itemName = "RandomItemName";
        int quality = 60;
        int sellin = 4;

        Item item = getNewItem(itemName, sellin, quality);
        gildedRose.setItems(new ArrayList<>(Collections.singleton(item)));
        gildedRose.adjustQualityAndSellinForItems();

        assertEquals(message + " Quality ", quality - 1, item.getQuality());
        assertEquals(message + " SellIn", sellin - 1, item.getSellIn());
    }


    @Test
    public void testRandomItemWithNegativeSellinButHighQuality() {
        String itemName = "Random Item 1";
        int quality = 60;
        int sellin = -1;

        Item item = getNewItem(itemName, sellin, quality);
        gildedRose.setItems(new ArrayList<>(Collections.singleton(item)));
        gildedRose.adjustQualityAndSellinForItems();

        assertEquals(message + " Quality ", quality - 2, item.getQuality());
        assertEquals(message + " SellIn", sellin - 1, item.getSellIn());
    }


    @Test
    public void testRandomItemWithNegativeSellinAndNegativeQuality() {
        String itemName = "Random Item 1";
        int quality = -1;
        int sellin = -1;

        Item item = getNewItem(itemName, sellin, quality);
        gildedRose.setItems(new ArrayList<>(Collections.singleton(item)));
        gildedRose.adjustQualityAndSellinForItems();

        assertEquals(message + " Quality ", quality, item.getQuality());
        assertEquals(message + " SellIn", sellin - 1, item.getSellIn());
    }

    @Test
    public void testRandomItemWithNegativeSellinAndPositiveQuality() {
        String itemName = "Random Item 1";
        int quality = 1;
        int sellin = -1;

        Item item = getNewItem(itemName, sellin, quality);
        gildedRose.setItems(new ArrayList<>(Collections.singleton(item)));
        gildedRose.adjustQualityAndSellinForItems();

        assertEquals(message + " Quality ", quality - 1, item.getQuality());
        assertEquals(message + " SellIn", sellin - 1, item.getSellIn());
    }

    @Test
    public void testAgedBrieWithNegativeSellinAndPositiveQuality() {
        String itemName = GildedItems.AGED_BRIE;
        int quality = 1;
        int sellin = -1;

        Item item = getNewItem(itemName, sellin, quality);
        gildedRose.setItems(new ArrayList<>(Collections.singleton(item)));
        gildedRose.adjustQualityAndSellinForItems();

        assertEquals(message + " Quality ", quality + 2, item.getQuality());
        assertEquals(message + " SellIn", sellin - 1, item.getSellIn());
    }

    @Test
    public void testAgedBrieWithNegativeSellinAndHighestQuality() {
        String itemName = GildedItems.AGED_BRIE;
        int quality = 60;
        int sellin = -1;

        Item item = getNewItem(itemName, sellin, quality);
        gildedRose.setItems(new ArrayList<>(Collections.singleton(item)));
        gildedRose.adjustQualityAndSellinForItems();

        assertEquals(message + " Quality ", quality, item.getQuality());
        assertEquals(message + " SellIn", sellin - 1, item.getSellIn());
    }

    @Test
    public void testBackstagePassWithNegativeSellinAndPositiveQuality() {
        String itemName = GildedItems.BACKSTAGE_PASSES_TO_CONCERT;
        int quality = 1;
        int sellin = -1;

        Item item = getNewItem(itemName, sellin, quality);
        gildedRose.setItems(new ArrayList<>(Collections.singleton(item)));
        gildedRose.adjustQualityAndSellinForItems();

        assertEquals(message + " Quality ", 0, item.getQuality());
        assertEquals(message + " SellIn", sellin - 1, item.getSellIn());
    }

    private Item getNewItem(String itemName, int sellIn, int quality) {
        return ItemFactory.createItem(itemName, sellIn, quality);
    }
}
