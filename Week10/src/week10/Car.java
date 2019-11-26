package week10;

public class Car extends Vehicle {

    private double fee = 5;
    protected int weight;

    @Override
    public double CalculateFee() {
        if (weight > 1590) {
            int weightOver = weight - 1590;
            fee = weightOver * 0.10;
        }
        return fee;
    }
}
