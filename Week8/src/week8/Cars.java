package week8;

public class Cars {

    private String reg;
    private String colour;
    private String make;
    private String model;

    public Cars(String regIn, String colourIn, String makeIn, String modelIn) {
        reg = regIn;
        colour = colourIn;
        make = makeIn;
        model = modelIn;
    }

    public String getReg() {
        return reg;
    }
}
