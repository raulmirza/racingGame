package org.fasttrackit;

public class Vehicle {
    //instance variables
    int racingNumber;  // int pt numere intregi
    String name;  //string pt siruri,litere
    int maxSpeed;
    double mileage;  // double pt numere cu virgula
    String color;
    double fuelLevel;
    boolean damaged; //boolean are numai 2 valori - true sau false
    double totalDistance;

    public double accelerate (double speed, double durationInHours) {

        System.out.println(name + " is accelerating with " + speed + " km/h " + durationInHours + " h " );
        // local variables

        double traveledDistance = speed * durationInHours;

        System.out.println(" traveled distance " + traveledDistance);

        totalDistance += traveledDistance;

        System.out.println(" Total traveled distance : " + totalDistance);

        double usedFuel = traveledDistance * mileage / 100;

        fuelLevel = fuelLevel - usedFuel;

        System.out.println(" remaningFuel: " + fuelLevel);

        return traveledDistance;








    }
}
