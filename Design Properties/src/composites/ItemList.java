package composites;

import java.util.ArrayList;

public class ItemList {
	private ArrayList<Item> list;
	
	public ItemList() {
		list = new ArrayList<Item>();
	}
	
	public void add(Item item) {
		list.add(item);
	}
	public void printAllItems() {
		for(int i= 0; i < list.size(); i++) {
			list.get(i).print();
		
		}
	}

}
