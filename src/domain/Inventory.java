package domain;

public class Inventory {
    private int itemID;
    private int itemTotalAmount;
    private double itemPrice;
    private String itemDescription;
    private String availableFor;
    private String itemName;
    private int ItemAmountInUse;
    private String department;

    public Inventory(int itemID, int itemTotalAmount, double itemPrice, String itemDescription, String availableFor, String itemName, int itemAmountInUse, String department) {
        this.itemID = itemID;
        this.itemTotalAmount = itemTotalAmount;
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
        this.availableFor = availableFor;
        this.itemName = itemName;
        ItemAmountInUse = itemAmountInUse;
        this.department = department;
    }

    public int getItemTotalAmount() {
        return itemTotalAmount;
    }

    public int getItemAmountInUse() {
        return ItemAmountInUse;
    }

    public int availableItems(){
        return this.itemTotalAmount = getItemTotalAmount()-getItemAmountInUse();
    }
}
