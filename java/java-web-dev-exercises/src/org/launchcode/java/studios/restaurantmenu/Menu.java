package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    //class variables
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    //constructor
    public Menu(){
        this.lastUpdated = new Date();
    }

    //methods

    //getters and setters

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
