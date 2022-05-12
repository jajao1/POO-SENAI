
package com.senai;


public class Main {

    public static void main(String[] args) {
        NecTronalds necTronalds = new NecTronalds();

        NecTronalds.createRestaurant("BK", "Brasil");
        NecTronalds.getRestaurant("BK", "Brasil").getMenu().addItem("\n" + "WHOPPER® Barbecue Bacon", "Mais pedido!", 15.99F);
        NecTronalds.getRestaurant("BK", "Brasil").getMenu().addItem("Mega Stacker 2.0", "Leve, simples e delicioso!", 13.99F);
        NecTronalds.getRestaurant("BK", "Brasil").getMenu().addItem("Chicken Crisp Barbecue Bacon", "Melhor da casa!", 18.99F);

        NecTronalds.createRestaurant("PatoBuguer", "Brasil");
        NecTronalds.getRestaurant("PatoBuguer", "Brasil").getMenu().addItem("Applewood Bacon", "Mais pedido!", 15.99F);
        NecTronalds.getRestaurant("PatoBuguer", "Brasil").getMenu().addItem("MEGA-BACON", "Leve, simples e delicioso!", 13.99F);
        NecTronalds.getRestaurant("PatoBuguer", "Brasil").getMenu().addItem("X-Tudo", "Melhor da casa!", 18.99F);


        NecTronalds.printRestaurants();
        NecTronalds.printRestaurantsFilterName("BK");
        NecTronalds.printRestaurantsFilterCountry("Brasil");
    }
}