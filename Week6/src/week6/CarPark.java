package week6;

public class CarPark {
    private int maxCarParkSpaces = 15;
    private int totalCars = 0;
    private int remainingSpaces = 15;
    
    public void AddCar() {
        if (totalCars < maxCarParkSpaces) {
            // Enter code here to input car registration here
            totalCars++;
            remainingSpaces = maxCarParkSpaces - totalCars;
            System.out.println("Car Added; There are " + remainingSpaces + " spaces left.");
        } else {
            System.out.println("The car park is already full");
        }
    }

    public void RemoveCar() {
        // Enter code here to input car registration
        if (totalCars > 0) {
            totalCars--;
            remainingSpaces = maxCarParkSpaces - totalCars;
            System.out.println("There are " + remainingSpaces + " spaces left.");
        } else {
            System.out.println("There are no cars to remove.");
        }
    }

    public int GetRemainingSpaces() {
        return remainingSpaces;
    }
}