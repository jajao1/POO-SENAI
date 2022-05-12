package com.senai;
import java.util.ArrayList;

public class Menu
{
    private ArrayList<Food> m_menu;

    Menu(){ m_menu = new ArrayList<Food>(); }

    Menu(String name, String description, float price)
    {
        m_menu = new ArrayList<>();
        m_menu.add(new Food(name, description, price));
    }

    public void addItem(Food food) { m_menu.add(food); }

    public void addItem(String name, String description, float price) { m_menu.add(new Food(name, description, price)); }

    public void removeItem(String name)
    {
        for (int i = 0; i < m_menu.size(); i++)
            if (m_menu.get(i).getName().equals(name))
                m_menu.remove(i);

    }

    public Food getItem(String name)
    {
        for (int i = 0; i < m_menu.size(); i++)
            if (m_menu.get(i).getName().equals(name))
                return m_menu.get(i);
        return new Food();
    }

    public Food getItem(int index) { return m_menu.get(index); }

    public int getSize() { return m_menu.size(); }

    public void printMenu()
    {
        for (int i = 0; i < m_menu.size(); i++)
        {
            System.out.println("Name: " + m_menu.get(i).getName());
            System.out.println("Description: " + m_menu.get(i).getDescription());
            System.out.println("Price: " + m_menu.get(i).getPrice());
            System.out.println('\n');
        }
    }

}