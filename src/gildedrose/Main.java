package gildedrose;

import gildedrose.items.Item;
import gildedrose.items.ItemFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

	private static List<Item> items = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		items = new ArrayList<Item>();
		items.add(ItemFactory.createItem("+5 Dexterity Vest", 10, 20));
		items.add(ItemFactory.createItem("Aged Brie", 2, 0));
		items.add(ItemFactory.createItem("Elixir of the Mongoose", 5, 7));
		items.add(ItemFactory.createItem("Sulfuras, Hand of Ragnaros", 0, 80));
		items.add(ItemFactory.createItem("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		items.add(ItemFactory.createItem("Conjured Mana Cake", 3, 6));

		GildedRose gildedRose = new GildedRose(items);
		gildedRose.adjustQualityAndSellinForItems();
	}
}