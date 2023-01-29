package com.neya.pattern.iterator.test;

import com.neya.pattern.iterator.entity.CafeMenu;
import com.neya.pattern.iterator.entity.DinerMenu;
import com.neya.pattern.iterator.entity.PancakeHouseMenu;
import com.neya.pattern.iterator.intf.Menu;
import com.neya.pattern.iterator.service.Waitress;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestWaitress {
    @Test
    public void testPrintMenu(){
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }

    @Test
    public void testPrintMenu2() {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(new ArrayList<Menu>(){
            {
                add(pancakeHouseMenu);
                add(dinerMenu);
                add(cafeMenu);
            };
        });
        waitress.printMenuList();
    }
}
