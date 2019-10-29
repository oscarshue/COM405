package week6;

public class CarPark {
    private int maxCarParkSpaces = 15;
    private int totalCars;
    private int remainingSpaces;
    
    public void AddCar()
    {
        if(maxCarParkSpaces > remainingSpaces)
        {
            // Enter code here to input car registration here
            totalCars++;
            remainingSpaces = maxCarParkSpaces - totalCars;
            System.out.println("There are " + remainingSpaces + " spaces left.");
        } else 
        {
            System.out.println("The car park is already full");
        }
    }
    
    public void RemoveCar()
    {
        // Enter code here to input car registration
        totalCars--;
        remainingSpaces = maxCarParkSpaces - totalCars;
        System.out.println("There are " + remainingSpaces + " spaces left.");
    }
}