package week8;

import java.util.Scanner;

public class Week8 {

    public static void main(String[] args) {
        CarPark cp = new CarPark();
        Scanner scanIn = new Scanner(System.in);

        int state = 1;

        while (state == 1) {
            System.out.println("Please enter a letter from the menu below:");
            System.out.println("A - Add a car");
            System.out.println("B - Remove a car");
            System.out.println("C - Get number of free spaces");
            System.out.println("X - Exit");

            String input = scanIn.nextLine();

            if (input.equals("a")) {
                System.out.println("You have chosen to add a car");
                System.out.println("Please enter a reg number:");
                String reg = scanIn.nextLine();

                Cars c1 = new Cars(reg);

                if (cp.addCar(c1)) {
                    System.out.println("Car was successfully added!");
                } else {
                    System.out.println("Carpark is full");
                }
            } else if (input.equals("b")) {
                System.out.println("You have chosen to remove a car");
                System.out.println("Please enter a reg number:");
                String reg = scanIn.nextLine();

                if (cp.removeCar(reg)) {
                    System.out.println("Car was successfully removed!");
                } else {
                    System.out.println("Car could not be found");
                }
            } else if (input.equals("c")) {
                System.out.println("The number of free spaces is: " + cp.calcEmptySpaces());
            } else if (input.equals("x")) {
                state = 0;
            }

        }
    }
}
