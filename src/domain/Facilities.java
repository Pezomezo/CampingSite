package domain;

public class Facilities {
    private int facilID;
    private String facilType;
    private double area;
    private double PRICEPERNIGHT;

    public Facilities(int facilID, String facilType, double area, double PRICEPERNIGHT) {
        this.facilID = facilID;
        this.facilType = facilType;
        this.area = area;
        this.PRICEPERNIGHT = PRICEPERNIGHT;
    }
}
