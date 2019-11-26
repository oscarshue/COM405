package week10;

public abstract class Vehicle {

    private String regNumber;
    private int weight;

    public Vehicle(String regNumberIn, int weightIn) {
        regNumber = regNumberIn;
        weight = weightIn;
    }

    public abstract double CalculateFee();

    public String GetRegNumber() {
        return regNumber;
    }

    public int GetWeight() {
        return weight;
    }
}
