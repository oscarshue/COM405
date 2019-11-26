package week10;

public abstract class Vehicle {

    private String regNumber;
    private int weight;

    public abstract double CalculateFee();

    public String GetRegNumber() {
        return regNumber;
    }

    public int GetWeight() {
        return weight;
    }
}
