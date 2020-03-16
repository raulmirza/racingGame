package org.fasttrackit;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App

{
    public static void main( String[] args ) {


      // Game game = new Game();
     //  game.start();

        Vehicle vehicle1 = new Vehicle();
        vehicle1.totalVehicleCount = 1;

        Vehicle vehicle2 = new Vehicle();
        vehicle2.totalVehicleCount = 2;

        Vehicle.totalVehicleCount = 50;

        System.out.println("Total count from vehicle1:" + vehicle1.totalVehicleCount);
        System.out.println("Total count from vehicle1:" + vehicle2.totalVehicleCount);
        System.out.println("Total vehicle cout:" + vehicle1.totalVehicleCount);

        System.out.println(" Please enter vechicle name: ");
        Scanner scanner = new Scanner(System.in);
        String userImput = scanner.nextLine();
        System.out.println(" Entered name: " + userImput);


        Scanner scanner2 = new Scanner(System.in);
        String enteredNumber = scanner2.nextLine();

        System.out.println( "Welcome to the racing game!" );

        Engine engine1 = new Engine();
        engine1.manufacturer = "VW";
        engine1.capacity = 2000;

        Car carReference = new Car(new Engine());
        carReference.name = "Audi";
        carReference.color = "red";
        carReference.maxSpeed = 260;
        carReference.mileage = 6.2;
        carReference.racingNumber = 8679;
        carReference.fuelLevel = 12.2;
        carReference.damaged = true;

//        carReference.engine = new Engine();
//        carReference.engine.manufacturer = "VW";
//        carReference.engine.capacity = 2000;




        double curentDistance = carReference.accelerate (60, 1);

        System.out.println(" Current distance: " + curentDistance);

        Mechanic mechanic = new Mechanic();
        mechanic.repair(carReference);
        System.out.println(" Is car damaged? " + carReference.damaged);


        // One object with two refernces
        System.out.println("Engine details");
        System.out.println(engine1.capacity);
        System.out.println(carReference.engine.capacity);

        engine1.capacity = 2100;

        System.out.println("Updated engine details");
        System.out.println(engine1.capacity);
        System.out.println(carReference.engine.capacity);



        // concatenation
        System.out.println("Properties of " + carReference.name);  //folosim sout
        System.out.println("Color: " + carReference.color);
        System.out.println("maxSpeed: " + carReference.maxSpeed);
        System.out.println("mileage: " + carReference.mileage);
        System.out.println("Fuel level: " + carReference.fuelLevel);
        System.out.println("Racing number: " + carReference.racingNumber);
        System.out.println("Damaged: " + carReference.damaged);

        //carReference = null;

        System.out.println(carReference.name);

        Car car2 = new Car(new Engine());
        car2.name = "Lambourghini";
        car2.damaged = true;

        System.out.println("Properties of " + car2.name);
        System.out.println("Damaged: " + car2.damaged);
        System.out.println("Color: " + car2.color);

//        System.out.println(4 % 2);
//        System.out.println( 4 % 2 == 0);
//        System.out.println(4 % 3);










    }
}
