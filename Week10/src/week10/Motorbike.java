package week10;

public class Motorbike extends Vehicle {

    private double fee = 3;

    public Motorbike(String regNumberIn, int weightIn) {
        super(regNumberIn, weightIn);
    }

    @Override
    public double CalculateFee() {
        return fee;
    }
}
