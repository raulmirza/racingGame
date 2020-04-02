package org.fasttrackit;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App

{
    public static void main( String[] args ) {


       Game game = new Game();

       game.start();

// string pool
//       String a = "test";
//       String b = "test";
//       String c = new String("test");
//        System.out.println(a == b);
//        System.out.println(a.equals(c));

// method implementation taken from object's class, not from variable's class

//        Vehicle cheater = new CheatingVehicle();
//        cheater.setName("Cheater");
//        cheater.accelerate(60,1);
//        System.out.println("Total distance: " + cheater.getTotalDistance());
//        ((CheatingVehicle)cheater).fly();
//
//        Vehicle vehicle1 = new Vehicle();
//        Vehicle.totalVehicleCount = 1;
//
//        Vehicle vehicle2 = new Vehicle();
//        Vehicle.totalVehicleCount = 2;
//
//        Vehicle.totalVehicleCount = 50;
//
//        System.out.println("Total count from vehicle1:" + Vehicle.totalVehicleCount);
//        System.out.println("Total count from vehicle1:" + Vehicle.totalVehicleCount);
//        System.out.println("Total vehicle count:" + Vehicle.totalVehicleCount);
//
//        System.out.println(" Please enter vehicle name: ");
//        Scanner scanner = new Scanner(System.in);
//        String userInput = scanner.nextLine();
//        System.out.println(" Entered name: " + userInput);
//
//
//        Scanner scanner2 = new Scanner(System.in);
//        String enteredNumber = scanner2.nextLine();
////
//        System.out.println( "Welcome to the racing game!" );
//
//        Engine engine1 = new Engine();
//        engine1.setManufacturer("VW");
//        engine1.setCapacity(2000);
//
//        Car carReference = new Car(engine1);
//        carReference.setName("Audi");
//        carReference.setColor("red");
//        carReference.setMaxSpeed(260);
//        carReference.setMileage(6.2);
//        carReference.setRacingNumber(8679);
//        carReference.setFuelLevel(12.2);
//        carReference.setDamaged(true);
//
//        System.out.println(carReference);
//
//        System.out.println(" name " + carReference.getName());
//
//        carReference.setEngine(new Engine());
//        carReference.getEngine().setManufacturer("VW");
//        carReference.getEngine().setCapacity(2000);
//
//
//
//
//        double currentDistance = carReference.accelerate (60, 1);
//
//        System.out.println(" Current distance: " + currentDistance);
//
//        Mechanic mechanic = new Mechanic();
//        mechanic.repair(carReference);
//        System.out.println(" Is car damaged? " + carReference.isDamaged());
//
//
//        // One object with two references
//        System.out.println("Engine details");
//        System.out.println(engine1.getCapacity());
//        System.out.println(carReference.getEngine().getCapacity());
//
//        engine1.setCapacity(2100);
//
//        System.out.println("Updated engine details");
//        System.out.println(engine1.getCapacity());
//        System.out.println(carReference.getEngine().getCapacity());
////
////
////
//        // concatenation
//        System.out.println("Properties of " + carReference.getName());  //folosim sout
//        System.out.println("Color: " + carReference.getColor());
//        System.out.println("maxSpeed: " + carReference.getMaxSpeed());
//        System.out.println("mileage: " + carReference.getMileage());
//        System.out.println("Fuel level: " + carReference.getFuelLevel());
//        System.out.println("Racing number: " + carReference.getRacingNumber());
//        System.out.println("Damaged: " + carReference.isDamaged());
//
//        //carReference = null;
//
//        System.out.println(carReference.getName());
//
//        Car car2 = new Car(new Engine());
//        car2.setName("Lamborghini");
//        car2.setDamaged(true);
//
//        System.out.println("Properties of " + car2.getName());
//        System.out.println("Damaged: " + car2.isDamaged());
//        System.out.println("Color: " + car2.getColor());
//
//        System.out.println(4 % 2);
//        System.out.println( 4 % 2 == 0);
//        System.out.println(4 % 3);










    }
}
