package com.senai;

public class Restaurant
{
    private Menu m_menu;
    private String m_country;
    private String m_name;

    Restaurant()
    {
        m_menu = new Menu();
        m_name = "";
        m_country = "";
    }

    Restaurant(String name, String country)
    {
        m_menu = new Menu();
        m_name = name;
        m_country = country;
    }

    public Menu getMenu() { return m_menu;}

    public String getCountry() { return m_country; }

    public String getName() { return m_name; }

    /*
    public void insertFood(Food food) { m_menu.addItem(food); }
    public void insertFood(String name, String description, float price){ m_menu.addItem(name, description, price); }
    public void removeFood(String itemName) { m_menu.removeItem(itemName); }
    public Food getFood(int index) { return m_menu.getItem(index); }
    public Food getFood(String name) { return m_menu.getItem(name); }
    */
}