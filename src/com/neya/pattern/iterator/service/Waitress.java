package com.neya.pattern.iterator.service;

import com.neya.pattern.iterator.entity.MenuItem;
import com.neya.pattern.iterator.intf.Menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    Menu cafeMenu;

    List<Menu> menuList = new ArrayList<>();

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public Waitress(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public void printMenu() {
        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator dinerMenuIterator = dinerMenu.createIterator();
        Iterator cafeIterator = cafeMenu.createIterator();
        System.out.println("=======PANCAKE HOUSE MENU==========");
        printMenu(pancakeHouseMenuIterator);
        System.out.println("=======DINER MENU=========");
        printMenu(dinerMenuIterator);
        System.out.println("=======CAFE MENU==========");
        printMenu(cafeIterator);


    }

    public void printMenuList() {
        for (Menu menu : menuList) {
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem);
        }
    }
}
