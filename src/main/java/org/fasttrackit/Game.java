package org.fasttrackit;

import java.util.Scanner;


public class Game{

    public void start(){

        System.out.println("Welcome!");

        int playerCountFromUser = getPlayerCountFromUser();
    }
     private String getVehicleNameFromUser(){

        System.out.println("Please enter vechicle name: ");

        Scanner scanner = new Scanner(System.in);

        return scanner.next();
    }
    private int getPlayerCountFromUser(){

        System.out.println("Please enter the number of players: ");

        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

}



