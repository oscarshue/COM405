package week8;

import javax.swing.JTextField;

public class CarPark {

    private Cars[] spaces;

    public CarPark() {
        spaces = new Cars[15];
    }

    public boolean addCar(Cars carIn) {
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i] == null) {
                spaces[i] = carIn;
                return true;
            }
        }
        return false;
    }

    public boolean removeCar(String reg) {
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i] != null) {
                if (spaces[i].getReg().equals(reg)) {
                    spaces[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public int calcEmptySpaces() {
        int tally = 0;
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i] == null) {
                tally++;
            }
        }
        return tally;
    }
}
