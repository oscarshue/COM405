package week6;

import java.util.Scanner;

public class Week6 {

    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        String userInput;
        CarPark carPark = new CarPark();
        
        do {
            System.out.println("Please select one of the following options:");
            System.out.println("A - Add a car");
            System.out.println("B - Remove a car");
            System.out.println("C - View number of free spaces");
            System.out.println("X - Quit");
            userInput = scanIn.nextLine().toUpperCase();
            
            if (userInput.equals("A")) {
                carPark.AddCar();
            } else if (userInput.equals("B")) {
                carPark.RemoveCar();
            } else if (userInput.equals("C")) {
                System.out.println(carPark.GetRemainingSpaces() + " remaining spaces.");
            } else if (userInput.equals("X")) {
                System.out.println("Application closing");
            }
        } while (!userInput.equals("X"));

        scanIn.close();
    }
}