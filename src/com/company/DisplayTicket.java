package com.company;

import java.util.Scanner;

public class DisplayTicket {
    public static void main(String[] args) {


        Ticket ticket = new Ticket();


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ticket number: ");
        int number = input.nextInt();

        ticket.setNumber(number);

        if(ticket.isLucky()) {

            System.out.println("You Won! ");

        }else {

            System.out.println( ticket.getNumber() + " is not lucky :( try another one");
        }

        }


    }


