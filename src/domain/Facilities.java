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

    public int getFacilID() {
        return facilID;
    }

    public void setFacilID(int facilID) {
        this.facilID = facilID;
    }

    public String getFacilType() {
        return facilType;
    }

    public void setFacilType(String facilType) {
        this.facilType = facilType;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPRICEPERNIGHT() {
        return PRICEPERNIGHT;
    }

    public void setPRICEPERNIGHT(double PRICEPERNIGHT) {
        this.PRICEPERNIGHT = PRICEPERNIGHT;
    }
}
