package com.senai;

public class Food
{
    private String m_name;
    private String m_description;
    private float m_price;

    Food()
    {
        m_name = "";
        m_description = "";
        m_price = 0.00F;
    }

    Food(String name, String description, float price)
    {
        m_name = name;
        m_description = description;
        m_price = price;
    }
    // Setters
    public void setName(String name) { m_name = name; }

    public void setDescription(String description) { m_description = description; }

    public void setPrice(float price) { m_price = price; }

    // Getters
    public String getName() { return m_name; }

    public String getDescription() { return m_description; }

    public float getPrice() { return m_price; }
}