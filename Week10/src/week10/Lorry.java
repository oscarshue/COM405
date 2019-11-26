package week10;

public class Lorry extends Vehicle {

    private double fee = 10;
    protected int weight;

    @Override
    public double CalculateFee() {
        if (weight > 8000) {
            fee = 15;
        }

        return fee;
    }
}
