package week10;

public class Bridge {

    private int totalWeight = 0;
    private int maxWeightLimit = 30000;
    private int currentVehicleCount;
    private Vehicle[] vehicle = new Vehicle[20];

    public Bridge() {

    }

    public int CalcTotalWeight() {
        for (int i = 0; i < vehicle.length; i++) {
            if (vehicle[i] != null) {
                totalWeight += vehicle[i].GetWeight();
            }
        }

        return totalWeight;
    }

    public void AddVehicle(String regNumberIn, int weightIn) {
        for (int i = 0; i < vehicle.length; i++) {
            if (vehicle[i] == null) {
                if (currentVehicleCount < vehicle.length && totalWeight < maxWeightLimit) {
                    // Add Vehicle
                } else {
                    // Vehicle not added
                }
                break;
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
