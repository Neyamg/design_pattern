package com.neya.pattern.iterator.entity;

import com.neya.pattern.iterator.intf.Menu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {

    Map<String, MenuItem> itemMap = new HashMap<>();

    /**
     * @return
     */
    @Override
    public Iterator createIterator() {
        return itemMap.values().iterator();
    }

    public CafeMenu() {
        addItem("Veggie burger",
                "Veggie burger on a whole wheat bun",
                true,
                3.99);
        addItem("Soup of the day",
                "a cup of soup of the day",
                false,
                3.4);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        itemMap.put(menuItem.getName(), menuItem);
    }
}
