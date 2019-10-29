package week6;
import java.util.Scanner;

public class Week6 {

    public static void main(String[] args) {
        System.out.println("Please select one of the following options:");
        System.out.println("A - Add a car");
        System.out.println("B - Remove a car");
        System.out.println("C - View number of free spaces/number of cars in the car park");
        System.out.println("X - Quit");
        
        Scanner scanIn = new Scanner(System.in);
        String userInput = scanIn.nextLine().toUpperCase();
        scanIn.close();
        
        if(userInput.equals("A"))
        {
        
        } else if(userInput.equals("B"))
        {
        
        } else if(userInput.equals("C"))
        {
        
        } else if(userInput.equals("X"))
        {
        
        }
    }    
}