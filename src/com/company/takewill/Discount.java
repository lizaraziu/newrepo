package com.company.takewill;

public class Discount {




    public void calcDiscount(int total, String customer) {

        if (customer == "Nonprofits") {

            if (total < 900) {
                System.out.println(customer + " customers get 10% discount");
            } else {
                System.out.println(customer + " customers get 5% discount");
            }
        } else if (customer == "Privet") {

            if (total > 900) {
                System.out.println(customer + " customers get 7% discount");
            } else {
                System.out.println(customer + " customers get 0% discount");
            }
        } else if (customer == "Corporation") {

            if (total > 500) {
                System.out.println(customer + " customers get 8% discount");
            } else {
                System.out.println(customer + " customers get 5% discount");
            }

        }
    }

}


