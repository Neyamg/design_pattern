package com.neya.pattern.iterator.impl;

import com.neya.pattern.iterator.entity.MenuItem;
import com.neya.pattern.iterator.intf.Iterator;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {

    private List<MenuItem> menuItems;

    private int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
    /**
     * @return
     */
    @Override
    public boolean hasNext() {
        return position < menuItems.size();
    }

    /**
     * @return
     */
    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}
