package org.fasttrackit;

public class Vehicle {
    // static variable
   static int totalVehicleCount;

    //instance variables
   private int racingNumber;  // int pt numere intregi
   private String name;  //string pt siruri,litere
   private int maxSpeed;
   private double mileage;  // double pt numere cu virgula
   private String color;
   private double fuelLevel;
   private boolean damaged; //boolean are numai 2 valori - true sau false
   private double totalDistance;

    public Vehicle(){
        totalVehicleCount++;
    }

    public double accelerate(double speed){
        return accelerate(speed,1);
    }


    public double accelerate (double speed, double durationInHours) {

        if (fuelLevel <= 0) {

            System.out.println(" Not enough fuel.");
            return 0;

        }

        if (speed > maxSpeed) {
            System.out.println(" Max speed exceeded! ");
            return 0;
        } else if (speed == maxSpeed) {
            System.out.println(" Be careful! Max speed reached! ");


        } else {
            System.out.println(" Valid speed entered ");
        }
            double mileageMultiplier = 1;

            if (speed > 120) {
                mileageMultiplier = speed / 100;


            }


            System.out.println(name + " is accelerating with " + speed + " km/h " + durationInHours + " h ");
            // local variables

            double traveledDistance = speed * durationInHours;

            System.out.println(" traveled distance " + traveledDistance);

            totalDistance += traveledDistance;

            System.out.println(" Total traveled distance : " + totalDistance);

            double usedFuel = traveledDistance * mileage / 100;

            usedFuel *= mileageMultiplier;

            fuelLevel = fuelLevel - usedFuel;

            System.out.println(" remainingFuel: " + fuelLevel);

            return traveledDistance;


        }
//        co-variant return type
        protected Vehicle clone(){
        return new Vehicle();
        }


    public int getRacingNumber() {
        return racingNumber;
    }

    public void setRacingNumber(int racingNumber) {
        this.racingNumber = racingNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public boolean isDamaged() {
        return damaged;
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "racingNumber=" + racingNumber +
                ", name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", mileage=" + mileage +
                ", color='" + color + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", damaged=" + damaged +
                ", totalDistance=" + totalDistance +
                '}';
    }
}

