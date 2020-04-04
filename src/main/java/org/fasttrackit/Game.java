package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Game {

    private Track[] tracks = new Track[3];
    private List<Vehicle> competitors = new ArrayList<Vehicle>();

    public void start() {


        System.out.println("Welcome!");



        initializeTracks();
        displayTracks();

        Track selectedTrack = getSelectedTrackFromUser();
        System.out.println("Selected track: " + selectedTrack.getName());

        initializeCompetitors();

        playOneRound();

    }

    private void playOneRound(){

        System.out.println("New Round");
        for ( Vehicle vehicle : competitors) {
            System.out.println("It's " + vehicle.getName() + "'s turn.");
            double speed = getAccelerationSpeedFromUser();
            vehicle.accelerate(speed);
        }
    }

    private void initializeCompetitors() {

        int playerCount = getPlayerCountFromUser();

        for (int i = 0; i < playerCount; i++) {
            System.out.println("Creating vehicle for player " + (i + 1));
            String name = getVehicleNameFromUser();

            Vehicle vehicle = new Vehicle();
            vehicle.setName(name);
            vehicle.setFuelLevel(80);
            vehicle.setMaxSpeed(260);
            vehicle.setMileage(ThreadLocalRandom.current().nextDouble(5, 15));

            competitors.add(vehicle);
        }
    }

    private void initializeTracks() {

        Track track1 = new Track();
        track1.setName("Imola");
        track1.setLength(3500);

        tracks[0] = track1;

        Track track2 = new Track();
        track2.setName("Suzuka");
        track2.setLength(4100);

        tracks[1] = track2;

    }

    private void displayTracks() {

        System.out.println("Available tracks:");

// classic for loup
        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] != null) {
                System.out.println((i +1) + " . " + tracks[i].getName() + " - " + tracks[i].getLength());
            }
        }
    }

    private Track getSelectedTrackFromUser() {

        System.out.println("Please select a track.");
        Scanner scanner = new Scanner(System.in);
        int trackNumber = scanner.nextInt();
        return tracks[trackNumber - 1];

    }

     private String getVehicleNameFromUser() {

        System.out.println("Please enter vehicle name: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private int getPlayerCountFromUser(){

        System.out.println("Please enter the number of players: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }

    private double getAccelerationSpeedFromUser() {

        System.out.println("Please enter speed:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();

    }

}



