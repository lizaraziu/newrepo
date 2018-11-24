package com.company;

public class MarketManager {



    static Item mostExpensivePrice(Market market) {

            Item max = market.items[0];

            for (int i = 0; i < market.itemsLength; i++) {

                if (max.price < market.items[i].price) {

                    max = market.items[i];
            }
        }
        return max;
    }

    public static double getAveragePrice(Market market) {

        //2.A method that takes as parameter a Market and returns the average price of Items from the market


        double sum = 0;

        double average;

            int x = 0;

            for (int i = 0; i < market.itemsLength; i++) {

                sum = sum + market.items[i].price;

                average = sum / market.itemsLength;

                x = (int) average;

            }
        return x;
    }

    public static void ReplaceItem(Market market,Item item, int index) {


        if (index >= 0 && index < market.items.length) {
            market.items[index] = item;
        }else{
            System.out.println(index + " nu poate fi negativ");
        }

    }

}


