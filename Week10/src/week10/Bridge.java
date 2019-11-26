package week10;

public class Bridge {

    private int totalWeight = 0;
    private int maxWeightLimit = 30000;
    private int currentVehicleCount;
    private Vehicle[] vehicle = new Vehicle[20];
    private Motorbike mb;
    private Car car;
    private Lorry lorry;

    public int CalcTotalWeight() {
        for (int i = 0; i < vehicle.length; i++) {
            if (vehicle[i] != null) {
                totalWeight += vehicle[i].GetWeight();
            }
        }

        return totalWeight;
    }

    // Parse a vehicle object via method rather than what is below and handle
    // the addition of the vehicle predomiantly in the gui.
    public void AddVehicle(String regNumberIn, int weightIn) {
        for (int i = 0; i < vehicle.length; i++) {
            if (vehicle[i] == null) {
                if (currentVehicleCount < vehicle.length && totalWeight < maxWeightLimit) {
                    if (weightIn < 3500) {
                        if (weightIn + totalWeight < maxWeightLimit) {
                            mb = new Motorbike(regNumberIn, weightIn);
                        }
                    } else if (weightIn >= 3500 & weightIn < 6000) {
                        if (weightIn + totalWeight < maxWeightLimit) {
                            car = new Car(regNumberIn, weightIn);
                        }
                    } else if (weightIn >= 6000) {
                        if (weightIn + totalWeight < maxWeightLimit) {
                            lorry = new Lorry(regNumberIn, weightIn);
                        }
                    }
                }                
            }
        }
    }

    public void RemoveVehicle(String regNumberIn) {
        for (int i = 0; i < vehicle.length; i++) {
            if (regNumberIn.equals(vehicle[i].GetRegNumber())) {
                vehicle[i] = null;
            }
        }
    }
}
