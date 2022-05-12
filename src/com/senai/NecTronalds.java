package com.senai;

import java.util.ArrayList;

public class NecTronalds {

    private ArrayList<Restaurant> m_chain;

    NecTronalds() { m_chain = new ArrayList<>(); }

    public static void createRestaurant(String name, String country) { m_chain.add(new Restaurant(name, country)); }

    public static Restaurant getRestaurant(String name, String country)
    {
        for (int i = 0; i < m_chain.size(); i ++)
        {
            if (m_chain.get(i).getName().equals(name) && m_chain.get(i).getCountry().equals(country))
                return m_chain.get(i);
        }
        return new Restaurant();
    }

    public void removeRestaurant (String name, String country)
    {
        for (int i = 0; i < m_chain.size(); i ++)
        {
            if (m_chain.get(i).getName().equals(name) && m_chain.get(i).getCountry().equals(country))
                m_chain.remove(i);
        }
    }

    public static void printRestaurants()
    {
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < m_chain.size(); i++)
        {
            System.out.println("Restaurant " + m_chain.get(i).getName() + " | " + m_chain.get(i).getCountry());
            System.out.println("Menu: ");
            for (int j = 0; j < m_chain.get(i).getMenu().getSize(); j++)
            {
                System.out.println("\t" + "Name: " + m_chain.get(i).getMenu().getItem(j).getName());
                System.out.println("\t" + "Description: " + m_chain.get(i).getMenu().getItem(j).getDescription());
                System.out.println("\t" + "Price: " + m_chain.get(i).getMenu().getItem(j).getPrice());
                System.out.print('\n');
            }
            System.out.print('\n');
        }
        System.out.println("--------------------------------------------------");
    }

    public static void printRestaurantsFilterName(String name)
    {
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < m_chain.size(); i++)
        {
            if (m_chain.get(i).getName().equals(name))
            {
                System.out.println("Restaurant " + m_chain.get(i).getName() + " | " + m_chain.get(i).getCountry());
                System.out.println("Menu: ");
                for (int j = 0; j < m_chain.get(i).getMenu().getSize(); j++)
                {
                    System.out.println("\t" + "Name: " + m_chain.get(i).getMenu().getItem(j).getName());
                    System.out.println("\t" + "Description: " + m_chain.get(i).getMenu().getItem(j).getDescription());
                    System.out.println("\t" + "Price: " + m_chain.get(i).getMenu().getItem(j).getPrice());
                    System.out.print('\n');
                }
                System.out.print('\n');
            }
        }
        System.out.println("--------------------------------------------------");
    }

    public static void printRestaurantsFilterCountry(String country)
    {
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < m_chain.size(); i++)
        {
            if (m_chain.get(i).getCountry().equals(country))
            {
                System.out.println("Restaurant " + m_chain.get(i).getName() + " | " + m_chain.get(i).getCountry());
                System.out.println("Menu: ");
                for (int j = 0; j < m_chain.get(i).getMenu().getSize(); j++)
                {
                    System.out.println("\t" + "Name: " + m_chain.get(i).getMenu().getItem(j).getName());
                    System.out.println("\t" + "Description: " + m_chain.get(i).getMenu().getItem(j).getDescription());
                    System.out.println("\t" + "Price: " + m_chain.get(i).getMenu().getItem(j).getPrice());
                    System.out.print('\n');
                }
                System.out.print('\n');
            }
        }
        System.out.println("--------------------------------------------------");
    }
}
