package com.neya.pattern.iterator.entity;

import com.neya.pattern.iterator.impl.PancakeHouseMenuIterator;
import com.neya.pattern.iterator.intf.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {

    private List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("RB's pancake breakfast",
                "Pancake with scrambled eggs",
                true,
                2.77);
        addItem("Regular pancake breakfast",
                "Pancake with fried eggs, sausage",
                false,
                2.99
                );
        addItem("BlueBa=erry Pancake",
                "Pancake made with fresh blueberries",
                false,
                3.01);
        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
