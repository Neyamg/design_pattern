package com.neya.pattern.iterator.impl;

import com.neya.pattern.iterator.entity.MenuItem;
import java.util.Iterator;

public class DinerMenuIterator implements Iterator {

    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
        this.position = 0;
    }

    /**
     * @return
     */
    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        }
        return true;
    }

    /**
     * @return
     */
    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}
