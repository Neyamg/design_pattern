package com.neya.pattern.iterator.entity;

import com.neya.pattern.iterator.impl.DinerMenuIterator;
import com.neya.pattern.iterator.intf.Menu;

import java.util.Iterator;
public class DinerMenu implements Menu {

    static int MAX_ITEMS = 10;
    private MenuItem[] menuItems;
    private int numberOfItems = 0;


    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT",
                "bacon with lettuce",
                true,
                2.99);
        addItem("BLT",
                "Simple BLT",
                false,
                3.22);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("menu items is full");
        }else {
            MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public Iterator createIterator() {
        Iterator iterator = new DinerMenuIterator(menuItems);
        return iterator;
    }

}
